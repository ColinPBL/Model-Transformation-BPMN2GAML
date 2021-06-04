model test

/**
* This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
* It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
* to adapt and modify this file as needed.
*/

//Here we create a log file for the agent for later process mining
global {
	init {
		save ['agent', 'case_id', 'activity', 'cycle'] to:"test.csv" type: csv rewrite:true header:false;
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
			current_process <- "testingtraces";
			if(not ("a" in tasks)) {
				add "a" to: tasks;
			}
		}
	}

	reflex testingtraces when: (current_process = "testingtraces") {
		counter_testingtraces <- counter_testingtraces + 1;
		
		if ("a" in tasks) {
			bool result <- action_a();
			if(result) {
				remove "a" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "A", cycle] to: "test.csv" type: csv rewrite: false;
				//Generated from b_or_c
				if(true) {
					if(not ("b" in tasks)) {
						add "b" to: tasks;
					}
				}
				else if(true) {
					if(not ("c" in tasks)) {
						add "c" to: tasks;
					}
				}
			}
		}
		
		if ("b" in tasks) {
			bool result <- action_b();
			if(result) {
				remove "b" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "B", cycle] to: "test.csv" type: csv rewrite: false;
				if(not ("merge_b_or_c" in tasks)) {
					add "merge_b_or_c" to: tasks;
				}
			}
		}
		if ("c" in tasks) {
			bool result <- action_c();
			if(result) {
				remove "c" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "C", cycle] to: "test.csv" type: csv rewrite: false;
				if(not ("merge_b_or_c" in tasks)) {
					add "merge_b_or_c" to: tasks;
				}
			}
		}
		if (("merge_b_or_c" in tasks) and not ("b" in tasks) and not ("c" in tasks)) {
			remove "merge_b_or_c" from: tasks;
			//Writing activity execution to log
			save [name, case_id, "Merge B or C", cycle] to: "test.csv" type: csv rewrite: false;
			//Generated from d_and_e_xor_f
			//Generated from e_or_f
			if(true) {
				if(not ("e" in tasks)) {
					add "e" to: tasks;
				}
			}
			else if(true) {
				if(not ("f" in tasks)) {
					add "f" to: tasks;
				}
			}
			if(not ("d" in tasks)) {
				add "d" to: tasks;
			}
		}
		
		if ("d" in tasks) {
			bool result <- action_d();
			if(result) {
				remove "d" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "D", cycle] to: "test.csv" type: csv rewrite: false;
				if(not ("merge_parallel" in tasks)) {
					add "merge_parallel" to: tasks;
				}
			}
		}
		
		if ("e" in tasks) {
			bool result <- action_e();
			if(result) {
				remove "e" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "E", cycle] to: "test.csv" type: csv rewrite: false;
				if(not ("merge_e_or_f" in tasks)) {
					add "merge_e_or_f" to: tasks;
				}
			}
		}
		if ("f" in tasks) {
			bool result <- action_f();
			if(result) {
				remove "f" from: tasks;
				//Writing activity execution to log
				save [name, case_id, "F", cycle] to: "test.csv" type: csv rewrite: false;
				if(not ("merge_e_or_f" in tasks)) {
					add "merge_e_or_f" to: tasks;
				}
			}
		}
		if (("merge_e_or_f" in tasks) and not ("e" in tasks) and not ("f" in tasks)) {
			remove "merge_e_or_f" from: tasks;
			//Writing activity execution to log
			save [name, case_id, "Merge E or F", cycle] to: "test.csv" type: csv rewrite: false;
			if(not ("merge_parallel" in tasks)) {
				add "merge_parallel" to: tasks;
			}
		}
		if (("merge_parallel" in tasks) and not ("d" in tasks) and not ("merge_e_or_f" in tasks)) {
			remove "merge_parallel" from: tasks;
			//Writing activity execution to log
			save [name, case_id, "Merge parallel", cycle] to: "test.csv" type: csv rewrite: false;
			
		}
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
}

