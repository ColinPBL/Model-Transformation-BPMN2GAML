/**
 */
package BPMN4GAMA.util;

import BPMN4GAMA.ANDGateway;
import BPMN4GAMA.Activity;
import BPMN4GAMA.BPMN4GAMAPackage;
import BPMN4GAMA.BoundaryEvent;
import BPMN4GAMA.CatchEvent;
import BPMN4GAMA.EndEvent;
import BPMN4GAMA.Event;
import BPMN4GAMA.FlowElement;
import BPMN4GAMA.FlowElementContainer;
import BPMN4GAMA.FlowNode;
import BPMN4GAMA.Gateway;
import BPMN4GAMA.IntermediateCatchEvent;
import BPMN4GAMA.IntermediateThrowEvent;
import BPMN4GAMA.ORGateway;
import BPMN4GAMA.ResourceRole;
import BPMN4GAMA.SequenceFlow;
import BPMN4GAMA.StartEvent;
import BPMN4GAMA.Subprocess;
import BPMN4GAMA.Task;
import BPMN4GAMA.ThrowEvent;
import BPMN4GAMA.XORGateway;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BPMN4GAMA.BPMN4GAMAPackage
 * @generated
 */
public class BPMN4GAMAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPMN4GAMAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN4GAMAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BPMN4GAMAPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMN4GAMASwitch<Adapter> modelSwitch =
		new BPMN4GAMASwitch<Adapter>() {
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseANDGateway(ANDGateway object) {
				return createANDGatewayAdapter();
			}
			@Override
			public Adapter caseBoundaryEvent(BoundaryEvent object) {
				return createBoundaryEventAdapter();
			}
			@Override
			public Adapter caseCatchEvent(CatchEvent object) {
				return createCatchEventAdapter();
			}
			@Override
			public Adapter caseEndEvent(EndEvent object) {
				return createEndEventAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseFlowElement(FlowElement object) {
				return createFlowElementAdapter();
			}
			@Override
			public Adapter caseFlowElementContainer(FlowElementContainer object) {
				return createFlowElementContainerAdapter();
			}
			@Override
			public Adapter caseFlowNode(FlowNode object) {
				return createFlowNodeAdapter();
			}
			@Override
			public Adapter caseGateway(Gateway object) {
				return createGatewayAdapter();
			}
			@Override
			public Adapter caseIntermediateCatchEvent(IntermediateCatchEvent object) {
				return createIntermediateCatchEventAdapter();
			}
			@Override
			public Adapter caseIntermediateThrowEvent(IntermediateThrowEvent object) {
				return createIntermediateThrowEventAdapter();
			}
			@Override
			public Adapter caseORGateway(ORGateway object) {
				return createORGatewayAdapter();
			}
			@Override
			public Adapter caseProcess(BPMN4GAMA.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseResourceRole(ResourceRole object) {
				return createResourceRoleAdapter();
			}
			@Override
			public Adapter caseSequenceFlow(SequenceFlow object) {
				return createSequenceFlowAdapter();
			}
			@Override
			public Adapter caseStartEvent(StartEvent object) {
				return createStartEventAdapter();
			}
			@Override
			public Adapter caseSubprocess(Subprocess object) {
				return createSubprocessAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseThrowEvent(ThrowEvent object) {
				return createThrowEventAdapter();
			}
			@Override
			public Adapter caseXORGateway(XORGateway object) {
				return createXORGatewayAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.FlowElementContainer <em>Flow Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.FlowElementContainer
	 * @generated
	 */
	public Adapter createFlowElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.SequenceFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.ANDGateway <em>AND Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.ANDGateway
	 * @generated
	 */
	public Adapter createANDGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.XORGateway <em>XOR Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.XORGateway
	 * @generated
	 */
	public Adapter createXORGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.ORGateway <em>OR Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.ORGateway
	 * @generated
	 */
	public Adapter createORGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.CatchEvent
	 * @generated
	 */
	public Adapter createCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.IntermediateCatchEvent
	 * @generated
	 */
	public Adapter createIntermediateCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.BoundaryEvent
	 * @generated
	 */
	public Adapter createBoundaryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.ThrowEvent
	 * @generated
	 */
	public Adapter createThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.EndEvent
	 * @generated
	 */
	public Adapter createEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.IntermediateThrowEvent
	 * @generated
	 */
	public Adapter createIntermediateThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.ResourceRole
	 * @generated
	 */
	public Adapter createResourceRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN4GAMA.Subprocess <em>Subprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN4GAMA.Subprocess
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

} //BPMN4GAMAAdapterFactory
