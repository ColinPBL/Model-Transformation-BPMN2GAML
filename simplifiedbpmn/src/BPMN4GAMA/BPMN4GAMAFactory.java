/**
 */
package BPMN4GAMA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BPMN4GAMA.BPMN4GAMAPackage
 * @generated
 */
public interface BPMN4GAMAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPMN4GAMAFactory eINSTANCE = BPMN4GAMA.impl.BPMN4GAMAFactoryImpl.init();

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
	 * Returns a new object of class '<em>Subprocess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprocess</em>'.
	 * @generated
	 */
	Subprocess createSubprocess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BPMN4GAMAPackage getBPMN4GAMAPackage();

} //BPMN4GAMAFactory
