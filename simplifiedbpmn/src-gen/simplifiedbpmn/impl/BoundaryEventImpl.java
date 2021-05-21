/**
 */
package simplifiedbpmn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplifiedbpmn.BoundaryEvent;
import simplifiedbpmn.IntermediateEventType;
import simplifiedbpmn.SimplifiedbpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.impl.BoundaryEventImpl#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundaryEventImpl extends CatchEventImpl implements BoundaryEvent {
	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final IntermediateEventType EVENT_TYPE_EDEFAULT = IntermediateEventType.MESSAGE;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected IntermediateEventType eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplifiedbpmnPackage.Literals.BOUNDARY_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEventType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(IntermediateEventType newEventType) {
		IntermediateEventType oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedbpmnPackage.BOUNDARY_EVENT__EVENT_TYPE,
					oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplifiedbpmnPackage.BOUNDARY_EVENT__EVENT_TYPE:
			return getEventType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplifiedbpmnPackage.BOUNDARY_EVENT__EVENT_TYPE:
			setEventType((IntermediateEventType) newValue);
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
		case SimplifiedbpmnPackage.BOUNDARY_EVENT__EVENT_TYPE:
			setEventType(EVENT_TYPE_EDEFAULT);
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
		case SimplifiedbpmnPackage.BOUNDARY_EVENT__EVENT_TYPE:
			return eventType != EVENT_TYPE_EDEFAULT;
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
		result.append(" (eventType: ");
		result.append(eventType);
		result.append(')');
		return result.toString();
	}

} //BoundaryEventImpl
