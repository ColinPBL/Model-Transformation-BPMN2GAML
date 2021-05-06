model citizen

/*This model is the result of a transformation from a BPMN representation of a ResourceRole to a GAML species skeleton
It has been automatically generated from a specification, and may not be exactly suited to your modeling needs. Feel free
to adapt and modify this file as needed.
*/

species citizen {

	/*This is a list of methods derived from the different tasks specified in this agent's BPMN representation
	They are supposed to be called at each cycle when the agent is doing the corresponding activity
	Each action returns a boolean indicating if the corresponding task is over
	By default, generated actions do not take any parameter, but you are free to add some if necessary
	*/

	bool action_go_to_work {
		//TODO
		return true;
	}
	bool action_work {
		//TODO
		return true;
	}
	bool action_go_home {
		//TODO
		return true;
	}

	//This list is used to keep track of which task(s) the agent is currently doing
	list<string> tasks <- [];

	/*These reflexes have been generated in order to follow the BPMN diagram logic
	At each cycle, whenever an agent is doing a task, the corresponding reflex is called
	*/

	reflex idle when: (empty(tasks)) {
		//TODO what the agent is doing when it is not executing a process
		//This is where the agent will evaluate its environment to determine which process
		//is best suited to its current state
	}

	//REFLEXES RELATED TO PROCESS citizen_process
	
	reflex go_to_work when:("go_to_work" in tasks) {
	
		bool result <- action_go_to_work();
	
		if(result) {
			remove "go_to_work" from: tasks;
			add "work" to: tasks;
		}		
	}
	reflex work when:("work" in tasks) {
	
		bool result <- action_work();
	
		if(result) {
			remove "work" from: tasks;
			add "go_home" to: tasks;
		}		
	}
	reflex go_home when:("go_home" in tasks) {
	
		bool result <- action_go_home();
	
		if(result) {
			remove "go_home" from: tasks;
		}		
	}
	//END OF REFLEXES RELATED TO PROCESS citizen_process

}
