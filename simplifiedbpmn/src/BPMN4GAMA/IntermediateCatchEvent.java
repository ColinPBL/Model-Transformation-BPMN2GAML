/**
 */
package BPMN4GAMA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Catch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMN4GAMA.IntermediateCatchEvent#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see BPMN4GAMA.BPMN4GAMAPackage#getIntermediateCatchEvent()
 * @model
 * @generated
 */
public interface IntermediateCatchEvent extends CatchEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMN4GAMA.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see BPMN4GAMA.EventType
	 * @see #setEventType(EventType)
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getIntermediateCatchEvent_EventType()
	 * @model required="true"
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link BPMN4GAMA.IntermediateCatchEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see BPMN4GAMA.EventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);

} // IntermediateCatchEvent
