/**
 */
package simplifiedbpmn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simplifiedbpmn.SimplifiedbpmnPackage
 * @generated
 */
public interface SimplifiedbpmnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplifiedbpmnFactory eINSTANCE = simplifiedbpmn.impl.SimplifiedbpmnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Flow</em>'.
	 * @generated
	 */
	SequenceFlow createSequenceFlow();

	/**
	 * Returns a new object of class '<em>AND Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND Gateway</em>'.
	 * @generated
	 */
	ANDGateway createANDGateway();

	/**
	 * Returns a new object of class '<em>XOR Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XOR Gateway</em>'.
	 * @generated
	 */
	XORGateway createXORGateway();

	/**
	 * Returns a new object of class '<em>OR Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR Gateway</em>'.
	 * @generated
	 */
	ORGateway createORGateway();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Event</em>'.
	 * @generated
	 */
	StartEvent createStartEvent();

	/**
	 * Returns a new object of class '<em>Intermediate Catch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Catch Event</em>'.
	 * @generated
	 */
	IntermediateCatchEvent createIntermediateCatchEvent();

	/**
	 * Returns a new object of class '<em>Boundary Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boundary Event</em>'.
	 * @generated
	 */
	BoundaryEvent createBoundaryEvent();

	/**
	 * Returns a new object of class '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event</em>'.
	 * @generated
	 */
	EndEvent createEndEvent();

	/**
	 * Returns a new object of class '<em>Intermediate Throw Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Throw Event</em>'.
	 * @generated
	 */
	IntermediateThrowEvent createIntermediateThrowEvent();

	/**
	 * Returns a new object of class '<em>Resource Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Role</em>'.
	 * @generated
	 */
	ResourceRole createResourceRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplifiedbpmnPackage getSimplifiedbpmnPackage();

} //SimplifiedbpmnFactory
