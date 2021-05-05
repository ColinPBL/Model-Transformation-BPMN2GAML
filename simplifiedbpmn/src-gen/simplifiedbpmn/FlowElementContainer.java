/**
 */
package simplifiedbpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Element Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.FlowElementContainer#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link simplifiedbpmn.FlowElementContainer#getName <em>Name</em>}</li>
 *   <li>{@link simplifiedbpmn.FlowElementContainer#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getFlowElementContainer()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyOneStartEvent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL onlyOneStartEvent='\n\t\tself.flowElements-&gt;select(e | e.oclIsTypeOf(StartEvent) )-&gt;size() = 1'"
 * @generated
 */
public interface FlowElementContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link simplifiedbpmn.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getFlowElementContainer_FlowElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getFlowElementContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.FlowElementContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplifiedbpmn.ResourceRole#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(ResourceRole)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getFlowElementContainer_Resource()
	 * @see simplifiedbpmn.ResourceRole#getProcesses
	 * @model opposite="processes" required="true"
	 * @generated
	 */
	ResourceRole getResource();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.FlowElementContainer#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceRole value);

} // FlowElementContainer
