/**
 */
package simplifiedbpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Catch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.IntermediateCatchEvent#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getIntermediateCatchEvent()
 * @model
 * @generated
 */
public interface IntermediateCatchEvent extends CatchEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link simplifiedbpmn.IntermediateEventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see simplifiedbpmn.IntermediateEventType
	 * @see #setEventType(IntermediateEventType)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getIntermediateCatchEvent_EventType()
	 * @model required="true"
	 * @generated
	 */
	IntermediateEventType getEventType();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.IntermediateCatchEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see simplifiedbpmn.IntermediateEventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(IntermediateEventType value);

} // IntermediateCatchEvent
