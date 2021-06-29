/**
 */
package simplifiedbpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprocess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.Subprocess#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getSubprocess()
 * @model
 * @generated
 */
public interface Subprocess extends Activity {
	/**
	 * Returns the value of the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Ref</em>' reference.
	 * @see #setProcessRef(simplifiedbpmn.Process)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getSubprocess_ProcessRef()
	 * @model required="true"
	 * @generated
	 */
	simplifiedbpmn.Process getProcessRef();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.Subprocess#getProcessRef <em>Process Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ref</em>' reference.
	 * @see #getProcessRef()
	 * @generated
	 */
	void setProcessRef(simplifiedbpmn.Process value);

} // Subprocess
