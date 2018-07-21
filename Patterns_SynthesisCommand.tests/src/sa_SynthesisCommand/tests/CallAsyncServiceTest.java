/**
 */
package sa_SynthesisCommand.tests;

import junit.textui.TestRunner;

import sa_SynthesisCommand.CallAsyncService;
import sa_SynthesisCommand.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call Async Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallAsyncServiceTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallAsyncServiceTest.class);
	}

	/**
	 * Constructs a new Call Async Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallAsyncServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call Async Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CallAsyncService getFixture() {
		return (CallAsyncService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createCallAsyncService());
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

} //CallAsyncServiceTest
