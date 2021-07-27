/**
 */
package BPMN4GAMA;

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
 * @see BPMN4GAMA.BPMN4GAMAFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface BPMN4GAMAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BPMN4GAMA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cpoubel.org/BPMN4GAMA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BPMN4GAMA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPMN4GAMAPackage eINSTANCE = BPMN4GAMA.impl.BPMN4GAMAPackageImpl.init();

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.FlowElementImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 6;

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
	 * The meta object id for the '{@link BPMN4GAMA.impl.FlowElementContainerImpl <em>Flow Element Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.FlowElementContainerImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getFlowElementContainer()
	 * @generated
	 */
	int FLOW_ELEMENT_CONTAINER = 7;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.ProcessImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 13;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.FlowNodeImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 8;

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
	 * The meta object id for the '{@link BPMN4GAMA.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.SequenceFlowImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 15;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.GatewayImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 9;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.ANDGatewayImpl <em>AND Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.ANDGatewayImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getANDGateway()
	 * @generated
	 */
	int AND_GATEWAY = 1;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.XORGatewayImpl <em>XOR Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.XORGatewayImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getXORGateway()
	 * @generated
	 */
	int XOR_GATEWAY = 20;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.ORGatewayImpl <em>OR Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.ORGatewayImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getORGateway()
	 * @generated
	 */
	int OR_GATEWAY = 12;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.ActivityImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

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
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BOUNDARY_EVENT_REFS = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_LOOP = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link BPMN4GAMA.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.TaskImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 18;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.EventImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

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
	 * The meta object id for the '{@link BPMN4GAMA.impl.CatchEventImpl <em>Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.CatchEventImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getCatchEvent()
	 * @generated
	 */
	int CATCH_EVENT = 3;

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
	 * The meta object id for the '{@link BPMN4GAMA.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.StartEventImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 16;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.IntermediateCatchEventImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getIntermediateCatchEvent()
	 * @generated
	 */
	int INTERMEDIATE_CATCH_EVENT = 10;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.BoundaryEventImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getBoundaryEvent()
	 * @generated
	 */
	int BOUNDARY_EVENT = 2;

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
	 * The feature id for the '<em><b>Cancel Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__CANCEL_ACTIVITY = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attached To Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__ATTACHED_TO_REF = CATCH_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT_OPERATION_COUNT = CATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.ThrowEventImpl <em>Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.ThrowEventImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getThrowEvent()
	 * @generated
	 */
	int THROW_EVENT = 19;

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
	 * The meta object id for the '{@link BPMN4GAMA.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.EndEventImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 4;

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
	 * The meta object id for the '{@link BPMN4GAMA.impl.IntermediateThrowEventImpl <em>Intermediate Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.IntermediateThrowEventImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getIntermediateThrowEvent()
	 * @generated
	 */
	int INTERMEDIATE_THROW_EVENT = 11;

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
	 * The meta object id for the '{@link BPMN4GAMA.impl.ResourceRoleImpl <em>Resource Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.ResourceRoleImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getResourceRole()
	 * @generated
	 */
	int RESOURCE_ROLE = 14;

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
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EVENT_TYPE = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = CATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.impl.SubprocessImpl <em>Subprocess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.impl.SubprocessImpl
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getSubprocess()
	 * @generated
	 */
	int SUBPROCESS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__IS_LOOP = ACTIVITY__IS_LOOP;

	/**
	 * The feature id for the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__PROCESS_REF = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Multi Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__IS_MULTI_INSTANCE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_LOOP = ACTIVITY__IS_LOOP;

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
	 * The meta object id for the '{@link BPMN4GAMA.GatewayDirection <em>Gateway Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.GatewayDirection
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getGatewayDirection()
	 * @generated
	 */
	int GATEWAY_DIRECTION = 22;

	/**
	 * The meta object id for the '{@link BPMN4GAMA.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BPMN4GAMA.EventType
	 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see BPMN4GAMA.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.FlowElementContainer <em>Flow Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element Container</em>'.
	 * @see BPMN4GAMA.FlowElementContainer
	 * @generated
	 */
	EClass getFlowElementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link BPMN4GAMA.FlowElementContainer#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
	 * @see BPMN4GAMA.FlowElementContainer#getFlowElements()
	 * @see #getFlowElementContainer()
	 * @generated
	 */
	EReference getFlowElementContainer_FlowElements();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.FlowElementContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BPMN4GAMA.FlowElementContainer#getName()
	 * @see #getFlowElementContainer()
	 * @generated
	 */
	EAttribute getFlowElementContainer_Name();

	/**
	 * Returns the meta object for the reference '{@link BPMN4GAMA.FlowElementContainer#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see BPMN4GAMA.FlowElementContainer#getResource()
	 * @see #getFlowElementContainer()
	 * @generated
	 */
	EReference getFlowElementContainer_Resource();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see BPMN4GAMA.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see BPMN4GAMA.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.FlowNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BPMN4GAMA.FlowNode#getName()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link BPMN4GAMA.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see BPMN4GAMA.FlowNode#getIncoming()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link BPMN4GAMA.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see BPMN4GAMA.FlowNode#getOutgoing()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Outgoing();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see BPMN4GAMA.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for the reference '{@link BPMN4GAMA.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see BPMN4GAMA.SequenceFlow#getTargetRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_TargetRef();

	/**
	 * Returns the meta object for the reference '{@link BPMN4GAMA.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see BPMN4GAMA.SequenceFlow#getSourceRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_SourceRef();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see BPMN4GAMA.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.Gateway#getGatewayDirection <em>Gateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Direction</em>'.
	 * @see BPMN4GAMA.Gateway#getGatewayDirection()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_GatewayDirection();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.ANDGateway <em>AND Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Gateway</em>'.
	 * @see BPMN4GAMA.ANDGateway
	 * @generated
	 */
	EClass getANDGateway();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.XORGateway <em>XOR Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOR Gateway</em>'.
	 * @see BPMN4GAMA.XORGateway
	 * @generated
	 */
	EClass getXORGateway();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.ORGateway <em>OR Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Gateway</em>'.
	 * @see BPMN4GAMA.ORGateway
	 * @generated
	 */
	EClass getORGateway();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see BPMN4GAMA.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference list '{@link BPMN4GAMA.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boundary Event Refs</em>'.
	 * @see BPMN4GAMA.Activity#getBoundaryEventRefs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_BoundaryEventRefs();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.Activity#isIsLoop <em>Is Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Loop</em>'.
	 * @see BPMN4GAMA.Activity#isIsLoop()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsLoop();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see BPMN4GAMA.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see BPMN4GAMA.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Event</em>'.
	 * @see BPMN4GAMA.CatchEvent
	 * @generated
	 */
	EClass getCatchEvent();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see BPMN4GAMA.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.StartEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see BPMN4GAMA.StartEvent#getEventType()
	 * @see #getStartEvent()
	 * @generated
	 */
	EAttribute getStartEvent_EventType();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Catch Event</em>'.
	 * @see BPMN4GAMA.IntermediateCatchEvent
	 * @generated
	 */
	EClass getIntermediateCatchEvent();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.IntermediateCatchEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see BPMN4GAMA.IntermediateCatchEvent#getEventType()
	 * @see #getIntermediateCatchEvent()
	 * @generated
	 */
	EAttribute getIntermediateCatchEvent_EventType();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Event</em>'.
	 * @see BPMN4GAMA.BoundaryEvent
	 * @generated
	 */
	EClass getBoundaryEvent();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.BoundaryEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see BPMN4GAMA.BoundaryEvent#getEventType()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EAttribute getBoundaryEvent_EventType();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Activity</em>'.
	 * @see BPMN4GAMA.BoundaryEvent#isCancelActivity()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EAttribute getBoundaryEvent_CancelActivity();

	/**
	 * Returns the meta object for the reference '{@link BPMN4GAMA.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attached To Ref</em>'.
	 * @see BPMN4GAMA.BoundaryEvent#getAttachedToRef()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EReference getBoundaryEvent_AttachedToRef();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Event</em>'.
	 * @see BPMN4GAMA.ThrowEvent
	 * @generated
	 */
	EClass getThrowEvent();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see BPMN4GAMA.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Throw Event</em>'.
	 * @see BPMN4GAMA.IntermediateThrowEvent
	 * @generated
	 */
	EClass getIntermediateThrowEvent();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.IntermediateThrowEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see BPMN4GAMA.IntermediateThrowEvent#getEventType()
	 * @see #getIntermediateThrowEvent()
	 * @generated
	 */
	EAttribute getIntermediateThrowEvent_EventType();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Role</em>'.
	 * @see BPMN4GAMA.ResourceRole
	 * @generated
	 */
	EClass getResourceRole();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.ResourceRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BPMN4GAMA.ResourceRole#getName()
	 * @see #getResourceRole()
	 * @generated
	 */
	EAttribute getResourceRole_Name();

	/**
	 * Returns the meta object for the reference list '{@link BPMN4GAMA.ResourceRole#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see BPMN4GAMA.ResourceRole#getProcesses()
	 * @see #getResourceRole()
	 * @generated
	 */
	EReference getResourceRole_Processes();

	/**
	 * Returns the meta object for class '{@link BPMN4GAMA.Subprocess <em>Subprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprocess</em>'.
	 * @see BPMN4GAMA.Subprocess
	 * @generated
	 */
	EClass getSubprocess();

	/**
	 * Returns the meta object for the reference '{@link BPMN4GAMA.Subprocess#getProcessRef <em>Process Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Ref</em>'.
	 * @see BPMN4GAMA.Subprocess#getProcessRef()
	 * @see #getSubprocess()
	 * @generated
	 */
	EReference getSubprocess_ProcessRef();

	/**
	 * Returns the meta object for the attribute '{@link BPMN4GAMA.Subprocess#isIsMultiInstance <em>Is Multi Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Instance</em>'.
	 * @see BPMN4GAMA.Subprocess#isIsMultiInstance()
	 * @see #getSubprocess()
	 * @generated
	 */
	EAttribute getSubprocess_IsMultiInstance();

	/**
	 * Returns the meta object for enum '{@link BPMN4GAMA.GatewayDirection <em>Gateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Direction</em>'.
	 * @see BPMN4GAMA.GatewayDirection
	 * @generated
	 */
	EEnum getGatewayDirection();

	/**
	 * Returns the meta object for enum '{@link BPMN4GAMA.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see BPMN4GAMA.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BPMN4GAMAFactory getBPMN4GAMAFactory();

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
		 * The meta object literal for the '{@link BPMN4GAMA.impl.FlowElementImpl <em>Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.FlowElementImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.FlowElementContainerImpl <em>Flow Element Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.FlowElementContainerImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getFlowElementContainer()
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
		 * The meta object literal for the '{@link BPMN4GAMA.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.ProcessImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.FlowNodeImpl <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.FlowNodeImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getFlowNode()
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
		 * The meta object literal for the '{@link BPMN4GAMA.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.SequenceFlowImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getSequenceFlow()
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
		 * The meta object literal for the '{@link BPMN4GAMA.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.GatewayImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getGateway()
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
		 * The meta object literal for the '{@link BPMN4GAMA.impl.ANDGatewayImpl <em>AND Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.ANDGatewayImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getANDGateway()
		 * @generated
		 */
		EClass AND_GATEWAY = eINSTANCE.getANDGateway();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.XORGatewayImpl <em>XOR Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.XORGatewayImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getXORGateway()
		 * @generated
		 */
		EClass XOR_GATEWAY = eINSTANCE.getXORGateway();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.ORGatewayImpl <em>OR Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.ORGatewayImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getORGateway()
		 * @generated
		 */
		EClass OR_GATEWAY = eINSTANCE.getORGateway();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.ActivityImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Boundary Event Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__BOUNDARY_EVENT_REFS = eINSTANCE.getActivity_BoundaryEventRefs();

		/**
		 * The meta object literal for the '<em><b>Is Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IS_LOOP = eINSTANCE.getActivity_IsLoop();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.TaskImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.EventImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.CatchEventImpl <em>Catch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.CatchEventImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getCatchEvent()
		 * @generated
		 */
		EClass CATCH_EVENT = eINSTANCE.getCatchEvent();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.StartEventImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_EVENT__EVENT_TYPE = eINSTANCE.getStartEvent_EventType();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.IntermediateCatchEventImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getIntermediateCatchEvent()
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
		 * The meta object literal for the '{@link BPMN4GAMA.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.BoundaryEventImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getBoundaryEvent()
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
		 * The meta object literal for the '<em><b>Cancel Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_EVENT__CANCEL_ACTIVITY = eINSTANCE.getBoundaryEvent_CancelActivity();

		/**
		 * The meta object literal for the '<em><b>Attached To Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDARY_EVENT__ATTACHED_TO_REF = eINSTANCE.getBoundaryEvent_AttachedToRef();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.ThrowEventImpl <em>Throw Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.ThrowEventImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getThrowEvent()
		 * @generated
		 */
		EClass THROW_EVENT = eINSTANCE.getThrowEvent();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.EndEventImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.impl.IntermediateThrowEventImpl <em>Intermediate Throw Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.IntermediateThrowEventImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getIntermediateThrowEvent()
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
		 * The meta object literal for the '{@link BPMN4GAMA.impl.ResourceRoleImpl <em>Resource Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.ResourceRoleImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getResourceRole()
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
		 * The meta object literal for the '{@link BPMN4GAMA.impl.SubprocessImpl <em>Subprocess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.impl.SubprocessImpl
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getSubprocess()
		 * @generated
		 */
		EClass SUBPROCESS = eINSTANCE.getSubprocess();

		/**
		 * The meta object literal for the '<em><b>Process Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROCESS__PROCESS_REF = eINSTANCE.getSubprocess_ProcessRef();

		/**
		 * The meta object literal for the '<em><b>Is Multi Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBPROCESS__IS_MULTI_INSTANCE = eINSTANCE.getSubprocess_IsMultiInstance();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.GatewayDirection <em>Gateway Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.GatewayDirection
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getGatewayDirection()
		 * @generated
		 */
		EEnum GATEWAY_DIRECTION = eINSTANCE.getGatewayDirection();

		/**
		 * The meta object literal for the '{@link BPMN4GAMA.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BPMN4GAMA.EventType
		 * @see BPMN4GAMA.impl.BPMN4GAMAPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

	}

} //BPMN4GAMAPackage
