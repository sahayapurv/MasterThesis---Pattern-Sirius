/**
 */
package sa_SynthesisCommand.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import sa_SynthesisCommand.Mode;
import sa_SynthesisCommand.SaFactory;
import sa_SynthesisCommand.SaPackage;

/**
 * This is the item provider adapter for a {@link sa_SynthesisCommand.Mode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mode_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mode_name_feature", "_UI_Mode_type"),
				 SaPackage.Literals.MODE__NAME,
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
			childrenFeatures.add(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS);
			childrenFeatures.add(SaPackage.Literals.MODE__ENTRIES);
			childrenFeatures.add(SaPackage.Literals.MODE__EXITS);
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
	 * This returns Mode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Mode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Mode_type") :
			getString("_UI_Mode_type") + " " + label;
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

		switch (notification.getFeatureID(Mode.class)) {
			case SaPackage.MODE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SaPackage.MODE__BEHAVIOURAL_ELEMENTS:
			case SaPackage.MODE__ENTRIES:
			case SaPackage.MODE__EXITS:
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
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createEnterMode()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createExitMode()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createCallAsyncService()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createCallSyncService()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createStartTimer()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createStopTimer()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createStoreData()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createBroadcastSendMessage()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createUnicastSendMessage()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createMulticastSendMessage()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createSense()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createSensePosition()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createSenseAccelerometer()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createActuate()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createFork()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createServiceCallback()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createServiceCall()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createReceiveMessage()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS,
				 SaFactory.eINSTANCE.createTimerFired()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__ENTRIES,
				 SaFactory.eINSTANCE.createEnterMode()));

		newChildDescriptors.add
			(createChildParameter
				(SaPackage.Literals.MODE__EXITS,
				 SaFactory.eINSTANCE.createExitMode()));
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
			childFeature == SaPackage.Literals.MODE__BEHAVIOURAL_ELEMENTS ||
			childFeature == SaPackage.Literals.MODE__ENTRIES ||
			childFeature == SaPackage.Literals.MODE__EXITS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SAEditPlugin.INSTANCE;
	}

}
