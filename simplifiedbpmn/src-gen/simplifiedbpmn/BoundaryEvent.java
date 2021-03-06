/**
 */
package simplifiedbpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.BoundaryEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link simplifiedbpmn.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}</li>
 *   <li>{@link simplifiedbpmn.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getBoundaryEvent()
 * @model
 * @generated
 */
public interface BoundaryEvent extends CatchEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link simplifiedbpmn.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see simplifiedbpmn.EventType
	 * @see #setEventType(EventType)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getBoundaryEvent_EventType()
	 * @model required="true"
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.BoundaryEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see simplifiedbpmn.EventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);

	/**
	 * Returns the value of the '<em><b>Cancel Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Activity</em>' attribute.
	 * @see #setCancelActivity(boolean)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getBoundaryEvent_CancelActivity()
	 * @model required="true"
	 * @generated
	 */
	boolean isCancelActivity();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Activity</em>' attribute.
	 * @see #isCancelActivity()
	 * @generated
	 */
	void setCancelActivity(boolean value);

	/**
	 * Returns the value of the '<em><b>Attached To Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplifiedbpmn.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached To Ref</em>' reference.
	 * @see #setAttachedToRef(Activity)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getBoundaryEvent_AttachedToRef()
	 * @see simplifiedbpmn.Activity#getBoundaryEventRefs
	 * @model opposite="boundaryEventRefs" required="true"
	 * @generated
	 */
	Activity getAttachedToRef();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached To Ref</em>' reference.
	 * @see #getAttachedToRef()
	 * @generated
	 */
	void setAttachedToRef(Activity value);

} // BoundaryEvent
