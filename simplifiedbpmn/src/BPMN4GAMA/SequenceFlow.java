/**
 */
package BPMN4GAMA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMN4GAMA.SequenceFlow#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link BPMN4GAMA.SequenceFlow#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @see BPMN4GAMA.BPMN4GAMAPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link BPMN4GAMA.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(FlowNode)
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getSequenceFlow_TargetRef()
	 * @see BPMN4GAMA.FlowNode#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	FlowNode getTargetRef();

	/**
	 * Sets the value of the '{@link BPMN4GAMA.SequenceFlow#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link BPMN4GAMA.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(FlowNode)
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getSequenceFlow_SourceRef()
	 * @see BPMN4GAMA.FlowNode#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	FlowNode getSourceRef();

	/**
	 * Sets the value of the '{@link BPMN4GAMA.SequenceFlow#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(FlowNode value);

} // SequenceFlow
