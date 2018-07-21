/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.SaFactory;
import sa.StopTimer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stop Timer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StopTimerTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StopTimerTest.class);
	}

	/**
	 * Constructs a new Stop Timer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopTimerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stop Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StopTimer getFixture() {
		return (StopTimer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createStopTimer());
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

} //StopTimerTest
