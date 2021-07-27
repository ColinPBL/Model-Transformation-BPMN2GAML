/**
 */
package BPMN4GAMA.tests;

import BPMN4GAMA.BPMN4GAMAFactory;
import BPMN4GAMA.ResourceRole;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceRoleTest extends TestCase {

	/**
	 * The fixture for this Resource Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRole fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceRoleTest.class);
	}

	/**
	 * Constructs a new Resource Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRoleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceRole fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRole getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMN4GAMAFactory.eINSTANCE.createResourceRole());
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

} //ResourceRoleTest
