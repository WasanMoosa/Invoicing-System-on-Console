/**
 * 
 */
package com.invoice.system;

/**
 * @author Wasan
 *
 */
public class SubMenuManage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Initialize Sub-menu items for manageItem
		MenuItem addItem = new MenuItem(1, "Add Items");
		MenuItem deleteItem = new MenuItem(2, "Delete Items");
		MenuItem changePrice = new MenuItem(3, "Change Item Price");
		MenuItem reportAllItems = new MenuItem(4, "Report All Items");
		MenuItem goBack = new MenuItem(5, "Go Back");
		
		// Initialize the sub menu for manageItem
		Menu manageMenu = new Menu("Manage Shop Items", addItem);
		
		// Add sub-menu items to the manageItem
		manageMenu.addMenuItem(deleteItem);
		manageMenu.addMenuItem(changePrice);
		manageMenu.addMenuItem(reportAllItems);
		manageMenu.addMenuItem(goBack);
		
		System.out.println("\n"+manageMenu.getTitle() +":");
		manageMenu.showSubMenu();

	}

}
