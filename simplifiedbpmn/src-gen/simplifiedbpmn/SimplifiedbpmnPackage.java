/**
 */
package simplifiedbpmn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see simplifiedbpmn.SimplifiedbpmnFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface SimplifiedbpmnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplifiedbpmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cpoubel.org/simplifiedbpmn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplifiedbpmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplifiedbpmnPackage eINSTANCE = simplifiedbpmn.impl.SimplifiedbpmnPackageImpl.init();

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.FlowElementImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.FlowElementContainerImpl <em>Flow Element Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.FlowElementContainerImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getFlowElementContainer()
	 * @generated
	 */
	int FLOW_ELEMENT_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_CONTAINER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_CONTAINER__RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Flow Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Flow Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.ProcessImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FLOW_ELEMENTS = FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = FLOW_ELEMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESOURCE = FLOW_ELEMENT_CONTAINER__RESOURCE;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = FLOW_ELEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = FLOW_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.FlowNodeImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NAME = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__INCOMING = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__OUTGOING = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.SequenceFlowImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TARGET_REF = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__SOURCE_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.GatewayImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GATEWAY_DIRECTION = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.ANDGatewayImpl <em>AND Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.ANDGatewayImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getANDGateway()
	 * @generated
	 */
	int AND_GATEWAY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The number of structural features of the '<em>AND Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.XORGatewayImpl <em>XOR Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.XORGatewayImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getXORGateway()
	 * @generated
	 */
	int XOR_GATEWAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The number of structural features of the '<em>XOR Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XOR Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.ORGatewayImpl <em>OR Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.ORGatewayImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getORGateway()
	 * @generated
	 */
	int OR_GATEWAY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The number of structural features of the '<em>OR Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.ActivityImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.TaskImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.EventImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.CatchEventImpl <em>Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.CatchEventImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getCatchEvent()
	 * @generated
	 */
	int CATCH_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__INCOMING = EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__OUTGOING = EVENT__OUTGOING;

	/**
	 * The number of structural features of the '<em>Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.StartEventImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__INCOMING = CATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = CATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.IntermediateCatchEventImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getIntermediateCatchEvent()
	 * @generated
	 */
	int INTERMEDIATE_CATCH_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__INCOMING = CATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__EVENT_TYPE = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intermediate Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Intermediate Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_OPERATION_COUNT = CATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.BoundaryEventImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getBoundaryEvent()
	 * @generated
	 */
	int BOUNDARY_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__INCOMING = CATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__EVENT_TYPE = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT_OPERATION_COUNT = CATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.ThrowEventImpl <em>Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.ThrowEventImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getThrowEvent()
	 * @generated
	 */
	int THROW_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__INCOMING = EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__OUTGOING = EVENT__OUTGOING;

	/**
	 * The number of structural features of the '<em>Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.EndEventImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__INCOMING = THROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_OPERATION_COUNT = THROW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.IntermediateThrowEventImpl <em>Intermediate Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.IntermediateThrowEventImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getIntermediateThrowEvent()
	 * @generated
	 */
	int INTERMEDIATE_THROW_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__INCOMING = THROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__EVENT_TYPE = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intermediate Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Intermediate Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_OPERATION_COUNT = THROW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.impl.ResourceRoleImpl <em>Resource Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.impl.ResourceRoleImpl
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getResourceRole()
	 * @generated
	 */
	int RESOURCE_ROLE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__PROCESSES = 1;

	/**
	 * The number of structural features of the '<em>Resource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.GatewayDirection <em>Gateway Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.GatewayDirection
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getGatewayDirection()
	 * @generated
	 */
	int GATEWAY_DIRECTION = 20;

	/**
	 * The meta object id for the '{@link simplifiedbpmn.IntermediateEventType <em>Intermediate Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplifiedbpmn.IntermediateEventType
	 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getIntermediateEventType()
	 * @generated
	 */
	int INTERMEDIATE_EVENT_TYPE = 21;

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see simplifiedbpmn.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.FlowElementContainer <em>Flow Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element Container</em>'.
	 * @see simplifiedbpmn.FlowElementContainer
	 * @generated
	 */
	EClass getFlowElementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link simplifiedbpmn.FlowElementContainer#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
	 * @see simplifiedbpmn.FlowElementContainer#getFlowElements()
	 * @see #getFlowElementContainer()
	 * @generated
	 */
	EReference getFlowElementContainer_FlowElements();

	/**
	 * Returns the meta object for the attribute '{@link simplifiedbpmn.FlowElementContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simplifiedbpmn.FlowElementContainer#getName()
	 * @see #getFlowElementContainer()
	 * @generated
	 */
	EAttribute getFlowElementContainer_Name();

	/**
	 * Returns the meta object for the reference '{@link simplifiedbpmn.FlowElementContainer#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see simplifiedbpmn.FlowElementContainer#getResource()
	 * @see #getFlowElementContainer()
	 * @generated
	 */
	EReference getFlowElementContainer_Resource();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see simplifiedbpmn.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see simplifiedbpmn.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the attribute '{@link simplifiedbpmn.FlowNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simplifiedbpmn.FlowNode#getName()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link simplifiedbpmn.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see simplifiedbpmn.FlowNode#getIncoming()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link simplifiedbpmn.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see simplifiedbpmn.FlowNode#getOutgoing()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Outgoing();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see simplifiedbpmn.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for the reference '{@link simplifiedbpmn.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see simplifiedbpmn.SequenceFlow#getTargetRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_TargetRef();

	/**
	 * Returns the meta object for the reference '{@link simplifiedbpmn.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see simplifiedbpmn.SequenceFlow#getSourceRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_SourceRef();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see simplifiedbpmn.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link simplifiedbpmn.Gateway#getGatewayDirection <em>Gateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Direction</em>'.
	 * @see simplifiedbpmn.Gateway#getGatewayDirection()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_GatewayDirection();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.ANDGateway <em>AND Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Gateway</em>'.
	 * @see simplifiedbpmn.ANDGateway
	 * @generated
	 */
	EClass getANDGateway();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.XORGateway <em>XOR Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOR Gateway</em>'.
	 * @see simplifiedbpmn.XORGateway
	 * @generated
	 */
	EClass getXORGateway();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.ORGateway <em>OR Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Gateway</em>'.
	 * @see simplifiedbpmn.ORGateway
	 * @generated
	 */
	EClass getORGateway();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see simplifiedbpmn.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see simplifiedbpmn.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see simplifiedbpmn.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Event</em>'.
	 * @see simplifiedbpmn.CatchEvent
	 * @generated
	 */
	EClass getCatchEvent();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see simplifiedbpmn.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Catch Event</em>'.
	 * @see simplifiedbpmn.IntermediateCatchEvent
	 * @generated
	 */
	EClass getIntermediateCatchEvent();

	/**
	 * Returns the meta object for the attribute '{@link simplifiedbpmn.IntermediateCatchEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see simplifiedbpmn.IntermediateCatchEvent#getEventType()
	 * @see #getIntermediateCatchEvent()
	 * @generated
	 */
	EAttribute getIntermediateCatchEvent_EventType();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Event</em>'.
	 * @see simplifiedbpmn.BoundaryEvent
	 * @generated
	 */
	EClass getBoundaryEvent();

	/**
	 * Returns the meta object for the attribute '{@link simplifiedbpmn.BoundaryEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see simplifiedbpmn.BoundaryEvent#getEventType()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EAttribute getBoundaryEvent_EventType();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Event</em>'.
	 * @see simplifiedbpmn.ThrowEvent
	 * @generated
	 */
	EClass getThrowEvent();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see simplifiedbpmn.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Throw Event</em>'.
	 * @see simplifiedbpmn.IntermediateThrowEvent
	 * @generated
	 */
	EClass getIntermediateThrowEvent();

	/**
	 * Returns the meta object for the attribute '{@link simplifiedbpmn.IntermediateThrowEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see simplifiedbpmn.IntermediateThrowEvent#getEventType()
	 * @see #getIntermediateThrowEvent()
	 * @generated
	 */
	EAttribute getIntermediateThrowEvent_EventType();

	/**
	 * Returns the meta object for class '{@link simplifiedbpmn.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Role</em>'.
	 * @see simplifiedbpmn.ResourceRole
	 * @generated
	 */
	EClass getResourceRole();

	/**
	 * Returns the meta object for the attribute '{@link simplifiedbpmn.ResourceRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simplifiedbpmn.ResourceRole#getName()
	 * @see #getResourceRole()
	 * @generated
	 */
	EAttribute getResourceRole_Name();

	/**
	 * Returns the meta object for the reference list '{@link simplifiedbpmn.ResourceRole#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see simplifiedbpmn.ResourceRole#getProcesses()
	 * @see #getResourceRole()
	 * @generated
	 */
	EReference getResourceRole_Processes();

	/**
	 * Returns the meta object for enum '{@link simplifiedbpmn.GatewayDirection <em>Gateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Direction</em>'.
	 * @see simplifiedbpmn.GatewayDirection
	 * @generated
	 */
	EEnum getGatewayDirection();

	/**
	 * Returns the meta object for enum '{@link simplifiedbpmn.IntermediateEventType <em>Intermediate Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intermediate Event Type</em>'.
	 * @see simplifiedbpmn.IntermediateEventType
	 * @generated
	 */
	EEnum getIntermediateEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplifiedbpmnFactory getSimplifiedbpmnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.FlowElementImpl <em>Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.FlowElementImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.FlowElementContainerImpl <em>Flow Element Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.FlowElementContainerImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getFlowElementContainer()
		 * @generated
		 */
		EClass FLOW_ELEMENT_CONTAINER = eINSTANCE.getFlowElementContainer();

		/**
		 * The meta object literal for the '<em><b>Flow Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS = eINSTANCE.getFlowElementContainer_FlowElements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT_CONTAINER__NAME = eINSTANCE.getFlowElementContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENT_CONTAINER__RESOURCE = eINSTANCE.getFlowElementContainer_Resource();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.ProcessImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.FlowNodeImpl <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.FlowNodeImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__NAME = eINSTANCE.getFlowNode_Name();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__INCOMING = eINSTANCE.getFlowNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__OUTGOING = eINSTANCE.getFlowNode_Outgoing();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.SequenceFlowImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getSequenceFlow()
		 * @generated
		 */
		EClass SEQUENCE_FLOW = eINSTANCE.getSequenceFlow();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__TARGET_REF = eINSTANCE.getSequenceFlow_TargetRef();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__SOURCE_REF = eINSTANCE.getSequenceFlow_SourceRef();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.GatewayImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Gateway Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__GATEWAY_DIRECTION = eINSTANCE.getGateway_GatewayDirection();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.ANDGatewayImpl <em>AND Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.ANDGatewayImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getANDGateway()
		 * @generated
		 */
		EClass AND_GATEWAY = eINSTANCE.getANDGateway();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.XORGatewayImpl <em>XOR Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.XORGatewayImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getXORGateway()
		 * @generated
		 */
		EClass XOR_GATEWAY = eINSTANCE.getXORGateway();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.ORGatewayImpl <em>OR Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.ORGatewayImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getORGateway()
		 * @generated
		 */
		EClass OR_GATEWAY = eINSTANCE.getORGateway();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.ActivityImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.TaskImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.EventImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.CatchEventImpl <em>Catch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.CatchEventImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getCatchEvent()
		 * @generated
		 */
		EClass CATCH_EVENT = eINSTANCE.getCatchEvent();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.StartEventImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.IntermediateCatchEventImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getIntermediateCatchEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_CATCH_EVENT = eINSTANCE.getIntermediateCatchEvent();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_CATCH_EVENT__EVENT_TYPE = eINSTANCE.getIntermediateCatchEvent_EventType();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.BoundaryEventImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getBoundaryEvent()
		 * @generated
		 */
		EClass BOUNDARY_EVENT = eINSTANCE.getBoundaryEvent();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_EVENT__EVENT_TYPE = eINSTANCE.getBoundaryEvent_EventType();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.ThrowEventImpl <em>Throw Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.ThrowEventImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getThrowEvent()
		 * @generated
		 */
		EClass THROW_EVENT = eINSTANCE.getThrowEvent();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.EndEventImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.IntermediateThrowEventImpl <em>Intermediate Throw Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.IntermediateThrowEventImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getIntermediateThrowEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_THROW_EVENT = eINSTANCE.getIntermediateThrowEvent();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_THROW_EVENT__EVENT_TYPE = eINSTANCE.getIntermediateThrowEvent_EventType();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.impl.ResourceRoleImpl <em>Resource Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.impl.ResourceRoleImpl
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getResourceRole()
		 * @generated
		 */
		EClass RESOURCE_ROLE = eINSTANCE.getResourceRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ROLE__NAME = eINSTANCE.getResourceRole_Name();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ROLE__PROCESSES = eINSTANCE.getResourceRole_Processes();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.GatewayDirection <em>Gateway Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.GatewayDirection
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getGatewayDirection()
		 * @generated
		 */
		EEnum GATEWAY_DIRECTION = eINSTANCE.getGatewayDirection();

		/**
		 * The meta object literal for the '{@link simplifiedbpmn.IntermediateEventType <em>Intermediate Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplifiedbpmn.IntermediateEventType
		 * @see simplifiedbpmn.impl.SimplifiedbpmnPackageImpl#getIntermediateEventType()
		 * @generated
		 */
		EEnum INTERMEDIATE_EVENT_TYPE = eINSTANCE.getIntermediateEventType();

	}

} //SimplifiedbpmnPackage
