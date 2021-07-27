/**
 */
package BPMN4GAMA.tests;

import BPMN4GAMA.BPMN4GAMAFactory;
import BPMN4GAMA.Subprocess;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subprocess</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubprocessTest extends ActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubprocessTest.class);
	}

	/**
	 * Constructs a new Subprocess test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprocessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subprocess test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Subprocess getFixture() {
		return (Subprocess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMN4GAMAFactory.eINSTANCE.createSubprocess());
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

} //SubprocessTest
