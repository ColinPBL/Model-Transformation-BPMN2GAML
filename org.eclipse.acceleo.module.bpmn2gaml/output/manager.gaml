model manager

/**
* This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
* It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
* to adapt and modify this file as needed.
*/

//Here we create a log file for later process mining
global {
	init {
		save ['agent', 'case_id', 'activity', 'process'] to:"event_log.csv" type: csv rewrite:true header:false;
	}
}

species manager {
	int case_id <- 0;

	bool is_subroutine <- false;
	
	/**
	* This list is used to keep track of currently active subroutines. Whenever a subroutine finishes its execution, it removes itself
	* from the list automatically
	*/
	list<agent> active_subroutines <- [];

	//This map is used to keep track of every agent that is currently executing a subprocess
	map<string, list<agent>> active_agents <- [];

	bool started_subprocess_ranger_magasin <- false;
	bool started_subprocess_gerer_la_caisse <- false;

	/**
	* This is a list of methods derived from the different tasks specified in this agent's BPMN representation
	* They are supposed to be called at each cycle when the agent is doing the corresponding activity
	* Each action returns a boolean indicating if the corresponding task has been completed
	*/

	bool action_scanner_articles {
		//TODO
		return false;
	}
	bool action_encaisser_paiement {
		//TODO
		return false;
	}

	//This string is used to determine which process the agent is currently doing
	string current_process <- nil;

	//This list is used to keep track of which task(s) the agent is currently doing
	list<string> tasks <- [];
	reflex idle when: (current_process = nil) and not is_subroutine {
		/**
		* This is where the agent will look at its environment and decide which process to use
		* For each process, replace "true" by the corresponding condition
		*/
		if (true and current_process = nil) {
			case_id <- case_id + 1;
			current_process <- "gerer_la_caisse";
			if(not ("scanner_articles" in tasks)) {
				add "scanner_articles" to: tasks;
			}
		}
		if (true and current_process = nil) {
			case_id <- case_id + 1;
			current_process <- "gerer_le_magasin";
			//Generated from parallel_gateway_1
			if(not ("ranger_magasin" in tasks)) {
				add "ranger_magasin" to: tasks;
			}
			if(not ("gerer_la_caisse" in tasks)) {
				add "gerer_la_caisse" to: tasks;
			}
		}
	}

	reflex gerer_la_caisse when: (current_process = "gerer_la_caisse") {
		list<string> next_tasks <- [];
		
		if ("scanner_articles" in tasks) {
			bool result <- action_scanner_articles();
			if(result) {
				remove "scanner_articles" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "Scanner articles", current_process] to: "event_log.csv" type: csv rewrite: false;
				if(not ("encaisser_paiement" in tasks) and not ("encaisser_paiement" in next_tasks)) {
					add "encaisser_paiement" to: next_tasks;
				}
			}
		}
		if ("encaisser_paiement" in tasks) {
			bool result <- action_encaisser_paiement();
			if(result) {
				remove "encaisser_paiement" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "Encaisser paiement", current_process] to: "event_log.csv" type: csv rewrite: false;
				
			}
		}
		tasks <- tasks + next_tasks;
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
	reflex gerer_le_magasin when: (current_process = "gerer_le_magasin") {
		list<string> next_tasks <- [];
		
		
		if ("ranger_magasin" in tasks) {
			if(not started_subprocess_ranger_magasin) {
				ask any(employe where(each.current_process = nil)) {
				current_process <- "ranger_magasin";
				if(not ("ranger" in tasks)) {
					add "ranger" to: tasks;
				}
				add self at: "ranger_magasin" to: myself.active_agents;
				}
				started_subprocess_ranger_magasin <- true;
			}
			list<agent> agents_for_subprocess <- active_agents["ranger_magasin"] where (employe(each).current_process = "ranger_magasin");
			active_agents["ranger_magasin"]] <- agents_for_subprocess;
			if(empty (agents_for_subprocess)) {
				remove "ranger_magasin" from: tasks;
				if(not ("parallel_gateway_2" in tasks)  and not ("parallel_gateway_2" in next_tasks)) {
					add "parallel_gateway_2" to: next_tasks;
				}
				started_subprocess_ranger_magasin <- false;
			}
		}
		if ("gerer_la_caisse" in tasks) {
			if(not started_subprocess_gerer_la_caisse) {
				/**
				* A subroutine species inheriting from this species is created to handle the subprocess execution
				* However, you have to specify which relevant variables should be copied by using with: [attribute_in_subspecies::attribute_in_species]
				*/
				create subroutine_manager number: 1 with: [] {
					add self to: myself.active_subroutines;
					calling_agent <- myself;
					current_process <- gerer_la_caisse;
					if(not ("scanner_articles" in tasks)) {
						add "scanner_articles" to: tasks;
					}
				}
				started_subprocess_gerer_la_caisse <- true;
			}
			if(empty(active_subroutines of_species subroutine_manager where (each.current_process = "gerer_la_caisse"))) {
				remove "gerer_la_caisse" from: tasks;
				if(not ("parallel_gateway_2" in tasks)  and not ("parallel_gateway_2" in next_tasks)) {
					add "parallel_gateway_2" to: next_tasks;
				}
				started_subprocess_gerer_la_caisse <- false;
			}
		}
		if (("parallel_gateway_2" in tasks) and not ("ranger_magasin" in tasks) and not ("gerer_la_caisse" in tasks)) {
			remove "parallel_gateway_2" from: tasks;
			
		}
		tasks <- tasks + next_tasks;
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
}

species subroutine_manager parent: manager{
	bool is_subroutine <- true;
	agent calling_agent <- nil;
	
	reflex die when: current_process = nil {
		ask manager(calling_agent) {
			remove myself from: self.active_subroutines;
		}
		do die;
	}
}
