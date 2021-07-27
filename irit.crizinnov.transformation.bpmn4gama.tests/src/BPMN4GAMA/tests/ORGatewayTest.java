/**
 */
package BPMN4GAMA.tests;

import BPMN4GAMA.BPMN4GAMAFactory;
import BPMN4GAMA.ORGateway;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OR Gateway</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ORGatewayTest extends GatewayTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ORGatewayTest.class);
	}

	/**
	 * Constructs a new OR Gateway test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORGatewayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OR Gateway test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ORGateway getFixture() {
		return (ORGateway)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMN4GAMAFactory.eINSTANCE.createORGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ORGatewayTest
