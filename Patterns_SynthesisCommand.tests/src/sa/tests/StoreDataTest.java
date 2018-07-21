/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.SaFactory;
import sa.StoreData;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Store Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoreDataTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StoreDataTest.class);
	}

	/**
	 * Constructs a new Store Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Store Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StoreData getFixture() {
		return (StoreData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createStoreData());
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

} //StoreDataTest
