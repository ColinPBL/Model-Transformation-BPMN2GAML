/**
 */
package simplifiedbpmn.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import simplifiedbpmn.Activity;
import simplifiedbpmn.BoundaryEvent;
import simplifiedbpmn.SimplifiedbpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.impl.ActivityImpl#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends FlowNodeImpl implements Activity {
	/**
	 * The cached value of the '{@link #getBoundaryEventRefs() <em>Boundary Event Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryEventRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundaryEvent> boundaryEventRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplifiedbpmnPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundaryEvent> getBoundaryEventRefs() {
		if (boundaryEventRefs == null) {
			boundaryEventRefs = new EObjectWithInverseResolvingEList<BoundaryEvent>(BoundaryEvent.class, this,
					SimplifiedbpmnPackage.ACTIVITY__BOUNDARY_EVENT_REFS,
					SimplifiedbpmnPackage.BOUNDARY_EVENT__ATTACHED_TO_REF);
		}
		return boundaryEventRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplifiedbpmnPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBoundaryEventRefs()).basicAdd(otherEnd,
					msgs);
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
		case SimplifiedbpmnPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
			return ((InternalEList<?>) getBoundaryEventRefs()).basicRemove(otherEnd, msgs);
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
		case SimplifiedbpmnPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
			return getBoundaryEventRefs();
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
		case SimplifiedbpmnPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
			getBoundaryEventRefs().clear();
			getBoundaryEventRefs().addAll((Collection<? extends BoundaryEvent>) newValue);
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
		case SimplifiedbpmnPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
			getBoundaryEventRefs().clear();
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
		case SimplifiedbpmnPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
			return boundaryEventRefs != null && !boundaryEventRefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
