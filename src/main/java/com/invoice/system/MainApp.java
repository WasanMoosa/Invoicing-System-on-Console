package com.invoice.system;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class for the invoice system application
 * 
 * @author Wasan
 */
public class MainApp {

	/**
	 * The main method to start the program
	 * 
	 * @param args command line arguments
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

		// Initialize Sub-menu items for shopSettingItem
		MenuItem loadDataItem = new MenuItem(1, "Load Data");
		MenuItem shopNameItem = new MenuItem(2, "Set Shop Name");
		MenuItem invoiceHeaderItem = new MenuItem(3, "Set Invoice Header");
		MenuItem backItem = new MenuItem(4, "Go Back");

		// Initialize Sub-menu items for manageItem
		MenuItem addItem = new MenuItem(1, " Add Items");
		MenuItem deleteItem = new MenuItem(2, "Delete Items");
		MenuItem changePrice = new MenuItem(3, "Change Item Price");
		MenuItem reportAllItems = new MenuItem(4, "Report All Items");
		MenuItem goBack = new MenuItem(5, "Go Back");

		// Initialize the sub menu for shopSettingItem
		Menu shopSettingMenu = new Menu("Shop Settings",loadDataItem);
		// Initialize the sub menu for manageItem
		Menu manageMenu = new Menu("Manage Shop Items", addItem);

		// Add sub-menu items to the TshopSettingItem
		shopSettingMenu.addMenuItem(shopNameItem);
		shopSettingMenu.addMenuItem(invoiceHeaderItem);
		shopSettingMenu.addMenuItem(backItem);

		// Add sub-menu items to the manageItem
		manageMenu.addMenuItem(deleteItem);
		manageMenu.addMenuItem(changePrice);
		manageMenu.addMenuItem(reportAllItems);
		manageMenu.addMenuItem(goBack);


		// Display the menu title and menu items
		System.out.println(invoiceMenu.getTitle() + "\n");
		invoiceMenu.showMenu();

		// read the choice input from the user
		Scanner userInput = new Scanner(System.in);
		System.out.print("\nEnter your choice: ");
		int choice = 0;

		// Switch case for user input
		while (choice < 1 || choice > 8) {
			System.out.print("Enter a valid option (1-8): ");

			try {
				choice = Integer.parseInt(userInput.nextLine());
				switch (choice) {
				case 1:
					// Perform action for Shop Settings
					System.out.println(shopSettingMenu.getTitle() +":"+ "\n");
					shopSettingMenu.showSubMenu();
					break;
				case 2:
					// Perform action for Manage Shop Items
					System.out.println(manageMenu.getTitle() +":"+ "\n");
					manageMenu.showSubMenu();
					break;
				case 3:
					// Perform action for Create New Invoice
					System.out.println("Create New Invoice selected.");
					break;
				case 4:
					// Perform action for Report: Statistics
					System.out.println("Report: Statistics selected.");
					break;
				case 5:
					// Perform action for Report: All Invoices
					System.out.println("Report: All Invoices selected.");
					break;
				case 6:
					// Perform action for Search (1) Invoice
					System.out.println("Search (1) Invoice selected");
				case 7:
					// Perform action for Program Statistics
					System.out.println("Program Statistics selected.");
					break;
				case 8:
					// Perform action for exit
					System.out.println("exit selected");

				}
			} catch (Exception e) {
				System.out.println("Invalid input. Please choose a number.");
			}
		}
	}
}