/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.SaFactory;
import sa.ServiceCallback;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Callback</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceCallbackTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceCallbackTest.class);
	}

	/**
	 * Constructs a new Service Callback test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCallbackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Service Callback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServiceCallback getFixture() {
		return (ServiceCallback)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createServiceCallback());
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

} //ServiceCallbackTest
