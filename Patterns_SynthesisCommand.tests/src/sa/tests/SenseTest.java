/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.SaFactory;
import sa.Sense;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sense</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SenseTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SenseTest.class);
	}

	/**
	 * Constructs a new Sense test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sense test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sense getFixture() {
		return (Sense)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createSense());
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

} //SenseTest
