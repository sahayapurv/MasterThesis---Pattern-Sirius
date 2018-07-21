/**
 */
package sa_SynthesisUtilize.tests;

import junit.textui.TestRunner;

import sa_SynthesisUtilize.ExternalMode;
import sa_SynthesisUtilize.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalModeTest extends ModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalModeTest.class);
	}

	/**
	 * Constructs a new External Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalModeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalMode getFixture() {
		return (ExternalMode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createExternalMode());
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

} //ExternalModeTest
