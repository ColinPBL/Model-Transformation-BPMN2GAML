/**
 */
package simplifiedbpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Throw Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.IntermediateThrowEvent#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getIntermediateThrowEvent()
 * @model
 * @generated
 */
public interface IntermediateThrowEvent extends ThrowEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link simplifiedbpmn.IntermediateEventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see simplifiedbpmn.IntermediateEventType
	 * @see #setEventType(IntermediateEventType)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getIntermediateThrowEvent_EventType()
	 * @model required="true"
	 * @generated
	 */
	IntermediateEventType getEventType();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.IntermediateThrowEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see simplifiedbpmn.IntermediateEventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(IntermediateEventType value);

} // IntermediateThrowEvent
