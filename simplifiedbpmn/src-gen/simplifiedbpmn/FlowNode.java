/**
 */
package simplifiedbpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.FlowNode#getName <em>Name</em>}</li>
 *   <li>{@link simplifiedbpmn.FlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link simplifiedbpmn.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface FlowNode extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getFlowNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.FlowNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link simplifiedbpmn.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link simplifiedbpmn.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getFlowNode_Incoming()
	 * @see simplifiedbpmn.SequenceFlow#getTargetRef
	 * @model opposite="targetRef"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link simplifiedbpmn.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link simplifiedbpmn.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getFlowNode_Outgoing()
	 * @see simplifiedbpmn.SequenceFlow#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

} // FlowNode
