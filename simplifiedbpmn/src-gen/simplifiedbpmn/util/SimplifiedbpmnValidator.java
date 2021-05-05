/**
 */
package simplifiedbpmn.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import simplifiedbpmn.ANDGateway;
import simplifiedbpmn.Activity;
import simplifiedbpmn.EndEvent;
import simplifiedbpmn.Event;
import simplifiedbpmn.FlowElement;
import simplifiedbpmn.FlowElementContainer;
import simplifiedbpmn.FlowNode;
import simplifiedbpmn.Gateway;
import simplifiedbpmn.GatewayDirection;
import simplifiedbpmn.ResourceRole;
import simplifiedbpmn.SequenceFlow;
import simplifiedbpmn.SimplifiedbpmnPackage;
import simplifiedbpmn.StartEvent;
import simplifiedbpmn.Task;
import simplifiedbpmn.XORGateway;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see simplifiedbpmn.SimplifiedbpmnPackage
 * @generated
 */
public class SimplifiedbpmnValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimplifiedbpmnValidator INSTANCE = new SimplifiedbpmnValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "simplifiedbpmn";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedbpmnValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SimplifiedbpmnPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SimplifiedbpmnPackage.FLOW_ELEMENT:
			return validateFlowElement((FlowElement) value, diagnostics, context);
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER:
			return validateFlowElementContainer((FlowElementContainer) value, diagnostics, context);
		case SimplifiedbpmnPackage.PROCESS:
			return validateProcess((simplifiedbpmn.Process) value, diagnostics, context);
		case SimplifiedbpmnPackage.FLOW_NODE:
			return validateFlowNode((FlowNode) value, diagnostics, context);
		case SimplifiedbpmnPackage.SEQUENCE_FLOW:
			return validateSequenceFlow((SequenceFlow) value, diagnostics, context);
		case SimplifiedbpmnPackage.GATEWAY:
			return validateGateway((Gateway) value, diagnostics, context);
		case SimplifiedbpmnPackage.AND_GATEWAY:
			return validateANDGateway((ANDGateway) value, diagnostics, context);
		case SimplifiedbpmnPackage.XOR_GATEWAY:
			return validateXORGateway((XORGateway) value, diagnostics, context);
		case SimplifiedbpmnPackage.ACTIVITY:
			return validateActivity((Activity) value, diagnostics, context);
		case SimplifiedbpmnPackage.TASK:
			return validateTask((Task) value, diagnostics, context);
		case SimplifiedbpmnPackage.EVENT:
			return validateEvent((Event) value, diagnostics, context);
		case SimplifiedbpmnPackage.START_EVENT:
			return validateStartEvent((StartEvent) value, diagnostics, context);
		case SimplifiedbpmnPackage.END_EVENT:
			return validateEndEvent((EndEvent) value, diagnostics, context);
		case SimplifiedbpmnPackage.RESOURCE_ROLE:
			return validateResourceRole((ResourceRole) value, diagnostics, context);
		case SimplifiedbpmnPackage.GATEWAY_DIRECTION:
			return validateGatewayDirection((GatewayDirection) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowElement(FlowElement flowElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowElementContainer(FlowElementContainer flowElementContainer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(flowElementContainer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(flowElementContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(flowElementContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(flowElementContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(flowElementContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(flowElementContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(flowElementContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(flowElementContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(flowElementContainer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFlowElementContainer_onlyOneStartEvent(flowElementContainer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyOneStartEvent constraint of '<em>Flow Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLOW_ELEMENT_CONTAINER__ONLY_ONE_START_EVENT__EEXPRESSION = "\n"
			+ "\t\tself.flowElements->select(e | e.oclIsTypeOf(StartEvent) )->size() = 1";

	/**
	 * Validates the onlyOneStartEvent constraint of '<em>Flow Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowElementContainer_onlyOneStartEvent(FlowElementContainer flowElementContainer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SimplifiedbpmnPackage.Literals.FLOW_ELEMENT_CONTAINER, flowElementContainer, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL", "onlyOneStartEvent",
				FLOW_ELEMENT_CONTAINER__ONLY_ONE_START_EVENT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(simplifiedbpmn.Process process, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFlowElementContainer_onlyOneStartEvent(process, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowNode(FlowNode flowNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceFlow(SequenceFlow sequenceFlow, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway(Gateway gateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gateway, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGateway_isJoinOrFork(gateway, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isJoinOrFork constraint of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATEWAY__IS_JOIN_OR_FORK__EEXPRESSION = "\n" + "\t\tif self.type = 1 then\n"
			+ "\t\t\t(self.outgoing->size() = 1 and self.incoming->size() > 1)\n" + "\t\telse\n"
			+ "\t\t\t(self.incoming->size() = 1 and self.outgoing->size() > 1)\n" + "\t\tendif";

	/**
	 * Validates the isJoinOrFork constraint of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway_isJoinOrFork(Gateway gateway, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SimplifiedbpmnPackage.Literals.GATEWAY, gateway, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "isJoinOrFork", GATEWAY__IS_JOIN_OR_FORK__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANDGateway(ANDGateway andGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(andGateway, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(andGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(andGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(andGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(andGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(andGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(andGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(andGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(andGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGateway_isJoinOrFork(andGateway, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXORGateway(XORGateway xorGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(xorGateway, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(xorGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(xorGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(xorGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(xorGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(xorGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(xorGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(xorGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(xorGateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGateway_isJoinOrFork(xorGateway, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_oneIn(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_oneOut(task, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneIn constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__ONE_IN__EEXPRESSION = "self.incoming->size() = 1";

	/**
	 * Validates the oneIn constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_oneIn(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SimplifiedbpmnPackage.Literals.TASK, task, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "oneIn", TASK__ONE_IN__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the oneOut constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__ONE_OUT__EEXPRESSION = "self.outgoing->size() = 1";

	/**
	 * Validates the oneOut constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_oneOut(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SimplifiedbpmnPackage.Literals.TASK, task, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "oneOut", TASK__ONE_OUT__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartEvent(StartEvent startEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startEvent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(startEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(startEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(startEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(startEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(startEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(startEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(startEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(startEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStartEvent_noIncomingFlow(startEvent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noIncomingFlow constraint of '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START_EVENT__NO_INCOMING_FLOW__EEXPRESSION = "self.incoming->size() = 0";

	/**
	 * Validates the noIncomingFlow constraint of '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartEvent_noIncomingFlow(StartEvent startEvent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SimplifiedbpmnPackage.Literals.START_EVENT, startEvent, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "noIncomingFlow",
				START_EVENT__NO_INCOMING_FLOW__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndEvent(EndEvent endEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endEvent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(endEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(endEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(endEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(endEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(endEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(endEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(endEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(endEvent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEndEvent_noOutgoingFlow(endEvent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noOutgoingFlow constraint of '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String END_EVENT__NO_OUTGOING_FLOW__EEXPRESSION = "self.outgoing->size() = 0";

	/**
	 * Validates the noOutgoingFlow constraint of '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndEvent_noOutgoingFlow(EndEvent endEvent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SimplifiedbpmnPackage.Literals.END_EVENT, endEvent, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "noOutgoingFlow", END_EVENT__NO_OUTGOING_FLOW__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRole(ResourceRole resourceRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGatewayDirection(GatewayDirection gatewayDirection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SimplifiedbpmnValidator
