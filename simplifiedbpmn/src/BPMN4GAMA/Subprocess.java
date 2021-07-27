/**
 */
package BPMN4GAMA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprocess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BPMN4GAMA.Subprocess#getProcessRef <em>Process Ref</em>}</li>
 *   <li>{@link BPMN4GAMA.Subprocess#isIsMultiInstance <em>Is Multi Instance</em>}</li>
 * </ul>
 *
 * @see BPMN4GAMA.BPMN4GAMAPackage#getSubprocess()
 * @model
 * @generated
 */
public interface Subprocess extends Activity {
	/**
	 * Returns the value of the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Ref</em>' reference.
	 * @see #setProcessRef(BPMN4GAMA.Process)
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getSubprocess_ProcessRef()
	 * @model required="true"
	 * @generated
	 */
	BPMN4GAMA.Process getProcessRef();

	/**
	 * Sets the value of the '{@link BPMN4GAMA.Subprocess#getProcessRef <em>Process Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ref</em>' reference.
	 * @see #getProcessRef()
	 * @generated
	 */
	void setProcessRef(BPMN4GAMA.Process value);

	/**
	 * Returns the value of the '<em><b>Is Multi Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multi Instance</em>' attribute.
	 * @see #setIsMultiInstance(boolean)
	 * @see BPMN4GAMA.BPMN4GAMAPackage#getSubprocess_IsMultiInstance()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMultiInstance();

	/**
	 * Sets the value of the '{@link BPMN4GAMA.Subprocess#isIsMultiInstance <em>Is Multi Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multi Instance</em>' attribute.
	 * @see #isIsMultiInstance()
	 * @generated
	 */
	void setIsMultiInstance(boolean value);

} // Subprocess
