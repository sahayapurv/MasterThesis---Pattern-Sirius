/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.SaFactory;
import sa.StringConst;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Const</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringConstTest extends ConstantTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringConstTest.class);
	}

	/**
	 * Constructs a new String Const test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Const test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringConst getFixture() {
		return (StringConst)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createStringConst());
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

} //StringConstTest
