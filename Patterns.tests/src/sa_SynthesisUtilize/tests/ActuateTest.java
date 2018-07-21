/**
 */
package sa_SynthesisUtilize.tests;

import junit.textui.TestRunner;

import sa_SynthesisUtilize.Actuate;
import sa_SynthesisUtilize.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actuate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActuateTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActuateTest.class);
	}

	/**
	 * Constructs a new Actuate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actuate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Actuate getFixture() {
		return (Actuate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createActuate());
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

} //ActuateTest
