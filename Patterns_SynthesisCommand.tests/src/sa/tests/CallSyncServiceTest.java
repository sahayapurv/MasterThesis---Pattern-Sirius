/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.CallSyncService;
import sa.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call Sync Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallSyncServiceTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallSyncServiceTest.class);
	}

	/**
	 * Constructs a new Call Sync Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallSyncServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call Sync Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CallSyncService getFixture() {
		return (CallSyncService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createCallSyncService());
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

} //CallSyncServiceTest
