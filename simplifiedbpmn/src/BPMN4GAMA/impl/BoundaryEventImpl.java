/**
 */
package BPMN4GAMA.impl;

import BPMN4GAMA.Activity;
import BPMN4GAMA.BPMN4GAMAPackage;
import BPMN4GAMA.BoundaryEvent;
import BPMN4GAMA.EventType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BPMN4GAMA.impl.BoundaryEventImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link BPMN4GAMA.impl.BoundaryEventImpl#isCancelActivity <em>Cancel Activity</em>}</li>
 *   <li>{@link BPMN4GAMA.impl.BoundaryEventImpl#getAttachedToRef <em>Attached To Ref</em>}</li>
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
	protected static final EventType EVENT_TYPE_EDEFAULT = EventType.MESSAGE;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected EventType eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCancelActivity() <em>Cancel Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelActivity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCEL_ACTIVITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCancelActivity() <em>Cancel Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelActivity()
	 * @generated
	 * @ordered
	 */
	protected boolean cancelActivity = CANCEL_ACTIVITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttachedToRef() <em>Attached To Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedToRef()
	 * @generated
	 * @ordered
	 */
	protected Activity attachedToRef;

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
		return BPMN4GAMAPackage.Literals.BOUNDARY_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventType(EventType newEventType) {
		EventType oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN4GAMAPackage.BOUNDARY_EVENT__EVENT_TYPE, oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCancelActivity() {
		return cancelActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelActivity(boolean newCancelActivity) {
		boolean oldCancelActivity = cancelActivity;
		cancelActivity = newCancelActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN4GAMAPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY, oldCancelActivity, cancelActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getAttachedToRef() {
		if (attachedToRef != null && attachedToRef.eIsProxy()) {
			InternalEObject oldAttachedToRef = (InternalEObject)attachedToRef;
			attachedToRef = (Activity)eResolveProxy(oldAttachedToRef);
			if (attachedToRef != oldAttachedToRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF, oldAttachedToRef, attachedToRef));
			}
		}
		return attachedToRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetAttachedToRef() {
		return attachedToRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachedToRef(Activity newAttachedToRef, NotificationChain msgs) {
		Activity oldAttachedToRef = attachedToRef;
		attachedToRef = newAttachedToRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF, oldAttachedToRef, newAttachedToRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachedToRef(Activity newAttachedToRef) {
		if (newAttachedToRef != attachedToRef) {
			NotificationChain msgs = null;
			if (attachedToRef != null)
				msgs = ((InternalEObject)attachedToRef).eInverseRemove(this, BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS, Activity.class, msgs);
			if (newAttachedToRef != null)
				msgs = ((InternalEObject)newAttachedToRef).eInverseAdd(this, BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS, Activity.class, msgs);
			msgs = basicSetAttachedToRef(newAttachedToRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF, newAttachedToRef, newAttachedToRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
				if (attachedToRef != null)
					msgs = ((InternalEObject)attachedToRef).eInverseRemove(this, BPMN4GAMAPackage.ACTIVITY__BOUNDARY_EVENT_REFS, Activity.class, msgs);
				return basicSetAttachedToRef((Activity)otherEnd, msgs);
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
			case BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
				return basicSetAttachedToRef(null, msgs);
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
			case BPMN4GAMAPackage.BOUNDARY_EVENT__EVENT_TYPE:
				return getEventType();
			case BPMN4GAMAPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY:
				return isCancelActivity();
			case BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
				if (resolve) return getAttachedToRef();
				return basicGetAttachedToRef();
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
			case BPMN4GAMAPackage.BOUNDARY_EVENT__EVENT_TYPE:
				setEventType((EventType)newValue);
				return;
			case BPMN4GAMAPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY:
				setCancelActivity((Boolean)newValue);
				return;
			case BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
				setAttachedToRef((Activity)newValue);
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
			case BPMN4GAMAPackage.BOUNDARY_EVENT__EVENT_TYPE:
				setEventType(EVENT_TYPE_EDEFAULT);
				return;
			case BPMN4GAMAPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY:
				setCancelActivity(CANCEL_ACTIVITY_EDEFAULT);
				return;
			case BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
				setAttachedToRef((Activity)null);
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
			case BPMN4GAMAPackage.BOUNDARY_EVENT__EVENT_TYPE:
				return eventType != EVENT_TYPE_EDEFAULT;
			case BPMN4GAMAPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY:
				return cancelActivity != CANCEL_ACTIVITY_EDEFAULT;
			case BPMN4GAMAPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
				return attachedToRef != null;
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
		result.append(" (eventType: ");
		result.append(eventType);
		result.append(", cancelActivity: ");
		result.append(cancelActivity);
		result.append(')');
		return result.toString();
	}

} //BoundaryEventImpl
