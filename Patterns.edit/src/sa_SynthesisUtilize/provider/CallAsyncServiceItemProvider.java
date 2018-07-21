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

import sa_SynthesisUtilize.CallAsyncService;
import sa_SynthesisUtilize.SaFactory;
import sa_SynthesisUtilize.SaPackage;

/**
 * This is the item provider adapter for a {@link sa_SynthesisUtilize.CallAsyncService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CallAsyncServiceItemProvider extends ActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallAsyncServiceItemProvider(AdapterFactory adapterFactory) {
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

			addDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CallAsyncService_data_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CallAsyncService_data_feature", "_UI_CallAsyncService_type"),
				 SaPackage.Literals.CALL_ASYNC_SERVICE__DATA,
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
			childrenFeatures.add(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP);
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
	 * This returns CallAsyncService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CallAsyncService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CallAsyncService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CallAsyncService_type") :
			getString("_UI_CallAsyncService_type") + " " + label;
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

		switch (notification.getFeatureID(CallAsyncService.class)) {
			case SaPackage.CALL_ASYNC_SERVICE__DATA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SaPackage.CALL_ASYNC_SERVICE__DATA_EXP:
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
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createIntegerConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createBooleanConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createRealConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createStringConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createEnumConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createStructureConst()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createNullExp()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createDataRef()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createStructureMemberRef()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createArithmeticExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createBooleanExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.CALL_ASYNC_SERVICE__DATA_EXP,
				 SaFactory.eINSTANCE.createRelationalExpr()));
	}

}
