/**
 */
package BPMN4GAMA.provider;


import BPMN4GAMA.BPMN4GAMAFactory;
import BPMN4GAMA.BPMN4GAMAPackage;
import BPMN4GAMA.FlowElementContainer;

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

/**
 * This is the item provider adapter for a {@link BPMN4GAMA.FlowElementContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowElementContainerItemProvider 
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
	public FlowElementContainerItemProvider(AdapterFactory adapterFactory) {
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
			addResourcePropertyDescriptor(object);
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
				 getString("_UI_FlowElementContainer_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FlowElementContainer_name_feature", "_UI_FlowElementContainer_type"),
				 BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FlowElementContainer_resource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FlowElementContainer_resource_feature", "_UI_FlowElementContainer_type"),
				 BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__RESOURCE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FlowElementContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FlowElementContainer_type") :
			getString("_UI_FlowElementContainer_type") + " " + label;
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

		switch (notification.getFeatureID(FlowElementContainer.class)) {
			case BPMN4GAMAPackage.FLOW_ELEMENT_CONTAINER__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BPMN4GAMAPackage.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS:
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
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createANDGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createORGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createSubprocess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN4GAMAPackage.Literals.FLOW_ELEMENT_CONTAINER__FLOW_ELEMENTS,
				 BPMN4GAMAFactory.eINSTANCE.createXORGateway()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BPMN4GAMAEditPlugin.INSTANCE;
	}

}
