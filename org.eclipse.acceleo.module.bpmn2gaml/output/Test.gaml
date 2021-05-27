model test

/**
* This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
* It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
* to adapt and modify this file as needed.
*/

species test {
	int counter_testmixedgateway <- 0;
	int counter_a <- 0;
	int counter_b <- 0;
	int counter_c <- 0;
	int counter_d <- 0;

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
			current_process <- "testmixedgateway";
			if (not ("mixed_exclusive_gateway_1" in tasks)) {
				add "mixed_exclusive_gateway_1" to: tasks;
			}
		}
	}

	reflex testmixedgateway when: (current_process = "testmixedgateway") {
		counter_testmixedgateway <- counter_testmixedgateway + 1;
		
		if (("mixed_exclusive_gateway_1" in tasks)) {
			remove "mixed_exclusive_gateway_1" from: tasks;
			//Generated from an exclusive gateway
			if(true) {
				if(not ("a" in tasks)) {
					add "a" to: tasks;
				}
			}
			else if(true) {
				if(not ("b" in tasks)) {
					add "b" to: tasks;
				}
			}
		}
		if ("a" in tasks) {
			bool result <- action_a();
			if(result) {
				remove "a" from: tasks;
				counter_a <- counter_a + 1;
				if (not ("mixed_exclusive_gateway_2" in tasks)) {
					add "mixed_exclusive_gateway_2" to: tasks;
				}
			}
		}
		if ("b" in tasks) {
			bool result <- action_b();
			if(result) {
				remove "b" from: tasks;
				counter_b <- counter_b + 1;
				if (not ("mixed_exclusive_gateway_2" in tasks)) {
					add "mixed_exclusive_gateway_2" to: tasks;
				}
			}
		}
		if (("mixed_exclusive_gateway_2" in tasks)) {
			remove "mixed_exclusive_gateway_2" from: tasks;
			//Generated from an exclusive gateway
			if(true) {
				if (not ("mixed_exclusive_gateway_1" in tasks)) {
					add "mixed_exclusive_gateway_1" to: tasks;
				}
			}
			else if(true) {
				if(not ("c" in tasks)) {
					add "c" to: tasks;
				}
			}
		}
		if ("c" in tasks) {
			bool result <- action_c();
			if(result) {
				remove "c" from: tasks;
				counter_c <- counter_c + 1;
				if(not ("d" in tasks)) {
					add "d" to: tasks;
				}
			}
		}
		if ("d" in tasks) {
			bool result <- action_d();
			if(result) {
				remove "d" from: tasks;
				counter_d <- counter_d + 1;
				//Generated from an exclusive gateway
				if(true) {
					
				}
				else if(true) {
					if (not ("mixed_exclusive_gateway_1" in tasks)) {
						add "mixed_exclusive_gateway_1" to: tasks;
					}
				}
			}
		}
		
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
}

