/**
 */
package BPMN4GAMA.tests;

import BPMN4GAMA.BPMN4GAMAFactory;
import BPMN4GAMA.BoundaryEvent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundaryEventTest extends CatchEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoundaryEventTest.class);
	}

	/**
	 * Constructs a new Boundary Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boundary Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BoundaryEvent getFixture() {
		return (BoundaryEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMN4GAMAFactory.eINSTANCE.createBoundaryEvent());
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

} //BoundaryEventTest
