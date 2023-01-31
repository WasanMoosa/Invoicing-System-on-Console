/**
 * 
 */
package com.invoice.system;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Wasan
 *
 */

public class Shop {
	private String name;
	private String telephoneNumber;
	private String fax = " ";
	private String email = " ";
	private String website = " ";
	private ArrayList<Invoice> invoices = new ArrayList<>();
	private ArrayList<Product> products = new ArrayList<>();
	HashMap<String, String> shopDetails = new HashMap<>();

	public void setShopDetails(HashMap<String, String> shopDetails) {
		this.shopDetails = shopDetails;
	}

	public Shop(String name, String telephoneNumber) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
	}

	public void addInvoice(Invoice invoice) {
		invoices.add(invoice);
	}

	// public double getTotalAmount() {
	// double total = 0;
	// for (Invoice invoice : invoices) {
	// total += invoice.getInvoiceAmount();
	// }
	// return total;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * Getter method to return the list of products
	 * 
	 * @return the list of products
	 */
	public ArrayList<Product> getProducts() {
		return products;
	}

	/**
	 * Setter method to update the list of products
	 * 
	 * @param products the new list of products
	 */
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	/**
	 * Method to add a product to the list
	 * 
	 * @param product the product to add to the list
	 */
	public void addProduct(Product product) {
		boolean exist = false;
		for (int i = 0; i < products.size(); i++) {
			if (product.getId() == products.get(i).getId()) {
				System.out.print("The item id is already exist!");
				exist = true;
			} else if (product.getName().equals((products.get(i).getName()))) {
				System.out.print("The item name is already exist!");
				exist = true;
			}

		}
		if (!exist) {
			this.products.add(product);
		}
	}

	/**
	 * Method to delete a product from the list using its id
	 * 
	 * @param id    the id of the product to delete
	 * @param check to check if the item id is exist
	 */
	public boolean deleteProduct(int id, boolean check) {
		for (int i = 0; i < products.size(); i++) {
			Product product = products.get(i);
			if (product.getId() == id) {
				System.out.println(
						"product (" + product.getId() + " " + product.getName() + ") has been deleted successfully");
				products.remove(i);
				check = true;

			}
		}
		return check;
	}
}
