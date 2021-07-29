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
	bool action_task_b {
		//TODO
		return false;
	}
	bool action_task_c {
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
			current_process <- "example_process";
			if(not ("task_a" in tasks)) {
				add "task_a" to: tasks;
			}
		}
	}

	reflex example_process when: (current_process = "example_process") {
		list<string> next_tasks <- [];
		
		if ("task_a" in tasks) {
			bool result <- action_task_a();
			if(result) {
				remove "task_a" from: tasks;
				//Writing activity execution to log
				save ["example_actor", self_case_id, "Task A", current_process, name] to: "event_log.csv" type: csv rewrite: false;
				//Generated from b_or_c
				if(true) {
					if(not ("task_b" in tasks) and not ("task_b" in next_tasks)) {
						add "task_b" to: next_tasks;
					}
				}
				else if(true) {
					if(not ("task_c" in tasks) and not ("task_c" in next_tasks)) {
						add "task_c" to: next_tasks;
					}
				}
			}
		}
		
		if ("task_b" in tasks) {
			bool result <- action_task_b();
			if(result) {
				remove "task_b" from: tasks;
				//Writing activity execution to log
				save ["example_actor", self_case_id, "Task B", current_process, name] to: "event_log.csv" type: csv rewrite: false;
				if(not ("merge_b_or_c" in tasks)  and not ("merge_b_or_c" in next_tasks)) {
					add "merge_b_or_c" to: next_tasks;
				}
			}
		}
		if ("task_c" in tasks) {
			bool result <- action_task_c();
			if(result) {
				remove "task_c" from: tasks;
				//Writing activity execution to log
				save ["example_actor", self_case_id, "Task C", current_process, name] to: "event_log.csv" type: csv rewrite: false;
				if(not ("merge_b_or_c" in tasks)  and not ("merge_b_or_c" in next_tasks)) {
					add "merge_b_or_c" to: next_tasks;
				}
			}
		}
		if (("merge_b_or_c" in tasks) and not ("task_c" in tasks) and not ("task_b" in tasks)) {
			remove "merge_b_or_c" from: tasks;
			
		}
		tasks <- tasks + next_tasks;
		if(empty(tasks)) {
			current_process <- nil;
		}
	}
}

