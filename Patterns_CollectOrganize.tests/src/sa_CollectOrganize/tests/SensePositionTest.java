/**
 */
package sa_CollectOrganize.tests;

import junit.textui.TestRunner;

import sa_CollectOrganize.SaFactory;
import sa_CollectOrganize.SensePosition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sense Position</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensePositionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensePositionTest.class);
	}

	/**
	 * Constructs a new Sense Position test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensePositionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sense Position test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SensePosition getFixture() {
		return (SensePosition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createSensePosition());
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

} //SensePositionTest
