/**
 */
package BPMN4GAMA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMN4GAMA.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 *   <li>{@link BPMN4GAMA.Activity#isIsLoop <em>Is Loop</em>}</li>
 * </ul>
 *
 * @see BPMN4GAMA.BPMN4GAMAPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN4GAMA.BoundaryEvent}.
	 * It is bidirectional and its opposite is '{@link BPMN4GAMA.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Event Refs</em>' reference list.
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getActivity_BoundaryEventRefs()
	 * @see BPMN4GAMA.BoundaryEvent#getAttachedToRef
	 * @model opposite="attachedToRef"
	 * @generated
	 */
	EList<BoundaryEvent> getBoundaryEventRefs();

	/**
	 * Returns the value of the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Loop</em>' attribute.
	 * @see #setIsLoop(boolean)
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getActivity_IsLoop()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsLoop();

	/**
	 * Sets the value of the '{@link BPMN4GAMA.Activity#isIsLoop <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Loop</em>' attribute.
	 * @see #isIsLoop()
	 * @generated
	 */
	void setIsLoop(boolean value);

} // Activity
