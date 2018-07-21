/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.BooleanConst;
import sa.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Const</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanConstTest extends ConstantTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanConstTest.class);
	}

	/**
	 * Constructs a new Boolean Const test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConstTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Const test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanConst getFixture() {
		return (BooleanConst)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createBooleanConst());
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

} //BooleanConstTest
