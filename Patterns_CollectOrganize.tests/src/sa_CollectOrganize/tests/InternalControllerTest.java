/**
 */
package sa_CollectOrganize.tests;

import junit.textui.TestRunner;

import sa_CollectOrganize.InternalController;
import sa_CollectOrganize.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Internal Controller</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalControllerTest extends ModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InternalControllerTest.class);
	}

	/**
	 * Constructs a new Internal Controller test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalControllerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Internal Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InternalController getFixture() {
		return (InternalController)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createInternalController());
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

} //InternalControllerTest
