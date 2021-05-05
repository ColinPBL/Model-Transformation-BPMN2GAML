/**
 */
package simplifiedbpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneIn oneOut'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneIn='self.incoming-&gt;size() = 1' oneOut='self.outgoing-&gt;size() = 1'"
 * @generated
 */
public interface Task extends Activity {
} // Task
