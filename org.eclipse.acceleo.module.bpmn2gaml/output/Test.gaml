model test

/**
* This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
* It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
* to adapt and modify this file as needed.
*/

species test {

	int counter_testor <- 0;
	int counter_a <- 0;
	int counter_b <- 0;

	/**
	* This is a list of methods derived from the different tasks specified in this agent's BPMN representation
	* They are supposed to be called at each cycle when the agent is doing the corresponding activity
	* Each action returns a boolean indicating if the corresponding task is over
	*/

	bool action_a {
		//TODO
		return false;
	}
	bool action_b {
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
			current_process <- "testor";
			if(true) {
				add "a" to: tasks;
			}
			
			if(true) {
				add "b" to: tasks;
			}
		}
	}

	reflex testor when: (current_process = "testor") {
		counter_testor <- counter_testor + 1;
		
		if ("a" in tasks) {
			bool result <- action_a();
		
			if(result) {
				remove "a" from: tasks;
				counter_a <- counter_a + 1;
				if(not ("merge_a_b" in tasks)) {
					add "merge_a_b" to: tasks;
				}
			}		
		}
		if ("b" in tasks) {
			bool result <- action_b();
		
			if(result) {
				remove "b" from: tasks;
				counter_b <- counter_b + 1;
				if(not ("merge_a_b" in tasks)) {
					add "merge_a_b" to: tasks;
				}
			}		
		}
		if (("merge_a_b" in tasks) and not ("a" in tasks) and not ("b" in tasks)) {
			remove "merge_a_b" from: tasks;
			current_process <- nil;
		}
	}

}
