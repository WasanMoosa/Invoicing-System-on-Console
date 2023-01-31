/**
 * 
 */
package com.invoice.system;


/**
 * @author Wasan
 *
 */
public class SubMenuShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Initialize Sub-menu items for shopSettingItem
		MenuItem loadDataItem = new MenuItem(1, "Load Data");
		MenuItem shopNameItem = new MenuItem(2, "Set Shop Name");
		MenuItem invoiceHeaderItem = new MenuItem(3, "Set Invoice Header");
		MenuItem backItem = new MenuItem(4, "Go Back");


		// Initialize the sub menu for shopSettingItem
		 Menu shopSettingMenu = new Menu("Shop Settings",loadDataItem);
	

		// Add sub-menu items to the TshopSettingItem
		shopSettingMenu.addMenuItem(shopNameItem);
		shopSettingMenu.addMenuItem(invoiceHeaderItem);
		shopSettingMenu.addMenuItem(backItem);
		
		System.out.println("\n"+shopSettingMenu.getTitle() +":");
		shopSettingMenu.showSubMenu();

		

	}
	

}
