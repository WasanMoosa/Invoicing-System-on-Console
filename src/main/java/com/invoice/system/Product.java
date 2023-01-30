/**
 * 
 */
package com.invoice.system;

/**
 * @author Wasan
 *
 */

class Product {
	// properties
	private String id;
	private String name;
	private int quantity ;
	private double price;
	private double totalPrice;

	// constructor
	Product(String id, String name, int quantity , double price, double totalPrice) {
		this.id = id;
		this.name = name;
		this.quantity  = quantity ;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	// getter methods
	public String getId() {
		return id;
	}

	public String getname() {
		return name;
	}

	public int getQuantity() {
		return quantity ;
	}

	public double getPrice() {
		return price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

//	// displayFormat
//	public static void displayFormat()   
//	{  
//		System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
//		System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");  
//		System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
//	}
}