/**
 */
package sa_CollectOrganize.tests;

import junit.textui.TestRunner;

import sa_CollectOrganize.SaFactory;
import sa_CollectOrganize.ServiceCall;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceCallTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceCallTest.class);
	}

	/**
	 * Constructs a new Service Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Service Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServiceCall getFixture() {
		return (ServiceCall)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createServiceCall());
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

} //ServiceCallTest
