model livreur

/**
* This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
* It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
* to adapt and modify this file as needed.
*/

global {
	//This global variable is used in logs and should not be modified
	int case_id <- 0;
	init {
		//Here we create a log file for later process mining
		save ['resource', 'case_id', 'activity', 'process', 'agent_id'] to:"event_log.csv" type: csv rewrite:true header:false;
	}
}

species livreur {
	int self_case_id <- 0;


	/**
	* This is a list of methods derived from the different tasks specified in this agent's BPMN representation
	* They are supposed to be called at each cycle when the agent is doing the corresponding activity
	* Each action returns a boolean indicating if the corresponding task has been completed
	*/

	bool action_livrer_les_marchandises {
		//TODO
		return false;
	}

	//This string is used to determine which process the agent is currently doing
	string current_process <- nil;

	//This list is used to keep track of which task(s) the agent is currently doing
	list<string> tasks <- [];
	reflex idle when: (current_process = nil) {
		/**
		* This is where the agent will look at its environment and decide which process to use
		* For each process, replace "true" by the corresponding condition
		*/
		if (true and current_process = nil) {
			self_case_id <- case_id;
			case_id <- case_id + 1;
			current_process <- "livrer_marchandises";
			if(not ("livrer_les_marchandises" in tasks)) {
				add "livrer_les_marchandises" to: tasks;
			}
		}
	}

	reflex livrer_marchandises when: (current_process = "livrer_marchandises") {
		list<string> next_tasks <- [];
		
		if ("livrer_les_marchandises" in tasks) {
			bool result <- action_livrer_les_marchandises();
			if(result) {
				remove "livrer_les_marchandises" from: tasks;
				//Writing activity execution to log
				save ["livreur", self_case_id, "Livrer les marchandises", current_process, name] to: "event_log.csv" type: csv rewrite: false;
				
			}
		}
		tasks <- tasks + next_tasks;
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
}

