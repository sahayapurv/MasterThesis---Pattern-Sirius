/**
 */
package sa_SynthesisUtilize.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import sa_SynthesisUtilize.PrimitiveDataDeclaration;
import sa_SynthesisUtilize.SaFactory;
import sa_SynthesisUtilize.SaPackage;

/**
 * This is the item provider adapter for a {@link sa_SynthesisUtilize.PrimitiveDataDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveDataDeclarationItemProvider extends DataDeclarationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataDeclarationItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PrimitiveDataDeclaration_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PrimitiveDataDeclaration_type_feature", "_UI_PrimitiveDataDeclaration_type"),
				 SaPackage.Literals.PRIMITIVE_DATA_DECLARATION__TYPE,
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
			childrenFeatures.add(SaPackage.Literals.PRIMITIVE_DATA_DECLARATION__VALUE_EXP);
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
	 * This returns PrimitiveDataDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrimitiveDataDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PrimitiveDataDeclaration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PrimitiveDataDeclaration_type") :
			getString("_UI_PrimitiveDataDeclaration_type") + " " + label;
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

		switch (notification.getFeatureID(PrimitiveDataDeclaration.class)) {
			case SaPackage.PRIMITIVE_DATA_DECLARATION__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SaPackage.PRIMITIVE_DATA_DECLARATION__VALUE_EXP:
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
				(SaPackage.Literals.PRIMITIVE_DATA_DECLARATION__VALUE_EXP,
				 SaFactory.eINSTANCE.createIntegerConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.PRIMITIVE_DATA_DECLARATION__VALUE_EXP,
				 SaFactory.eINSTANCE.createBooleanConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.PRIMITIVE_DATA_DECLARATION__VALUE_EXP,
				 SaFactory.eINSTANCE.createRealConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.PRIMITIVE_DATA_DECLARATION__VALUE_EXP,
				 SaFactory.eINSTANCE.createStringConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.PRIMITIVE_DATA_DECLARATION__VALUE_EXP,
				 SaFactory.eINSTANCE.createEnumConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.PRIMITIVE_DATA_DECLARATION__VALUE_EXP,
				 SaFactory.eINSTANCE.createStructureConst()));
	}

}
