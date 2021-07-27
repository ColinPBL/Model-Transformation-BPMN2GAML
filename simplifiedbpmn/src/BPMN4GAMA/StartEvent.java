/**
 */
package BPMN4GAMA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMN4GAMA.StartEvent#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see BPMN4GAMA.BPMN4GAMAPackage#getStartEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noIncomingFlow'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noIncomingFlow='self.incoming-&gt;size() = 0'"
 * @generated
 */
public interface StartEvent extends CatchEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMN4GAMA.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see BPMN4GAMA.EventType
	 * @see #setEventType(EventType)
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getStartEvent_EventType()
	 * @model
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link BPMN4GAMA.StartEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see BPMN4GAMA.EventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);

} // StartEvent
