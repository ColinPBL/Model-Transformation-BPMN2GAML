/**
 */
package BPMN4GAMA.impl;

import BPMN4GAMA.Activity;
import BPMN4GAMA.BPMN4GAMAPackage;
import BPMN4GAMA.BoundaryEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BPMN4GAMA.impl.ActivityImpl#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 *   <li>{@link BPMN4GAMA.impl.ActivityImpl#isIsLoop <em>Is Loop</em>}</li>
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
	 * The default value of the '{@link #isIsLoop() <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLoop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLoop() <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLoop()
	 * @generated
	 * @ordered
	 */
	protected boolean isLoop = IS_LOOP_EDEFAULT;

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
		return BPMN4GAMAPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoundaryEvent> getBoundaryEventRefs() {
		if (boundaryEventRefs == null) {
			boundaryEventRefs = new EObjectWithInverseResolvingEList<BoundaryEvent>(BoundaryEvent.class, this, BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS, BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF);
		}
		return boundaryEventRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLoop() {
		return isLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLoop(boolean newIsLoop) {
		boolean oldIsLoop = isLoop;
		isLoop = newIsLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN4GAMAPackage.ACTIVITY__IS_LOOP, oldIsLoop, isLoop));
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
			case BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoundaryEventRefs()).basicAdd(otherEnd, msgs);
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
			case BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
				return ((InternalEList<?>)getBoundaryEventRefs()).basicRemove(otherEnd, msgs);
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
			case BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
				return getBoundaryEventRefs();
			case BPMN4GAMAPackage.ACTIVITY__IS_LOOP:
				return isIsLoop();
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
			case BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
				getBoundaryEventRefs().clear();
				getBoundaryEventRefs().addAll((Collection<? extends BoundaryEvent>)newValue);
				return;
			case BPMN4GAMAPackage.ACTIVITY__IS_LOOP:
				setIsLoop((Boolean)newValue);
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
			case BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
				getBoundaryEventRefs().clear();
				return;
			case BPMN4GAMAPackage.ACTIVITY__IS_LOOP:
				setIsLoop(IS_LOOP_EDEFAULT);
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
			case BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS:
				return boundaryEventRefs != null && !boundaryEventRefs.isEmpty();
			case BPMN4GAMAPackage.ACTIVITY__IS_LOOP:
				return isLoop != IS_LOOP_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isLoop: ");
		result.append(isLoop);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
