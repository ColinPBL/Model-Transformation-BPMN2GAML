/**
 */
package BPMN4GAMA.impl;

import BPMN4GAMA.ANDGateway;
import BPMN4GAMA.BPMN4GAMAFactory;
import BPMN4GAMA.BPMN4GAMAPackage;
import BPMN4GAMA.BoundaryEvent;
import BPMN4GAMA.EndEvent;
import BPMN4GAMA.EventType;
import BPMN4GAMA.GatewayDirection;
import BPMN4GAMA.IntermediateCatchEvent;
import BPMN4GAMA.IntermediateThrowEvent;
import BPMN4GAMA.ORGateway;
import BPMN4GAMA.ResourceRole;
import BPMN4GAMA.SequenceFlow;
import BPMN4GAMA.StartEvent;
import BPMN4GAMA.Subprocess;
import BPMN4GAMA.Task;
import BPMN4GAMA.XORGateway;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMN4GAMAFactoryImpl extends EFactoryImpl implements BPMN4GAMAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPMN4GAMAFactory init() {
		try {
			BPMN4GAMAFactory theBPMN4GAMAFactory = (BPMN4GAMAFactory)EPackage.Registry.INSTANCE.getEFactory(BPMN4GAMAPackage.eNS_URI);
			if (theBPMN4GAMAFactory != null) {
				return theBPMN4GAMAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPMN4GAMAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN4GAMAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BPMN4GAMAPackage.AND_GATEWAY: return createANDGateway();
			case BPMN4GAMAPackage.BOUNDARY_EVENT: return createBoundaryEvent();
			case BPMN4GAMAPackage.END_EVENT: return createEndEvent();
			case BPMN4GAMAPackage.INTERMEDIATE_CATCH_EVENT: return createIntermediateCatchEvent();
			case BPMN4GAMAPackage.INTERMEDIATE_THROW_EVENT: return createIntermediateThrowEvent();
			case BPMN4GAMAPackage.OR_GATEWAY: return createORGateway();
			case BPMN4GAMAPackage.PROCESS: return createProcess();
			case BPMN4GAMAPackage.RESOURCE_ROLE: return createResourceRole();
			case BPMN4GAMAPackage.SEQUENCE_FLOW: return createSequenceFlow();
			case BPMN4GAMAPackage.START_EVENT: return createStartEvent();
			case BPMN4GAMAPackage.SUBPROCESS: return createSubprocess();
			case BPMN4GAMAPackage.TASK: return createTask();
			case BPMN4GAMAPackage.XOR_GATEWAY: return createXORGateway();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BPMN4GAMAPackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case BPMN4GAMAPackage.GATEWAY_DIRECTION:
				return createGatewayDirectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BPMN4GAMAPackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case BPMN4GAMAPackage.GATEWAY_DIRECTION:
				return convertGatewayDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMN4GAMA.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ANDGateway createANDGateway() {
		ANDGatewayImpl andGateway = new ANDGatewayImpl();
		return andGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XORGateway createXORGateway() {
		XORGatewayImpl xorGateway = new XORGatewayImpl();
		return xorGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ORGateway createORGateway() {
		ORGatewayImpl orGateway = new ORGatewayImpl();
		return orGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateCatchEvent createIntermediateCatchEvent() {
		IntermediateCatchEventImpl intermediateCatchEvent = new IntermediateCatchEventImpl();
		return intermediateCatchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryEvent createBoundaryEvent() {
		BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();
		return boundaryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateThrowEvent createIntermediateThrowEvent() {
		IntermediateThrowEventImpl intermediateThrowEvent = new IntermediateThrowEventImpl();
		return intermediateThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceRole createResourceRole() {
		ResourceRoleImpl resourceRole = new ResourceRoleImpl();
		return resourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subprocess createSubprocess() {
		SubprocessImpl subprocess = new SubprocessImpl();
		return subprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayDirection createGatewayDirectionFromString(EDataType eDataType, String initialValue) {
		GatewayDirection result = GatewayDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMN4GAMAPackage getBPMN4GAMAPackage() {
		return (BPMN4GAMAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BPMN4GAMAPackage getPackage() {
		return BPMN4GAMAPackage.eINSTANCE;
	}

} //BPMN4GAMAFactoryImpl
