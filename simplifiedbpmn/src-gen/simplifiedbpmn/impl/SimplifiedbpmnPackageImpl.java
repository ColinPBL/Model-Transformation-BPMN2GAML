/**
 */
package simplifiedbpmn.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import simplifiedbpmn.GatewayDirection;
import simplifiedbpmn.IntermediateCatchEvent;
import simplifiedbpmn.IntermediateEventType;
import simplifiedbpmn.IntermediateThrowEvent;
import simplifiedbpmn.ORGateway;
import simplifiedbpmn.ResourceRole;
import simplifiedbpmn.SequenceFlow;
import simplifiedbpmn.SimplifiedbpmnFactory;
import simplifiedbpmn.SimplifiedbpmnPackage;
import simplifiedbpmn.StartEvent;
import simplifiedbpmn.Task;
import simplifiedbpmn.ThrowEvent;
import simplifiedbpmn.XORGateway;

import simplifiedbpmn.util.SimplifiedbpmnValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplifiedbpmnPackageImpl extends EPackageImpl implements SimplifiedbpmnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateCatchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateThrowEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gatewayDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intermediateEventTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplifiedbpmnPackageImpl() {
		super(eNS_URI, SimplifiedbpmnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SimplifiedbpmnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplifiedbpmnPackage init() {
		if (isInited)
			return (SimplifiedbpmnPackage) EPackage.Registry.INSTANCE.getEPackage(SimplifiedbpmnPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimplifiedbpmnPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimplifiedbpmnPackageImpl theSimplifiedbpmnPackage = registeredSimplifiedbpmnPackage instanceof SimplifiedbpmnPackageImpl
				? (SimplifiedbpmnPackageImpl) registeredSimplifiedbpmnPackage
				: new SimplifiedbpmnPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSimplifiedbpmnPackage.createPackageContents();

		// Initialize created meta-data
		theSimplifiedbpmnPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSimplifiedbpmnPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return SimplifiedbpmnValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSimplifiedbpmnPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplifiedbpmnPackage.eNS_URI, theSimplifiedbpmnPackage);
		return theSimplifiedbpmnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElementContainer() {
		return flowElementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElementContainer_FlowElements() {
		return (EReference) flowElementContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowElementContainer_Name() {
		return (EAttribute) flowElementContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElementContainer_Resource() {
		return (EReference) flowElementContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNode() {
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Name() {
		return (EAttribute) flowNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Incoming() {
		return (EReference) flowNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Outgoing() {
		return (EReference) flowNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceFlow() {
		return sequenceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlow_TargetRef() {
		return (EReference) sequenceFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlow_SourceRef() {
		return (EReference) sequenceFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGateway_GatewayDirection() {
		return (EAttribute) gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANDGateway() {
		return andGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXORGateway() {
		return xorGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORGateway() {
		return orGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchEvent() {
		return catchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEvent() {
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateCatchEvent() {
		return intermediateCatchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntermediateCatchEvent_EventType() {
		return (EAttribute) intermediateCatchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundaryEvent() {
		return boundaryEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundaryEvent_EventType() {
		return (EAttribute) boundaryEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowEvent() {
		return throwEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateThrowEvent() {
		return intermediateThrowEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntermediateThrowEvent_EventType() {
		return (EAttribute) intermediateThrowEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRole() {
		return resourceRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceRole_Name() {
		return (EAttribute) resourceRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRole_Processes() {
		return (EReference) resourceRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGatewayDirection() {
		return gatewayDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntermediateEventType() {
		return intermediateEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedbpmnFactory getSimplifiedbpmnFactory() {
		return (SimplifiedbpmnFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		flowElementEClass = createEClass(FLOW_ELEMENT);

		flowElementContainerEClass = createEClass(FLOW_ELEMENT_CONTAINER);
		createEReference(flowElementContainerEClass, FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS);
		createEAttribute(flowElementContainerEClass, FLOW_ELEMENT_CONTAINER__NAME);
		createEReference(flowElementContainerEClass, FLOW_ELEMENT_CONTAINER__RESOURCE);

		processEClass = createEClass(PROCESS);

		flowNodeEClass = createEClass(FLOW_NODE);
		createEAttribute(flowNodeEClass, FLOW_NODE__NAME);
		createEReference(flowNodeEClass, FLOW_NODE__INCOMING);
		createEReference(flowNodeEClass, FLOW_NODE__OUTGOING);

		sequenceFlowEClass = createEClass(SEQUENCE_FLOW);
		createEReference(sequenceFlowEClass, SEQUENCE_FLOW__TARGET_REF);
		createEReference(sequenceFlowEClass, SEQUENCE_FLOW__SOURCE_REF);

		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__GATEWAY_DIRECTION);

		andGatewayEClass = createEClass(AND_GATEWAY);

		xorGatewayEClass = createEClass(XOR_GATEWAY);

		orGatewayEClass = createEClass(OR_GATEWAY);

		activityEClass = createEClass(ACTIVITY);

		taskEClass = createEClass(TASK);

		eventEClass = createEClass(EVENT);

		catchEventEClass = createEClass(CATCH_EVENT);

		startEventEClass = createEClass(START_EVENT);

		intermediateCatchEventEClass = createEClass(INTERMEDIATE_CATCH_EVENT);
		createEAttribute(intermediateCatchEventEClass, INTERMEDIATE_CATCH_EVENT__EVENT_TYPE);

		boundaryEventEClass = createEClass(BOUNDARY_EVENT);
		createEAttribute(boundaryEventEClass, BOUNDARY_EVENT__EVENT_TYPE);

		throwEventEClass = createEClass(THROW_EVENT);

		endEventEClass = createEClass(END_EVENT);

		intermediateThrowEventEClass = createEClass(INTERMEDIATE_THROW_EVENT);
		createEAttribute(intermediateThrowEventEClass, INTERMEDIATE_THROW_EVENT__EVENT_TYPE);

		resourceRoleEClass = createEClass(RESOURCE_ROLE);
		createEAttribute(resourceRoleEClass, RESOURCE_ROLE__NAME);
		createEReference(resourceRoleEClass, RESOURCE_ROLE__PROCESSES);

		// Create enums
		gatewayDirectionEEnum = createEEnum(GATEWAY_DIRECTION);
		intermediateEventTypeEEnum = createEEnum(INTERMEDIATE_EVENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processEClass.getESuperTypes().add(this.getFlowElementContainer());
		flowNodeEClass.getESuperTypes().add(this.getFlowElement());
		sequenceFlowEClass.getESuperTypes().add(this.getFlowElement());
		gatewayEClass.getESuperTypes().add(this.getFlowNode());
		andGatewayEClass.getESuperTypes().add(this.getGateway());
		xorGatewayEClass.getESuperTypes().add(this.getGateway());
		orGatewayEClass.getESuperTypes().add(this.getGateway());
		activityEClass.getESuperTypes().add(this.getFlowNode());
		taskEClass.getESuperTypes().add(this.getActivity());
		eventEClass.getESuperTypes().add(this.getFlowNode());
		catchEventEClass.getESuperTypes().add(this.getEvent());
		startEventEClass.getESuperTypes().add(this.getCatchEvent());
		intermediateCatchEventEClass.getESuperTypes().add(this.getCatchEvent());
		boundaryEventEClass.getESuperTypes().add(this.getCatchEvent());
		throwEventEClass.getESuperTypes().add(this.getEvent());
		endEventEClass.getESuperTypes().add(this.getThrowEvent());
		intermediateThrowEventEClass.getESuperTypes().add(this.getThrowEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowElementContainerEClass, FlowElementContainer.class, "FlowElementContainer", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowElementContainer_FlowElements(), this.getFlowElement(), null, "flowElements", null, 0, -1,
				FlowElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowElementContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				FlowElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowElementContainer_Resource(), this.getResourceRole(), this.getResourceRole_Processes(),
				"resource", null, 1, 1, FlowElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, simplifiedbpmn.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowNodeEClass, FlowNode.class, "FlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Incoming(), this.getSequenceFlow(), this.getSequenceFlow_TargetRef(), "incoming",
				null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Outgoing(), this.getSequenceFlow(), this.getSequenceFlow_SourceRef(), "outgoing",
				null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceFlowEClass, SequenceFlow.class, "SequenceFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceFlow_TargetRef(), this.getFlowNode(), this.getFlowNode_Incoming(), "targetRef", null,
				1, 1, SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceFlow_SourceRef(), this.getFlowNode(), this.getFlowNode_Outgoing(), "sourceRef", null,
				1, 1, SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayEClass, Gateway.class, "Gateway", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_GatewayDirection(), this.getGatewayDirection(), "gatewayDirection", null, 1, 1,
				Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(andGatewayEClass, ANDGateway.class, "ANDGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorGatewayEClass, XORGateway.class, "XORGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(orGatewayEClass, ORGateway.class, "ORGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catchEventEClass, CatchEvent.class, "CatchEvent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermediateCatchEventEClass, IntermediateCatchEvent.class, "IntermediateCatchEvent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermediateCatchEvent_EventType(), this.getIntermediateEventType(), "eventType", null, 1, 1,
				IntermediateCatchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundaryEventEClass, BoundaryEvent.class, "BoundaryEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundaryEvent_EventType(), this.getIntermediateEventType(), "eventType", null, 1, 1,
				BoundaryEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(throwEventEClass, ThrowEvent.class, "ThrowEvent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermediateThrowEventEClass, IntermediateThrowEvent.class, "IntermediateThrowEvent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermediateThrowEvent_EventType(), this.getIntermediateEventType(), "eventType", null, 1, 1,
				IntermediateThrowEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRoleEClass, ResourceRole.class, "ResourceRole", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceRole.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRole_Processes(), this.getFlowElementContainer(),
				this.getFlowElementContainer_Resource(), "processes", null, 0, -1, ResourceRole.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gatewayDirectionEEnum, GatewayDirection.class, "GatewayDirection");
		addEEnumLiteral(gatewayDirectionEEnum, GatewayDirection.UNSPECIFIED);
		addEEnumLiteral(gatewayDirectionEEnum, GatewayDirection.CONVERGING);
		addEEnumLiteral(gatewayDirectionEEnum, GatewayDirection.DIVERGING);
		addEEnumLiteral(gatewayDirectionEEnum, GatewayDirection.MIXED);

		initEEnum(intermediateEventTypeEEnum, IntermediateEventType.class, "IntermediateEventType");
		addEEnumLiteral(intermediateEventTypeEEnum, IntermediateEventType.MESSAGE);
		addEEnumLiteral(intermediateEventTypeEEnum, IntermediateEventType.SIGNAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL", "settingDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL" });
		addAnnotation(flowElementContainerEClass, source, new String[] { "constraints", "onlyOneStartEvent" });
		addAnnotation(taskEClass, source, new String[] { "constraints", "oneIn oneOut" });
		addAnnotation(startEventEClass, source, new String[] { "constraints", "noIncomingFlow" });
		addAnnotation(endEventEClass, source, new String[] { "constraints", "noOutgoingFlow" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation(flowElementContainerEClass, source, new String[] { "onlyOneStartEvent",
				"\n\t\tself.flowElements->select(e | e.oclIsTypeOf(StartEvent) )->size() = 1" });
		addAnnotation(taskEClass, source,
				new String[] { "oneIn", "self.incoming->size() = 1", "oneOut", "self.outgoing->size() = 1" });
		addAnnotation(startEventEClass, source, new String[] { "noIncomingFlow", "self.incoming->size() = 0" });
		addAnnotation(endEventEClass, source, new String[] { "noOutgoingFlow", "self.outgoing->size() = 0" });
	}

} //SimplifiedbpmnPackageImpl
