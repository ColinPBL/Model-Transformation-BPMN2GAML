model example_actor

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

species example_actor skills: [messaging] {
	int self_case_id <- 0;


	/**
	* This is a list of methods derived from the different tasks specified in this agent's BPMN representation
	* They are supposed to be called at each cycle when the agent is doing the corresponding activity
	* Each action returns a boolean indicating if the corresponding task has been completed
	*/

	bool action_task_a {
		//TODO
		return false;
	}
	bool action_task_2 {
		//TODO
		return false;
	}
	bool action_task_3 {
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
		if(current_process = nil and not empty(mailbox where (each.contents = "start_event_1"))) {
			message message_received <- any (mailbox where (each.contents = "start_event_1"));
			remove message_received from: mailbox;
			self_case_id <- case_id;
			case_id <- case_id + 1;
			current_process <- "default_process";
			if(not ("task_a" in tasks)) {
				add "task_a" to: tasks;
			}
		}
	}

	reflex default_process when: (current_process = "default_process") {
		list<string> next_tasks <- [];
		
		if ("task_a" in tasks) {
			bool result <- action_task_a();
			if(result) {
				remove "task_a" from: tasks;
				//Writing activity execution to log
				save ["example_actor", self_case_id, "Task A", current_process, name] to: "event_log.csv" type: csv rewrite: false;
				//Generated from exclusive_gateway_1
				if(true) {
					if(not ("task_2" in tasks) and not ("task_2" in next_tasks)) {
						add "task_2" to: next_tasks;
					}
				}
				else if(true) {
					if(not ("task_3" in tasks) and not ("task_3" in next_tasks)) {
						add "task_3" to: next_tasks;
					}
				}
			}
		}
		
		if ("task_2" in tasks) {
			bool result <- action_task_2();
			if(result) {
				remove "task_2" from: tasks;
				//Writing activity execution to log
				save ["example_actor", self_case_id, "Task 2", current_process, name] to: "event_log.csv" type: csv rewrite: false;
				if(not ("exclusive_gateway_2" in tasks)  and not ("exclusive_gateway_2" in next_tasks)) {
					add "exclusive_gateway_2" to: next_tasks;
				}
			}
		}
		if ("task_3" in tasks) {
			bool result <- action_task_3();
			if(result) {
				remove "task_3" from: tasks;
				//Writing activity execution to log
				save ["example_actor", self_case_id, "Task 3", current_process, name] to: "event_log.csv" type: csv rewrite: false;
				if(not ("exclusive_gateway_2" in tasks)  and not ("exclusive_gateway_2" in next_tasks)) {
					add "exclusive_gateway_2" to: next_tasks;
				}
			}
		}
		if (("exclusive_gateway_2" in tasks) and not ("task_3" in tasks) and not ("task_2" in tasks)) {
			remove "exclusive_gateway_2" from: tasks;
			
		}
		tasks <- tasks + next_tasks;
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
}

