model test

/**
* This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
* It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
* to adapt and modify this file as needed.
*/

species test skills: [messaging] {
	int counter_testsubprocess <- 0;
	int counter_a <- 0;
	int counter_or_process <- 0;
	int counter_test_events <- 0;
	int counter_testevents <- 0;
	int counter_a <- 0;
	int counter_b <- 0;
	int counter_c <- 0;
	int counter_d <- 0;
	int counter_b_bis <- 0;
	int counter_a_bis <- 0;
	int counter_e <- 0;
	bool flag_intermediate_catch_event_2 <- false;
	bool flag_do_a_bis <- false;
	bool flag_intermediate_catch_event_3 <- false;

	bool is_subroutine <- false;
	
	/**
	* This list is used to keep track of currently active subroutines. Whenever a subroutine finishes its execution, it removes itself
	* from the list automatically
	*/
	list<agent> active_subroutines <- nil;

	/**
	* This list is used to keep track of every agent that is currently executing a subprocess asked by this agent
	* The agent remains in the list while its subprocess is active
	*/
	list<agent> active_agents <- nil;

	bool started_subprocess_or_process <- false;
	bool started_subprocess_test_events <- false;

	/**
	* This is a list of methods derived from the different tasks specified in this agent's BPMN representation
	* They are supposed to be called at each cycle when the agent is doing the corresponding activity
	* Each action returns a boolean indicating if the corresponding task has been completed
	*/

	bool action_a {
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
	bool action_e {
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
			current_process <- "testsubprocess";
			//Generated from exclusive_gateway_1
			if(true) {
				if(not ("a" in tasks)) {
					add "a" to: tasks;
				}
			}
			else if(true) {
				if(not ("or_process" in tasks)) {
					add "or_process" to: tasks;
				}
			}
			else if(true) {
				if(not ("test_events" in tasks)) {
					add "test_events" to: tasks;
				}
			}
		}
		if (true and current_process = nil) {
			current_process <- "testevents";
			//Generated from exclusive_gateway_1
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

	reflex testsubprocess when: (current_process = "testsubprocess") {
		counter_testsubprocess <- counter_testsubprocess + 1;
		
		
		if ("a" in tasks) {
			bool result <- action_a();
			if(result) {
				remove "a" from: tasks;
				counter_a <- counter_a + 1;
				if(not ("exclusive_gateway_2" in tasks)) {
					add "exclusive_gateway_2" to: tasks;
				}
			}
		}
		if ("or_process" in tasks) {
			if(not started_subprocess_or_process) {
				ask any(boat_rescuer where(each.current_process = nil)) {
				current_process <- "testor";
				add self to: myself.active_agents;
				}
				started_subprocess_or_process <- true;
			}
			if(empty(active_agents of_species boat_rescuer where (each.current_process = "or_process"))) {
				remove "or_process" from: tasks;
				counter_or_process <- counter_or_process + 1;
				if(not ("exclusive_gateway_2" in tasks)) {
					add "exclusive_gateway_2" to: tasks;
				}
				started_subprocess_or_process <- false;
			}
		}
		if (("exclusive_gateway_2" in tasks) and not ("a" in tasks) and not ("or_process" in tasks) and not ("test_events" in tasks)) {
			remove "exclusive_gateway_2" from: tasks;
			
		}
		if ("test_events" in tasks) {
			if(not started_subprocess_test_events) {
				/**
				* A subroutine species inheriting from this species is created to handle the subprocess execution
				* However, you have to specify which relevant variables should be copied by using with: [attribute_in_subspecies::attribute_in_species]
				*/
				create subroutine_test number: 1 with: [] {
					add self to: myself.active_subroutines;
					calling_agent <- myself;
				}
				started_subprocess_test_events <- true;
			}
			if(empty(active_subroutines where (each.current_process = "test_events"))) {
				remove "test_events" from: tasks;
				counter_test_events <- counter_test_events + 1;
				if(not ("exclusive_gateway_2" in tasks)) {
					add "exclusive_gateway_2" to: tasks;
				}
				started_subprocess_test_events <- false;
			}
		}
		if(empty(tasks)) {
			current_process <- nil;
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
				if(not ("exclusive_gateway_2" in tasks)) {
					add "exclusive_gateway_2" to: tasks;
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
					if(not ("exclusive_gateway_2" in tasks)) {
						add "exclusive_gateway_2" to: tasks;
					}
				}
			}
		}
		if (("exclusive_gateway_2" in tasks) and not ("a" in tasks) and not ("b" in tasks)) {
			remove "exclusive_gateway_2" from: tasks;
			
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
				if(not ("intermediate_throw_event_1" in tasks)) {
					add "intermediate_throw_event_1" to: tasks;
				}
			}
		}
		if ("d" in tasks) {
			bool result <- action_d();
			if(result) {
				remove "d" from: tasks;
				counter_d <- counter_d + 1;
				if(not ("intermediate_throw_event_2" in tasks)) {
					add "intermediate_throw_event_2" to: tasks;
				}
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
		
		
		if("intermediate_throw_event_1" in tasks) {
			//Generated from a throw event, replace self by the relevant agent
			ask self {
				flag_intermediate_throw_event_1 <- true;
			}
			
		}
		if("intermediate_throw_event_2" in tasks) {
			//Generated from a throw event, replace self by the relevant agent
			do send to: self content: "message";
			remove "intermediate_throw_event_2" from: tasks;
			
		}
		if(flag_intermediate_catch_event_3) {
			if(not ("e" in tasks)) {
				add "e" to: tasks;
			}
		}
		if ("e" in tasks) {
			bool result <- action_e();
			if(result) {
				remove "e" from: tasks;
				counter_e <- counter_e + 1;
				if(not ("intermediate_catch_event_4" in tasks)) {
					add "intermediate_catch_event_4" to: tasks;
				}
			}
		}
		if("intermediate_catch_event_4" in tasks) {
			if("intermediate_catch_event_4" in mailbox) {
				
			}
		}
		
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
}

species subroutine_test parent: test{
	bool is_subroutine <- true;
	zgent calling_agent <- nil;
	
	reflex die when: current_process = nil {
		ask test(calling_agent) {
			remove myself from: self.active_subroutines;
		}
		do die;
	}
}
