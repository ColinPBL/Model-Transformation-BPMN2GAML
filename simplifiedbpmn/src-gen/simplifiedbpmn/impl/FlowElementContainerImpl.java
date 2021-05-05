/**
 */
package simplifiedbpmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplifiedbpmn.FlowElement;
import simplifiedbpmn.FlowElementContainer;
import simplifiedbpmn.ResourceRole;
import simplifiedbpmn.SimplifiedbpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Element Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.impl.FlowElementContainerImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link simplifiedbpmn.impl.FlowElementContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplifiedbpmn.impl.FlowElementContainerImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowElementContainerImpl extends MinimalEObjectImpl.Container implements FlowElementContainer {
	/**
	 * The cached value of the '{@link #getFlowElements() <em>Flow Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowElement> flowElements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected ResourceRole resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowElementContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplifiedbpmnPackage.Literals.FLOW_ELEMENT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowElement> getFlowElements() {
		if (flowElements == null) {
			flowElements = new EObjectContainmentEList<FlowElement>(FlowElement.class, this,
					SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS);
		}
		return flowElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject) resource;
			resource = (ResourceRole) eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(ResourceRole newResource, NotificationChain msgs) {
		ResourceRole oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__RESOURCE, oldResource, newResource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(ResourceRole newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject) resource).eInverseRemove(this, SimplifiedbpmnPackage.RESOURCE_ROLE__PROCESSES,
						ResourceRole.class, msgs);
			if (newResource != null)
				msgs = ((InternalEObject) newResource).eInverseAdd(this, SimplifiedbpmnPackage.RESOURCE_ROLE__PROCESSES,
						ResourceRole.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__RESOURCE:
			if (resource != null)
				msgs = ((InternalEObject) resource).eInverseRemove(this, SimplifiedbpmnPackage.RESOURCE_ROLE__PROCESSES,
						ResourceRole.class, msgs);
			return basicSetResource((ResourceRole) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS:
			return ((InternalEList<?>) getFlowElements()).basicRemove(otherEnd, msgs);
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__RESOURCE:
			return basicSetResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS:
			return getFlowElements();
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__NAME:
			return getName();
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__RESOURCE:
			if (resolve)
				return getResource();
			return basicGetResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS:
			getFlowElements().clear();
			getFlowElements().addAll((Collection<? extends FlowElement>) newValue);
			return;
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__NAME:
			setName((String) newValue);
			return;
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__RESOURCE:
			setResource((ResourceRole) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS:
			getFlowElements().clear();
			return;
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__RESOURCE:
			setResource((ResourceRole) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS:
			return flowElements != null && !flowElements.isEmpty();
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimplifiedbpmnPackage.FLOW_ELEMENT_CONTAINER__RESOURCE:
			return resource != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FlowElementContainerImpl
