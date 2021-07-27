/**
 */
package BPMN4GAMA.impl;

import BPMN4GAMA.ANDGateway;
import BPMN4GAMA.Activity;
import BPMN4GAMA.BPMN4GAMAFactory;
import BPMN4GAMA.BPMN4GAMAPackage;
import BPMN4GAMA.BoundaryEvent;
import BPMN4GAMA.CatchEvent;
import BPMN4GAMA.EndEvent;
import BPMN4GAMA.Event;
import BPMN4GAMA.EventType;
import BPMN4GAMA.FlowElement;
import BPMN4GAMA.FlowElementContainer;
import BPMN4GAMA.FlowNode;
import BPMN4GAMA.Gateway;
import BPMN4GAMA.GatewayDirection;
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

import BPMN4GAMA.util.BPMN4GAMAValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMN4GAMAPackageImpl extends EPackageImpl implements BPMN4GAMAPackage {
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
	private EClass subprocessEClass = null;

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
	private EEnum eventTypeEEnum = null;

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
	 * @see BPMN4GAMA.BPMN4GAMAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BPMN4GAMAPackageImpl() {
		super(eNS_URI, BPMN4GAMAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BPMN4GAMAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BPMN4GAMAPackage init() {
		if (isInited) return (BPMN4GAMAPackage)EPackage.Registry.INSTANCE.getEPackage(BPMN4GAMAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBPMN4GAMAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BPMN4GAMAPackageImpl theBPMN4GAMAPackage = registeredBPMN4GAMAPackage instanceof BPMN4GAMAPackageImpl ? (BPMN4GAMAPackageImpl)registeredBPMN4GAMAPackage : new BPMN4GAMAPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBPMN4GAMAPackage.createPackageContents();

		// Initialize created meta-data
		theBPMN4GAMAPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBPMN4GAMAPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BPMN4GAMAValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBPMN4GAMAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BPMN4GAMAPackage.eNS_URI, theBPMN4GAMAPackage);
		return theBPMN4GAMAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowElementContainer() {
		return flowElementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowElementContainer_FlowElements() {
		return (EReference)flowElementContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowElementContainer_Name() {
		return (EAttribute)flowElementContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowElementContainer_Resource() {
		return (EReference)flowElementContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowNode() {
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowNode_Name() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowNode_Incoming() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowNode_Outgoing() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceFlow() {
		return sequenceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceFlow_TargetRef() {
		return (EReference)sequenceFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceFlow_SourceRef() {
		return (EReference)sequenceFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGateway_GatewayDirection() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getANDGateway() {
		return andGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXORGateway() {
		return xorGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getORGateway() {
		return orGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_BoundaryEventRefs() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_IsLoop() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatchEvent() {
		return catchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartEvent() {
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartEvent_EventType() {
		return (EAttribute)startEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermediateCatchEvent() {
		return intermediateCatchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermediateCatchEvent_EventType() {
		return (EAttribute)intermediateCatchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundaryEvent() {
		return boundaryEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryEvent_EventType() {
		return (EAttribute)boundaryEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryEvent_CancelActivity() {
		return (EAttribute)boundaryEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundaryEvent_AttachedToRef() {
		return (EReference)boundaryEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThrowEvent() {
		return throwEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermediateThrowEvent() {
		return intermediateThrowEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermediateThrowEvent_EventType() {
		return (EAttribute)intermediateThrowEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceRole() {
		return resourceRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceRole_Name() {
		return (EAttribute)resourceRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceRole_Processes() {
		return (EReference)resourceRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprocess() {
		return subprocessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprocess_ProcessRef() {
		return (EReference)subprocessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubprocess_IsMultiInstance() {
		return (EAttribute)subprocessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGatewayDirection() {
		return gatewayDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMN4GAMAFactory getBPMN4GAMAFactory() {
		return (BPMN4GAMAFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__BOUNDARY_EVENT_REFS);
		createEAttribute(activityEClass, ACTIVITY__IS_LOOP);

		andGatewayEClass = createEClass(AND_GATEWAY);

		boundaryEventEClass = createEClass(BOUNDARY_EVENT);
		createEAttribute(boundaryEventEClass, BOUNDARY_EVENT__EVENT_TYPE);
		createEAttribute(boundaryEventEClass, BOUNDARY_EVENT__CANCEL_ACTIVITY);
		createEReference(boundaryEventEClass, BOUNDARY_EVENT__ATTACHED_TO_REF);

		catchEventEClass = createEClass(CATCH_EVENT);

		endEventEClass = createEClass(END_EVENT);

		eventEClass = createEClass(EVENT);

		flowElementEClass = createEClass(FLOW_ELEMENT);

		flowElementContainerEClass = createEClass(FLOW_ELEMENT_CONTAINER);
		createEReference(flowElementContainerEClass, FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS);
		createEAttribute(flowElementContainerEClass, FLOW_ELEMENT_CONTAINER__NAME);
		createEReference(flowElementContainerEClass, FLOW_ELEMENT_CONTAINER__RESOURCE);

		flowNodeEClass = createEClass(FLOW_NODE);
		createEAttribute(flowNodeEClass, FLOW_NODE__NAME);
		createEReference(flowNodeEClass, FLOW_NODE__INCOMING);
		createEReference(flowNodeEClass, FLOW_NODE__OUTGOING);

		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__GATEWAY_DIRECTION);

		intermediateCatchEventEClass = createEClass(INTERMEDIATE_CATCH_EVENT);
		createEAttribute(intermediateCatchEventEClass, INTERMEDIATE_CATCH_EVENT__EVENT_TYPE);

		intermediateThrowEventEClass = createEClass(INTERMEDIATE_THROW_EVENT);
		createEAttribute(intermediateThrowEventEClass, INTERMEDIATE_THROW_EVENT__EVENT_TYPE);

		orGatewayEClass = createEClass(OR_GATEWAY);

		processEClass = createEClass(PROCESS);

		resourceRoleEClass = createEClass(RESOURCE_ROLE);
		createEAttribute(resourceRoleEClass, RESOURCE_ROLE__NAME);
		createEReference(resourceRoleEClass, RESOURCE_ROLE__PROCESSES);

		sequenceFlowEClass = createEClass(SEQUENCE_FLOW);
		createEReference(sequenceFlowEClass, SEQUENCE_FLOW__TARGET_REF);
		createEReference(sequenceFlowEClass, SEQUENCE_FLOW__SOURCE_REF);

		startEventEClass = createEClass(START_EVENT);
		createEAttribute(startEventEClass, START_EVENT__EVENT_TYPE);

		subprocessEClass = createEClass(SUBPROCESS);
		createEReference(subprocessEClass, SUBPROCESS__PROCESS_REF);
		createEAttribute(subprocessEClass, SUBPROCESS__IS_MULTI_INSTANCE);

		taskEClass = createEClass(TASK);

		throwEventEClass = createEClass(THROW_EVENT);

		xorGatewayEClass = createEClass(XOR_GATEWAY);

		// Create enums
		eventTypeEEnum = createEEnum(EVENT_TYPE);
		gatewayDirectionEEnum = createEEnum(GATEWAY_DIRECTION);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(this.getFlowNode());
		andGatewayEClass.getESuperTypes().add(this.getGateway());
		boundaryEventEClass.getESuperTypes().add(this.getCatchEvent());
		catchEventEClass.getESuperTypes().add(this.getEvent());
		endEventEClass.getESuperTypes().add(this.getThrowEvent());
		eventEClass.getESuperTypes().add(this.getFlowNode());
		flowNodeEClass.getESuperTypes().add(this.getFlowElement());
		gatewayEClass.getESuperTypes().add(this.getFlowNode());
		intermediateCatchEventEClass.getESuperTypes().add(this.getCatchEvent());
		intermediateThrowEventEClass.getESuperTypes().add(this.getThrowEvent());
		orGatewayEClass.getESuperTypes().add(this.getGateway());
		processEClass.getESuperTypes().add(this.getFlowElementContainer());
		sequenceFlowEClass.getESuperTypes().add(this.getFlowElement());
		startEventEClass.getESuperTypes().add(this.getCatchEvent());
		subprocessEClass.getESuperTypes().add(this.getActivity());
		taskEClass.getESuperTypes().add(this.getActivity());
		throwEventEClass.getESuperTypes().add(this.getEvent());
		xorGatewayEClass.getESuperTypes().add(this.getGateway());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_BoundaryEventRefs(), this.getBoundaryEvent(), this.getBoundaryEvent_AttachedToRef(), "boundaryEventRefs", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_IsLoop(), ecorePackage.getEBoolean(), "isLoop", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andGatewayEClass, ANDGateway.class, "ANDGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundaryEventEClass, BoundaryEvent.class, "BoundaryEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundaryEvent_EventType(), this.getEventType(), "eventType", null, 1, 1, BoundaryEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundaryEvent_CancelActivity(), ecorePackage.getEBoolean(), "cancelActivity", null, 1, 1, BoundaryEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundaryEvent_AttachedToRef(), this.getActivity(), this.getActivity_BoundaryEventRefs(), "attachedToRef", null, 1, 1, BoundaryEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catchEventEClass, CatchEvent.class, "CatchEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowElementContainerEClass, FlowElementContainer.class, "FlowElementContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowElementContainer_FlowElements(), this.getFlowElement(), null, "flowElements", null, 0, -1, FlowElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowElementContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, FlowElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowElementContainer_Resource(), this.getResourceRole(), this.getResourceRole_Processes(), "resource", null, 1, 1, FlowElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowNodeEClass, FlowNode.class, "FlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Incoming(), this.getSequenceFlow(), this.getSequenceFlow_TargetRef(), "incoming", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Outgoing(), this.getSequenceFlow(), this.getSequenceFlow_SourceRef(), "outgoing", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayEClass, Gateway.class, "Gateway", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_GatewayDirection(), this.getGatewayDirection(), "gatewayDirection", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermediateCatchEventEClass, IntermediateCatchEvent.class, "IntermediateCatchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermediateCatchEvent_EventType(), this.getEventType(), "eventType", null, 1, 1, IntermediateCatchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermediateThrowEventEClass, IntermediateThrowEvent.class, "IntermediateThrowEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermediateThrowEvent_EventType(), this.getEventType(), "eventType", null, 1, 1, IntermediateThrowEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orGatewayEClass, ORGateway.class, "ORGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processEClass, BPMN4GAMA.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceRoleEClass, ResourceRole.class, "ResourceRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRole_Processes(), this.getFlowElementContainer(), this.getFlowElementContainer_Resource(), "processes", null, 0, -1, ResourceRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceFlowEClass, SequenceFlow.class, "SequenceFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceFlow_TargetRef(), this.getFlowNode(), this.getFlowNode_Incoming(), "targetRef", null, 1, 1, SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceFlow_SourceRef(), this.getFlowNode(), this.getFlowNode_Outgoing(), "sourceRef", null, 1, 1, SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartEvent_EventType(), this.getEventType(), "eventType", null, 0, 1, StartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprocessEClass, Subprocess.class, "Subprocess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprocess_ProcessRef(), this.getProcess(), null, "processRef", null, 1, 1, Subprocess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubprocess_IsMultiInstance(), ecorePackage.getEBoolean(), "isMultiInstance", null, 1, 1, Subprocess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(throwEventEClass, ThrowEvent.class, "ThrowEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorGatewayEClass, XORGateway.class, "XORGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.MESSAGE);
		addEEnumLiteral(eventTypeEEnum, EventType.SIGNAL);

		initEEnum(gatewayDirectionEEnum, GatewayDirection.class, "GatewayDirection");
		addEEnumLiteral(gatewayDirectionEEnum, GatewayDirection.UNSPECIFIED);
		addEEnumLiteral(gatewayDirectionEEnum, GatewayDirection.CONVERGING);
		addEEnumLiteral(gatewayDirectionEEnum, GatewayDirection.DIVERGING);
		addEEnumLiteral(gatewayDirectionEEnum, GatewayDirection.MIXED);

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
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
		addAnnotation
		  (endEventEClass,
		   source,
		   new String[] {
			   "constraints", "noOutgoingFlow"
		   });
		addAnnotation
		  (flowElementContainerEClass,
		   source,
		   new String[] {
			   "constraints", "onlyOneStartEvent"
		   });
		addAnnotation
		  (startEventEClass,
		   source,
		   new String[] {
			   "constraints", "noIncomingFlow"
		   });
		addAnnotation
		  (taskEClass,
		   source,
		   new String[] {
			   "constraints", "oneIn oneOut"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (endEventEClass,
		   source,
		   new String[] {
			   "noOutgoingFlow", "self.outgoing->size() = 0"
		   });
		addAnnotation
		  (flowElementContainerEClass,
		   source,
		   new String[] {
			   "onlyOneStartEvent", "\n\t\tself.flowElements->select(e | e.oclIsTypeOf(StartEvent) )->size() = 1"
		   });
		addAnnotation
		  (startEventEClass,
		   source,
		   new String[] {
			   "noIncomingFlow", "self.incoming->size() = 0"
		   });
		addAnnotation
		  (taskEClass,
		   source,
		   new String[] {
			   "oneIn", "self.incoming->size() = 1",
			   "oneOut", "self.outgoing->size() = 1"
		   });
	}

} //BPMN4GAMAPackageImpl
