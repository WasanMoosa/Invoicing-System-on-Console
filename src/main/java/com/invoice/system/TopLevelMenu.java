/**
 * 
 */
package com.invoice.system;


/**
 * @author Wasan
 *
 */
public class TopLevelMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialize Top-level menu items
		MenuItem shopSettingItem = new MenuItem(1, "Shop Settings");
		MenuItem manageItem = new MenuItem(2, "Manage Shop Items");
		MenuItem createInvoiceItem = new MenuItem(3, "Create New Invoice");
		MenuItem reportShopItem = new MenuItem(4, "Report: Statistics");
		MenuItem reportInvoiceItem = new MenuItem(5, "Report: All Invoices");
		MenuItem searchItem = new MenuItem(6, "Search (1) Invoice");
		MenuItem programStatisticsItem = new MenuItem(7, "Program Statistics");
		MenuItem exitItem = new MenuItem(8, "Exit");

		// Initialize the Top-level menu
		Menu invoiceMenu = new Menu("This is  groceries shop menu \nSelect from the following", shopSettingItem);

		// Add menu items to the Top-level menu
		invoiceMenu.addMenuItem(manageItem);
		invoiceMenu.addMenuItem(createInvoiceItem);
		invoiceMenu.addMenuItem(reportShopItem);
		invoiceMenu.addMenuItem(reportInvoiceItem);
		invoiceMenu.addMenuItem(searchItem);
		invoiceMenu.addMenuItem(programStatisticsItem);
		invoiceMenu.addMenuItem(exitItem);
		

		// Display the menu title and menu items
		System.out.println(invoiceMenu.getTitle() + "\n");
		invoiceMenu.showMenu();

	}

	}

