/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.SaFactory;
import sa.SenseAccelerometer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sense Accelerometer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SenseAccelerometerTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SenseAccelerometerTest.class);
	}

	/**
	 * Constructs a new Sense Accelerometer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenseAccelerometerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sense Accelerometer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SenseAccelerometer getFixture() {
		return (SenseAccelerometer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createSenseAccelerometer());
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

} //SenseAccelerometerTest
