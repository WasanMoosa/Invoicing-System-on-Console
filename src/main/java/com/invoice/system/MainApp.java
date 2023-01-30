package com.invoice.system;

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
		// Initialize menu items
		MenuItem shopSettingItem = new MenuItem(1, "Shop Settings");
		MenuItem manageItem = new MenuItem(2, "Manage Shop Items");
		MenuItem createInvoiceItem = new MenuItem(3, "Create New Invoice");
		MenuItem reportShopItem = new MenuItem(4, "Report: Statistics");
		MenuItem reportInvoiceItem = new MenuItem(5, "Report: All Invoices");
		MenuItem searchItem = new MenuItem(6, "Search (1) Invoice");
		MenuItem programStatisticsItem = new MenuItem(7, "Program Statistics");
		MenuItem exitItem = new MenuItem(8, "Exit");

		// Initialize the menu
		Menu invoiceMenu = new Menu("This is  groceries shop menu \nSelect from the following", shopSettingItem);

		// Add menu items to the menu
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

		// read the choice input from the user
		Scanner userInput = new Scanner(System.in);
		System.out.print("\nEnter your choice: ");
		int choice = Integer.parseInt(userInput.nextLine());

		// Switch case for user input
		switch (choice) {
		case 1:
			// Perform action for Shop Settings
			System.out.println("Shop Settings selected.");
			break;
		case 2:
			// Perform action for Manage Shop Items
			System.out.println("Manage Shop Items selected.");
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
	}
}
