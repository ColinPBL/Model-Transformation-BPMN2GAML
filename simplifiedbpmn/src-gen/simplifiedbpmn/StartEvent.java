/**
 */
package simplifiedbpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.StartEvent#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getStartEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noIncomingFlow'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noIncomingFlow='self.incoming-&gt;size() = 0'"
 * @generated
 */
public interface StartEvent extends CatchEvent {

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link simplifiedbpmn.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see simplifiedbpmn.EventType
	 * @see #setEventType(EventType)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getStartEvent_EventType()
	 * @model
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.StartEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see simplifiedbpmn.EventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);
} // StartEvent
