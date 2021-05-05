/**
 */
package simplifiedbpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.ResourceRole#getName <em>Name</em>}</li>
 *   <li>{@link simplifiedbpmn.ResourceRole#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getResourceRole()
 * @model
 * @generated
 */
public interface ResourceRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getResourceRole_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.ResourceRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' reference list.
	 * The list contents are of type {@link simplifiedbpmn.FlowElementContainer}.
	 * It is bidirectional and its opposite is '{@link simplifiedbpmn.FlowElementContainer#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' reference list.
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getResourceRole_Processes()
	 * @see simplifiedbpmn.FlowElementContainer#getResource
	 * @model opposite="resource"
	 * @generated
	 */
	EList<FlowElementContainer> getProcesses();

} // ResourceRole
