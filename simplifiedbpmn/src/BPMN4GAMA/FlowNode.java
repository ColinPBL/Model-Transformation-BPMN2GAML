/**
 */
package BPMN4GAMA;

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
 *   <li>{@link BPMN4GAMA.FlowNode#getName <em>Name</em>}</li>
 *   <li>{@link BPMN4GAMA.FlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link BPMN4GAMA.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see BPMN4GAMA.BPMN4GAMAPackage#getFlowNode()
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
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getFlowNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BPMN4GAMA.FlowNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link BPMN4GAMA.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link BPMN4GAMA.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getFlowNode_Incoming()
	 * @see BPMN4GAMA.SequenceFlow#getTargetRef
	 * @model opposite="targetRef"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link BPMN4GAMA.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link BPMN4GAMA.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getFlowNode_Outgoing()
	 * @see BPMN4GAMA.SequenceFlow#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

} // FlowNode
