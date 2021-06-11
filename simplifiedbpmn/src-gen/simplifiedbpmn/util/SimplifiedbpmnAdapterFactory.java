/**
 */
package simplifiedbpmn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simplifiedbpmn.ANDGateway;
import simplifiedbpmn.Activity;
import simplifiedbpmn.BoundaryEvent;
import simplifiedbpmn.CatchEvent;
import simplifiedbpmn.EndEvent;
import simplifiedbpmn.Event;
import simplifiedbpmn.FlowElement;
import simplifiedbpmn.FlowElementContainer;
import simplifiedbpmn.FlowNode;
import simplifiedbpmn.Gateway;
import simplifiedbpmn.IntermediateCatchEvent;
import simplifiedbpmn.IntermediateThrowEvent;
import simplifiedbpmn.ORGateway;
import simplifiedbpmn.ResourceRole;
import simplifiedbpmn.SequenceFlow;
import simplifiedbpmn.SimplifiedbpmnPackage;
import simplifiedbpmn.StartEvent;
import simplifiedbpmn.Subprocess;
import simplifiedbpmn.Task;
import simplifiedbpmn.ThrowEvent;
import simplifiedbpmn.XORGateway;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simplifiedbpmn.SimplifiedbpmnPackage
 * @generated
 */
public class SimplifiedbpmnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplifiedbpmnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedbpmnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimplifiedbpmnPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplifiedbpmnSwitch<Adapter> modelSwitch = new SimplifiedbpmnSwitch<Adapter>() {
		@Override
		public Adapter caseFlowElement(FlowElement object) {
			return createFlowElementAdapter();
		}

		@Override
		public Adapter caseFlowElementContainer(FlowElementContainer object) {
			return createFlowElementContainerAdapter();
		}

		@Override
		public Adapter caseProcess(simplifiedbpmn.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseFlowNode(FlowNode object) {
			return createFlowNodeAdapter();
		}

		@Override
		public Adapter caseSequenceFlow(SequenceFlow object) {
			return createSequenceFlowAdapter();
		}

		@Override
		public Adapter caseGateway(Gateway object) {
			return createGatewayAdapter();
		}

		@Override
		public Adapter caseANDGateway(ANDGateway object) {
			return createANDGatewayAdapter();
		}

		@Override
		public Adapter caseXORGateway(XORGateway object) {
			return createXORGatewayAdapter();
		}

		@Override
		public Adapter caseORGateway(ORGateway object) {
			return createORGatewayAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseCatchEvent(CatchEvent object) {
			return createCatchEventAdapter();
		}

		@Override
		public Adapter caseStartEvent(StartEvent object) {
			return createStartEventAdapter();
		}

		@Override
		public Adapter caseIntermediateCatchEvent(IntermediateCatchEvent object) {
			return createIntermediateCatchEventAdapter();
		}

		@Override
		public Adapter caseBoundaryEvent(BoundaryEvent object) {
			return createBoundaryEventAdapter();
		}

		@Override
		public Adapter caseThrowEvent(ThrowEvent object) {
			return createThrowEventAdapter();
		}

		@Override
		public Adapter caseEndEvent(EndEvent object) {
			return createEndEventAdapter();
		}

		@Override
		public Adapter caseIntermediateThrowEvent(IntermediateThrowEvent object) {
			return createIntermediateThrowEventAdapter();
		}

		@Override
		public Adapter caseResourceRole(ResourceRole object) {
			return createResourceRoleAdapter();
		}

		@Override
		public Adapter caseSubprocess(Subprocess object) {
			return createSubprocessAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.FlowElementContainer <em>Flow Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.FlowElementContainer
	 * @generated
	 */
	public Adapter createFlowElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.SequenceFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.ANDGateway <em>AND Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.ANDGateway
	 * @generated
	 */
	public Adapter createANDGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.XORGateway <em>XOR Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.XORGateway
	 * @generated
	 */
	public Adapter createXORGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.ORGateway <em>OR Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.ORGateway
	 * @generated
	 */
	public Adapter createORGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.CatchEvent
	 * @generated
	 */
	public Adapter createCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.IntermediateCatchEvent
	 * @generated
	 */
	public Adapter createIntermediateCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.BoundaryEvent
	 * @generated
	 */
	public Adapter createBoundaryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.ThrowEvent
	 * @generated
	 */
	public Adapter createThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.EndEvent
	 * @generated
	 */
	public Adapter createEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.IntermediateThrowEvent
	 * @generated
	 */
	public Adapter createIntermediateThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.ResourceRole
	 * @generated
	 */
	public Adapter createResourceRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplifiedbpmn.Subprocess <em>Subprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplifiedbpmn.Subprocess
	 * @generated
	 */
	public Adapter createSubprocessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimplifiedbpmnAdapterFactory
