/**
 */
package sa_SynthesisCommand.tests;

import junit.textui.TestRunner;

import sa_SynthesisCommand.SaFactory;
import sa_SynthesisCommand.TimerFired;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timer Fired</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimerFiredTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimerFiredTest.class);
	}

	/**
	 * Constructs a new Timer Fired test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerFiredTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timer Fired test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimerFired getFixture() {
		return (TimerFired)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createTimerFired());
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

} //TimerFiredTest
