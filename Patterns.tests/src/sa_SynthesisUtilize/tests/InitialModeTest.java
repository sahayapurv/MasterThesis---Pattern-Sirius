/**
 */
package sa_SynthesisUtilize.tests;

import junit.textui.TestRunner;

import sa_SynthesisUtilize.InitialMode;
import sa_SynthesisUtilize.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initial Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitialModeTest extends ModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitialModeTest.class);
	}

	/**
	 * Constructs a new Initial Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialModeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Initial Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InitialMode getFixture() {
		return (InitialMode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createInitialMode());
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

} //InitialModeTest
