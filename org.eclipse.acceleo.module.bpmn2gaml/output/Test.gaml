model test

/**
* This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
* It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
* to adapt and modify this file as needed.
*/

species test skills : [messaging] {
	int counter_testevents <- 0;
	int counter_a <- 0;
	int counter_b <- 0;
	int counter_c <- 0;
	int counter_d <- 0;
	int counter_b_bis <- 0;
	int counter_a_bis <- 0;
			
	bool flag_intermediate_catch_event_2 <- false;
			
	bool flag_do_a_bis <- false;
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
	bool action_c {
		//TODO
		return false;
	}
	bool action_d {
		//TODO
		return false;
	}
	bool action_b_bis {
		//TODO
		return false;
	}
	bool action_a_bis {
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
	}

	reflex testevents when: (current_process = "testevents") {
		counter_testevents <- counter_testevents + 1;
		
		if ("a" in tasks) {
			if(flag_do_a_bis) {
				if(not ("a_bis" in tasks)) {
					add "a_bis" to: tasks;
				}
			}
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
			bool is_interrupted <- false;
			if("message" in mailbox) {
				is_interrupted <- true;
				if(not ("b_bis" in tasks)) {
					add "b_bis" to: tasks;
				}
			}
			if(not is_interrupted) {
				bool result <- action_b();
				if(result) {
					remove "b" from: tasks;
					counter_b <- counter_b + 1;
					if(not ("merge_a_b" in tasks)) {
						add "merge_a_b" to: tasks;
					}
				}
			}
		}
		if (("merge_a_b" in tasks) and not ("a" in tasks) and not ("b" in tasks)) {
			remove "merge_a_b" from: tasks;
			
		}
		
		if("intermediate_catch_event_1" in mailbox) {
			if(not ("c" in tasks)) {
				add "c" to: tasks;
			}
		}
		if(flag_intermediate_catch_event_2) {
			if(not ("d" in tasks)) {
				add "d" to: tasks;
			}
		}
		if ("c" in tasks) {
			bool result <- action_c();
			if(result) {
				remove "c" from: tasks;
				counter_c <- counter_c + 1;
				//This is created by a throw event, replace self by an agent you want to send something to
				ask self {
				//TODO
				}
			}
		}
		if ("d" in tasks) {
			bool result <- action_d();
			if(result) {
				remove "d" from: tasks;
				counter_d <- counter_d + 1;
				//This is created by a throw event, replace self by an agent you want to send something to
				do send to: self contents: "message";
			}
		}
		
		
		
		
		if ("b_bis" in tasks) {
			bool result <- action_b_bis();
			if(result) {
				remove "b_bis" from: tasks;
				counter_b_bis <- counter_b_bis + 1;
				
			}
		}
		if ("a_bis" in tasks) {
			bool result <- action_a_bis();
			if(result) {
				remove "a_bis" from: tasks;
				counter_a_bis <- counter_a_bis + 1;
				
			}
		}
		
		
		
		
		if(empty(tasks)) {
			current_process <- nil;
		}
	}

}
