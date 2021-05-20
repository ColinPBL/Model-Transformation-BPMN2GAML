model test

/**
* This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
* It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
* to adapt and modify this file as needed.
*/

species test {

	int counter_testevents <- 0;
	int counter_task_1 <- 0;
	int counter_testing_complex_use_cases <- 0;
	int counter_a <- 0;
	int counter_b <- 0;
	int counter_e <- 0;
	int counter_c <- 0;
	int counter_d <- 0;
	int counter_f <- 0;
	int counter_g <- 0;

	/**
	* This is a list of methods derived from the different tasks specified in this agent's BPMN representation
	* They are supposed to be called at each cycle when the agent is doing the corresponding activity
	* Each action returns a boolean indicating if the corresponding task is over
	*/

	bool action_task_1 {
		//TODO
		return false;
	}
	bool action_a {
		//TODO
		return false;
	}
	bool action_b {
		//TODO
		return false;
	}
	bool action_e {
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
	bool action_f {
		//TODO
		return false;
	}
	bool action_g {
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
			current_process <- "testevents";
			if(not ("task_1" in tasks)) {
				add "task_1" to: tasks;
			}
		}
		if (true and current_process = nil) {
			current_process <- "testing_complex_use_cases";
			if(not ("a" in tasks)) {
				add "a" to: tasks;
			}
		}
	}

	reflex testevents when: (current_process = "testevents") {
		counter_testevents <- counter_testevents + 1;
		if ("task_1" in tasks) {
			bool result <- action_task_1();
			if(result) {
				remove "task_1" from: tasks;
				counter_task_1 <- counter_task_1 + 1;
				//Manage your conditions so that one and only one of the following tasks will be active
				if(true) {
					//This is created by a throw event, replace self by an agent you want to send something to
					do send to: self contents: "message";
					if(not ("merge_intermediate_throw_event_2_intermediate_throw_event_1" in tasks)) {
						add "merge_intermediate_throw_event_2_intermediate_throw_event_1" to: tasks;
					}
				}
				else if(true) {
					//This is created by a throw event, replace self by an agent you want to send something to
					ask self {
					//TODO
					}
					if(not ("merge_intermediate_throw_event_2_intermediate_throw_event_1" in tasks)) {
						add "merge_intermediate_throw_event_2_intermediate_throw_event_1" to: tasks;
					}
				}
			}
		}
		
		if (("merge_intermediate_throw_event_2_intermediate_throw_event_1" in tasks) and not ("intermediate_throw_event_2" in tasks) and not ("intermediate_throw_event_1" in tasks)) {
			remove "merge_intermediate_throw_event_2_intermediate_throw_event_1" from: tasks;
		}
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
	reflex testing_complex_use_cases when: (current_process = "testing_complex_use_cases") {
		counter_testing_complex_use_cases <- counter_testing_complex_use_cases + 1;
		if ("a" in tasks) {
			bool result <- action_a();
			if(result) {
				remove "a" from: tasks;
				counter_a <- counter_a + 1;
				//Manage your conditions so that one and only one of the following tasks will be active
				if(true) {
					if(not ("b" in tasks)) {
							add "b" to: tasks;
					}
				}
				else if(true) {
					if(not ("merge_b_exclusive_gateway_1" in tasks)) {
						add "merge_b_exclusive_gateway_1" to: tasks;
					}
				}
			}
		}
		
		if ("b" in tasks) {
			bool result <- action_b();
			if(result) {
				remove "b" from: tasks;
				counter_b <- counter_b + 1;
				if(not ("merge_b_exclusive_gateway_1" in tasks)) {
					add "merge_b_exclusive_gateway_1" to: tasks;
				}
			}
		}
		if (("merge_b_exclusive_gateway_1" in tasks) and not ("b" in tasks) ) {
			remove "merge_b_exclusive_gateway_1" from: tasks;
			if(not ("e" in tasks)) {
					add "e" to: tasks;
			}
			//Manage your conditions so that one and only one of the following tasks will be active
			if(true) {
				if(not ("c" in tasks)) {
						add "c" to: tasks;
				}
			}
			else if(true) {
				if(not ("d" in tasks)) {
						add "d" to: tasks;
				}
			}
			if(not ("f" in tasks)) {
					add "f" to: tasks;
			}
		}
		
		if ("e" in tasks) {
			bool result <- action_e();
			if(result) {
				remove "e" from: tasks;
				counter_e <- counter_e + 1;
				if(not ("merge_exclusive_gateway_4_e_g" in tasks)) {
					add "merge_exclusive_gateway_4_e_g" to: tasks;
				}
			}
		}
		
		if ("c" in tasks) {
			bool result <- action_c();
			if(result) {
				remove "c" from: tasks;
				counter_c <- counter_c + 1;
				if(not ("merge_c_d" in tasks)) {
					add "merge_c_d" to: tasks;
				}
			}
		}
		if ("d" in tasks) {
			bool result <- action_d();
			if(result) {
				remove "d" from: tasks;
				counter_d <- counter_d + 1;
				if(not ("merge_c_d" in tasks)) {
					add "merge_c_d" to: tasks;
				}
			}
		}
		if (("merge_c_d" in tasks) and not ("c" in tasks) and not ("d" in tasks)) {
			remove "merge_c_d" from: tasks;
			if(not ("merge_exclusive_gateway_4_e_g" in tasks)) {
				add "merge_exclusive_gateway_4_e_g" to: tasks;
			}
		}
		if ("f" in tasks) {
			bool result <- action_f();
			if(result) {
				remove "f" from: tasks;
				counter_f <- counter_f + 1;
				if(not ("g" in tasks)) {
						add "g" to: tasks;
				}
			}
		}
		if ("g" in tasks) {
			bool result <- action_g();
			if(result) {
				remove "g" from: tasks;
				counter_g <- counter_g + 1;
				if(not ("merge_exclusive_gateway_4_e_g" in tasks)) {
					add "merge_exclusive_gateway_4_e_g" to: tasks;
				}
			}
		}
		if (("merge_exclusive_gateway_4_e_g" in tasks) and not ("exclusive_gateway_4" in tasks) and not ("e" in tasks) and not ("g" in tasks)) {
			remove "merge_exclusive_gateway_4_e_g" from: tasks;
		}
		if(empty(tasks)) {
			current_process <- nil;
		}
	}

}
