/**
 */
package sa_SynthesisCommand.tests;

import junit.textui.TestRunner;

import sa_SynthesisCommand.SaFactory;
import sa_SynthesisCommand.StartTimer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start Timer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StartTimerTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartTimerTest.class);
	}

	/**
	 * Constructs a new Start Timer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Start Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StartTimer getFixture() {
		return (StartTimer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createStartTimer());
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

} //StartTimerTest
