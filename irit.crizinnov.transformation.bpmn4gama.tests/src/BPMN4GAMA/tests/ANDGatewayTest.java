/**
 */
package BPMN4GAMA.tests;

import BPMN4GAMA.ANDGateway;
import BPMN4GAMA.BPMN4GAMAFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>AND Gateway</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ANDGatewayTest extends GatewayTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ANDGatewayTest.class);
	}

	/**
	 * Constructs a new AND Gateway test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDGatewayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this AND Gateway test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ANDGateway getFixture() {
		return (ANDGateway)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMN4GAMAFactory.eINSTANCE.createANDGateway());
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

} //ANDGatewayTest
