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
 *   <li>{@link simplifiedbpmn.Gateway#getGatewayDirection <em>Gateway Direction</em>}</li>
 * </ul>
 *
 * @see simplifiedbpmn.SimplifiedbpmnPackage#getGateway()
 * @model abstract="true"
 * @generated
 */
public interface Gateway extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Gateway Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link simplifiedbpmn.GatewayDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Direction</em>' attribute.
	 * @see simplifiedbpmn.GatewayDirection
	 * @see #setGatewayDirection(GatewayDirection)
	 * @see simplifiedbpmn.SimplifiedbpmnPackage#getGateway_GatewayDirection()
	 * @model required="true"
	 * @generated
	 */
	GatewayDirection getGatewayDirection();

	/**
	 * Sets the value of the '{@link simplifiedbpmn.Gateway#getGatewayDirection <em>Gateway Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Direction</em>' attribute.
	 * @see simplifiedbpmn.GatewayDirection
	 * @see #getGatewayDirection()
	 * @generated
	 */
	void setGatewayDirection(GatewayDirection value);

} // Gateway
