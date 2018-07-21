/**
 */
package sa_CollectOrganize.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import sa_CollectOrganize.ArithmeticExpr;
import sa_CollectOrganize.SaFactory;
import sa_CollectOrganize.SaPackage;

/**
 * This is the item provider adapter for a {@link sa_CollectOrganize.ArithmeticExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmeticExprItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExprItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArithmeticExpr_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArithmeticExpr_operator_feature", "_UI_ArithmeticExpr_type"),
				 SaPackage.Literals.ARITHMETIC_EXPR__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND);
			childrenFeatures.add(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ArithmeticExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArithmeticExpr"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArithmeticExpr)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArithmeticExpr_type") :
			getString("_UI_ArithmeticExpr_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ArithmeticExpr.class)) {
			case SaPackage.ARITHMETIC_EXPR__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SaPackage.ARITHMETIC_EXPR__LEFT_OPERAND:
			case SaPackage.ARITHMETIC_EXPR__RIGHT_OPERAND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createIntegerConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createBooleanConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createRealConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createStringConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createEnumConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createStructureConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createNullExp()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createDataRef()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createStructureMemberRef()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createArithmeticExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createBooleanExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND,
				 SaFactory.eINSTANCE.createRelationalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createIntegerConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createBooleanConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createRealConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createStringConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createEnumConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createStructureConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createNullExp()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createDataRef()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createStructureMemberRef()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createArithmeticExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createBooleanExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND,
				 SaFactory.eINSTANCE.createRelationalExpr()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SaPackage.Literals.ARITHMETIC_EXPR__LEFT_OPERAND ||
			childFeature == SaPackage.Literals.ARITHMETIC_EXPR__RIGHT_OPERAND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
