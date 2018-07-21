/**
 */
package sa_CollectOrganize.tests;

import junit.textui.TestRunner;

import sa_CollectOrganize.ArithmeticExpr;
import sa_CollectOrganize.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arithmetic Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmeticExprTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArithmeticExprTest.class);
	}

	/**
	 * Constructs a new Arithmetic Expr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExprTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arithmetic Expr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArithmeticExpr getFixture() {
		return (ArithmeticExpr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createArithmeticExpr());
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

} //ArithmeticExprTest
