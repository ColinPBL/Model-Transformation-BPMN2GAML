model test

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

species test {
	int case_id <- 0;


	/**
	* This is a list of methods derived from the different tasks specified in this agent's BPMN representation
	* They are supposed to be called at each cycle when the agent is doing the corresponding activity
	* Each action returns a boolean indicating if the corresponding task has been completed
	*/

	bool action_a {
		//TODO
		return false;
	}
	bool action_b {
		//TODO
		return false;
	}
	bool action_c {
		//TODO
		return false;
	}
	bool action_d {
		//TODO
		return false;
	}
	bool action_e {
		//TODO
		return false;
	}
	bool action_f {
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
			case_id <- case_id + 1;
			current_process <- "testingtraces";
			if(not ("a" in tasks)) {
				add "a" to: tasks;
			}
		}
	}

	reflex testingtraces when: (current_process = "testingtraces") {
		list<string> next_tasks <- [];
		
		if ("a" in tasks) {
			bool result <- action_a();
			if(result) {
				remove "a" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "A", current_process] to: "event_log.csv" type: csv rewrite: false;
				//Generated from b_or_c
				if(true) {
					if(not ("b" in tasks) and not ("b" in next_tasks)) {
						add "b" to: next_tasks;
					}
				}
				else if(true) {
					if(not ("c" in tasks) and not ("c" in next_tasks)) {
						add "c" to: next_tasks;
					}
				}
			}
		}
		
		if ("b" in tasks) {
			bool result <- action_b();
			if(result) {
				remove "b" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "B", current_process] to: "event_log.csv" type: csv rewrite: false;
				if(not ("merge_b_or_c" in tasks)  and not ("merge_b_or_c" in next_tasks)) {
					add "merge_b_or_c" to: next_tasks;
				}
			}
		}
		if ("c" in tasks) {
			bool result <- action_c();
			if(result) {
				remove "c" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "C", current_process] to: "event_log.csv" type: csv rewrite: false;
				if(not ("merge_b_or_c" in tasks)  and not ("merge_b_or_c" in next_tasks)) {
					add "merge_b_or_c" to: next_tasks;
				}
			}
		}
		if (("merge_b_or_c" in tasks) and not ("b" in tasks) and not ("c" in tasks)) {
			remove "merge_b_or_c" from: tasks;
			//Generated from d_and_e_xor_f
			//Generated from e_or_f
			if(true) {
				if(not ("e" in tasks) and not ("e" in next_tasks)) {
					add "e" to: next_tasks;
				}
			}
			else if(true) {
				if(not ("f" in tasks) and not ("f" in next_tasks)) {
					add "f" to: next_tasks;
				}
			}
			if(not ("d" in tasks) and not ("d" in next_tasks)) {
				add "d" to: next_tasks;
			}
		}
		
		if ("d" in tasks) {
			bool result <- action_d();
			if(result) {
				remove "d" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "D", current_process] to: "event_log.csv" type: csv rewrite: false;
				if(not ("merge_parallel" in tasks)  and not ("merge_parallel" in next_tasks)) {
					add "merge_parallel" to: next_tasks;
				}
			}
		}
		
		if ("e" in tasks) {
			bool result <- action_e();
			if(result) {
				remove "e" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "E", current_process] to: "event_log.csv" type: csv rewrite: false;
				if(not ("merge_e_or_f" in tasks)  and not ("merge_e_or_f" in next_tasks)) {
					add "merge_e_or_f" to: next_tasks;
				}
			}
		}
		if ("f" in tasks) {
			bool result <- action_f();
			if(result) {
				remove "f" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "F", current_process] to: "event_log.csv" type: csv rewrite: false;
				if(not ("merge_e_or_f" in tasks)  and not ("merge_e_or_f" in next_tasks)) {
					add "merge_e_or_f" to: next_tasks;
				}
			}
		}
		if (("merge_e_or_f" in tasks) and not ("e" in tasks) and not ("f" in tasks)) {
			remove "merge_e_or_f" from: tasks;
			if(not ("merge_parallel" in tasks)  and not ("merge_parallel" in next_tasks)) {
				add "merge_parallel" to: next_tasks;
			}
		}
		if (("merge_parallel" in tasks) and not ("d" in tasks) and not ("merge_e_or_f" in tasks)) {
			remove "merge_parallel" from: tasks;
			
		}
		tasks <- tasks + next_tasks;
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
}

