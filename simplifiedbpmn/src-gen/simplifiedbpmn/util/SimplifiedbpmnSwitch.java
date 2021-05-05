/**
 */
package simplifiedbpmn.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import simplifiedbpmn.ANDGateway;
import simplifiedbpmn.Activity;
import simplifiedbpmn.EndEvent;
import simplifiedbpmn.Event;
import simplifiedbpmn.FlowElement;
import simplifiedbpmn.FlowElementContainer;
import simplifiedbpmn.FlowNode;
import simplifiedbpmn.Gateway;
import simplifiedbpmn.ResourceRole;
import simplifiedbpmn.SequenceFlow;
import simplifiedbpmn.SimplifiedbpmnPackage;
import simplifiedbpmn.StartEvent;
import simplifiedbpmn.Task;
import simplifiedbpmn.XORGateway;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see simplifiedbpmn.SimplifiedbpmnPackage
 * @generated
 */
public class SimplifiedbpmnSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplifiedbpmnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedbpmnSwitch() {
		if (modelPackage == null) {
			modelPackage = SimplifiedbpmnPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SimplifiedbpmnPackage.FLOW_ELEMENT: {
			FlowElement flowElement = (FlowElement) theEObject;
			T result = caseFlowElement(flowElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER: {
			FlowElementContainer flowElementContainer = (FlowElementContainer) theEObject;
			T result = caseFlowElementContainer(flowElementContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.PROCESS: {
			simplifiedbpmn.Process process = (simplifiedbpmn.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = caseFlowElementContainer(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.FLOW_NODE: {
			FlowNode flowNode = (FlowNode) theEObject;
			T result = caseFlowNode(flowNode);
			if (result == null)
				result = caseFlowElement(flowNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.SEQUENCE_FLOW: {
			SequenceFlow sequenceFlow = (SequenceFlow) theEObject;
			T result = caseSequenceFlow(sequenceFlow);
			if (result == null)
				result = caseFlowElement(sequenceFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.GATEWAY: {
			Gateway gateway = (Gateway) theEObject;
			T result = caseGateway(gateway);
			if (result == null)
				result = caseFlowNode(gateway);
			if (result == null)
				result = caseFlowElement(gateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.AND_GATEWAY: {
			ANDGateway andGateway = (ANDGateway) theEObject;
			T result = caseANDGateway(andGateway);
			if (result == null)
				result = caseGateway(andGateway);
			if (result == null)
				result = caseFlowNode(andGateway);
			if (result == null)
				result = caseFlowElement(andGateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.XOR_GATEWAY: {
			XORGateway xorGateway = (XORGateway) theEObject;
			T result = caseXORGateway(xorGateway);
			if (result == null)
				result = caseGateway(xorGateway);
			if (result == null)
				result = caseFlowNode(xorGateway);
			if (result == null)
				result = caseFlowElement(xorGateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseFlowNode(activity);
			if (result == null)
				result = caseFlowElement(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = caseActivity(task);
			if (result == null)
				result = caseFlowNode(task);
			if (result == null)
				result = caseFlowElement(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseFlowNode(event);
			if (result == null)
				result = caseFlowElement(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.START_EVENT: {
			StartEvent startEvent = (StartEvent) theEObject;
			T result = caseStartEvent(startEvent);
			if (result == null)
				result = caseEvent(startEvent);
			if (result == null)
				result = caseFlowNode(startEvent);
			if (result == null)
				result = caseFlowElement(startEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.END_EVENT: {
			EndEvent endEvent = (EndEvent) theEObject;
			T result = caseEndEvent(endEvent);
			if (result == null)
				result = caseEvent(endEvent);
			if (result == null)
				result = caseFlowNode(endEvent);
			if (result == null)
				result = caseFlowElement(endEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplifiedbpmnPackage.RESOURCE_ROLE: {
			ResourceRole resourceRole = (ResourceRole) theEObject;
			T result = caseResourceRole(resourceRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowElement(FlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Element Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowElementContainer(FlowElementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(simplifiedbpmn.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNode(FlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlow(SequenceFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDGateway(ANDGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XOR Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XOR Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXORGateway(XORGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEvent(StartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent(EndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRole(ResourceRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimplifiedbpmnSwitch
