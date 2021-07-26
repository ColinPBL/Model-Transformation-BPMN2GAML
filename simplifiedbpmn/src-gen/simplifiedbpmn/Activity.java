/**
 */
package simplifiedbpmn;

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
 *   <li>{@link simplifiedbpmn.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 *   <li>{@link simplifiedbpmn.Activity#isIsLoop <em>Is Loop</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends FlowNode {

	/**
	 * Returns the value of the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * The list contents are of type {@link simplifiedbpmn.BoundaryEvent}.
	 * It is bidirectional and its opposite is '{@link simplifiedbpmn.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Event Refs</em>' reference list.
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getActivity_BoundaryEventRefs()
	 * @see simplifiedbpmn.BoundaryEvent#getAttachedToRef
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
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getActivity_IsLoop()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsLoop();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.Activity#isIsLoop <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Loop</em>' attribute.
	 * @see #isIsLoop()
	 * @generated
	 */
	void setIsLoop(boolean value);
} // Activity
