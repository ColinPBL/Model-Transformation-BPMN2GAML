model boat_rescuer

/**
* This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
* It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
* to adapt and modify this file as needed.
*/

species boat_rescuer {
	int counter_boat_rescue <- 0;
	int counter_travel_to_village <- 0;
	int counter_look_out_for_blocked_people <- 0;
	int counter_reach_people_in_danger <- 0;
	int counter_embark_people <- 0;
	int counter_reach_secure_location <- 0;
	int counter_disembark_people <- 0;
	bool flag_distress_call <- false;

	/**
	* This is a list of methods derived from the different tasks specified in this agent's BPMN representation
	* They are supposed to be called at each cycle when the agent is doing the corresponding activity
	* Each action returns a boolean indicating if the corresponding task has been completed
	*/

	bool action_travel_to_village {
		//TODO
		return false;
	}
	bool action_look_out_for_blocked_people {
		//TODO
		return false;
	}
	bool action_reach_people_in_danger {
		//TODO
		return false;
	}
	bool action_embark_people {
		//TODO
		return false;
	}
	bool action_reach_secure_location {
		//TODO
		return false;
	}
	bool action_disembark_people {
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
			current_process <- "boat_rescue";
			if(not ("main_loop_gateway" in tasks)) {
				add "main_loop_gateway" to: tasks;
			}
		}
	}

	reflex boat_rescue when: (current_process = "boat_rescue") {
		counter_boat_rescue <- counter_boat_rescue + 1;
		if (("main_loop_gateway" in tasks)  and not ("call_helicopter" in tasks)  ) {
			remove "main_loop_gateway" from: tasks;
			if(not ("travel_to_village" in tasks)) {
				add "travel_to_village" to: tasks;
			}
		}
		if ("travel_to_village" in tasks) {
			bool is_interrupted <- false;
			if(flag_distress_call) {
				is_interrupted <- true;
				if(not ("people_found" in tasks)) {
					add "people_found" to: tasks;
				}
			}
			if(not is_interrupted) {
				bool result <- action_travel_to_village();
				if(result) {
					remove "travel_to_village" from: tasks;
					counter_travel_to_village <- counter_travel_to_village + 1;
					if(not ("look_out_for_blocked_people" in tasks)) {
						add "look_out_for_blocked_people" to: tasks;
					}
				}
			}
		}
		if ("look_out_for_blocked_people" in tasks) {
			bool result <- action_look_out_for_blocked_people();
			if(result) {
				remove "look_out_for_blocked_people" from: tasks;
				counter_look_out_for_blocked_people <- counter_look_out_for_blocked_people + 1;
				if(not ("people_found" in tasks)) {
					add "people_found" to: tasks;
				}
			}
		}
		
		if (("people_found" in tasks) and not ("distress_call" in tasks) and not ("look_out_for_blocked_people" in tasks)) {
			remove "people_found" from: tasks;
			if(not ("reach_people_in_danger" in tasks)) {
				add "reach_people_in_danger" to: tasks;
			}
		}
		if ("reach_people_in_danger" in tasks) {
			bool result <- action_reach_people_in_danger();
			if(result) {
				remove "reach_people_in_danger" from: tasks;
				counter_reach_people_in_danger <- counter_reach_people_in_danger + 1;
				//Generated from need_helicopter
				if(true) {
					if(not ("embark_people" in tasks)) {
						add "embark_people" to: tasks;
					}
				}
				else if(true) {
					if(not ("call_helicopter" in tasks)) {
						add "call_helicopter" to: tasks;
					}
				}
			}
		}
		
		if ("embark_people" in tasks) {
			bool result <- action_embark_people();
			if(result) {
				remove "embark_people" from: tasks;
				counter_embark_people <- counter_embark_people + 1;
				//Generated from boat_full_or_injured_person
				if(true) {
					if(not ("reach_secure_location" in tasks)) {
						add "reach_secure_location" to: tasks;
					}
				}
				else if(true) {
					if(not ("main_loop_gateway" in tasks)) {
						add "main_loop_gateway" to: tasks;
					}
				}
			}
		}
		if("call_helicopter" in tasks) {
			//Generated from a throw event, replace self by the relevant agent
			ask self {
				flag_call_helicopter <- true;
			}
			if(not ("main_loop_gateway" in tasks)) {
				add "main_loop_gateway" to: tasks;
			}
		}
		
		if ("reach_secure_location" in tasks) {
			bool result <- action_reach_secure_location();
			if(result) {
				remove "reach_secure_location" from: tasks;
				counter_reach_secure_location <- counter_reach_secure_location + 1;
				if(not ("disembark_people" in tasks)) {
					add "disembark_people" to: tasks;
				}
			}
		}
		if ("disembark_people" in tasks) {
			bool result <- action_disembark_people();
			if(result) {
				remove "disembark_people" from: tasks;
				counter_disembark_people <- counter_disembark_people + 1;
				//Generated from known_people_in_distress
				if(true) {
					
				}
				else if(true) {
					if(not ("main_loop_gateway" in tasks)) {
						add "main_loop_gateway" to: tasks;
					}
				}
			}
		}
		
		
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
}

