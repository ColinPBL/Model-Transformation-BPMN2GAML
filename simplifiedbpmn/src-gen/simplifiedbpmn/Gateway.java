/**
 */
package simplifiedbpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplifiedbpmn.Gateway#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getGateway()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isJoinOrFork'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL isJoinOrFork='\n\t\tif self.type = 1 then\n\t\t\t(self.outgoing-&gt;size() = 1 and self.incoming-&gt;size() &gt; 1)\n\t\telse\n\t\t\t(self.incoming-&gt;size() = 1 and self.outgoing-&gt;size() &gt; 1)\n\t\tendif'"
 * @generated
 */
public interface Gateway extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link simplifiedbpmn.GatewayDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see simplifiedbpmn.GatewayDirection
	 * @see #setType(GatewayDirection)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getGateway_Type()
	 * @model required="true"
	 * @generated
	 */
	GatewayDirection getType();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.Gateway#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see simplifiedbpmn.GatewayDirection
	 * @see #getType()
	 * @generated
	 */
	void setType(GatewayDirection value);

} // Gateway
