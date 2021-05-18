/**
 */
package simplifiedbpmn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simplifiedbpmn.ANDGateway;
import simplifiedbpmn.EndEvent;
import simplifiedbpmn.GatewayDirection;
import simplifiedbpmn.ORGateway;
import simplifiedbpmn.ResourceRole;
import simplifiedbpmn.SequenceFlow;
import simplifiedbpmn.SimplifiedbpmnFactory;
import simplifiedbpmn.SimplifiedbpmnPackage;
import simplifiedbpmn.StartEvent;
import simplifiedbpmn.Task;
import simplifiedbpmn.XORGateway;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplifiedbpmnFactoryImpl extends EFactoryImpl implements SimplifiedbpmnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplifiedbpmnFactory init() {
		try {
			SimplifiedbpmnFactory theSimplifiedbpmnFactory = (SimplifiedbpmnFactory) EPackage.Registry.INSTANCE
					.getEFactory(SimplifiedbpmnPackage.eNS_URI);
			if (theSimplifiedbpmnFactory != null) {
				return theSimplifiedbpmnFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplifiedbpmnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedbpmnFactoryImpl() {
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
		case SimplifiedbpmnPackage.PROCESS:
			return createProcess();
		case SimplifiedbpmnPackage.SEQUENCE_FLOW:
			return createSequenceFlow();
		case SimplifiedbpmnPackage.AND_GATEWAY:
			return createANDGateway();
		case SimplifiedbpmnPackage.XOR_GATEWAY:
			return createXORGateway();
		case SimplifiedbpmnPackage.OR_GATEWAY:
			return createORGateway();
		case SimplifiedbpmnPackage.TASK:
			return createTask();
		case SimplifiedbpmnPackage.START_EVENT:
			return createStartEvent();
		case SimplifiedbpmnPackage.END_EVENT:
			return createEndEvent();
		case SimplifiedbpmnPackage.RESOURCE_ROLE:
			return createResourceRole();
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
		case SimplifiedbpmnPackage.GATEWAY_DIRECTION:
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
		case SimplifiedbpmnPackage.GATEWAY_DIRECTION:
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
	public simplifiedbpmn.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDGateway createANDGateway() {
		ANDGatewayImpl andGateway = new ANDGatewayImpl();
		return andGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XORGateway createXORGateway() {
		XORGatewayImpl xorGateway = new XORGatewayImpl();
		return xorGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORGateway createORGateway() {
		ORGatewayImpl orGateway = new ORGatewayImpl();
		return orGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole createResourceRole() {
		ResourceRoleImpl resourceRole = new ResourceRoleImpl();
		return resourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayDirection createGatewayDirectionFromString(EDataType eDataType, String initialValue) {
		GatewayDirection result = GatewayDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public SimplifiedbpmnPackage getSimplifiedbpmnPackage() {
		return (SimplifiedbpmnPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplifiedbpmnPackage getPackage() {
		return SimplifiedbpmnPackage.eINSTANCE;
	}

} //SimplifiedbpmnFactoryImpl
