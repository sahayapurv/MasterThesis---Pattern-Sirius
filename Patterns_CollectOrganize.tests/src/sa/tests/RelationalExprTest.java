/**
 */
package sa.tests;

import junit.textui.TestRunner;

import sa.RelationalExpr;
import sa.SaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relational Expr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalExprTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationalExprTest.class);
	}

	/**
	 * Constructs a new Relational Expr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExprTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relational Expr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationalExpr getFixture() {
		return (RelationalExpr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SaFactory.eINSTANCE.createRelationalExpr());
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

} //RelationalExprTest
