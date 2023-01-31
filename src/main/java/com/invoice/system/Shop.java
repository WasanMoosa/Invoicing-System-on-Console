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

	/**
	 * Setter method to update the shop details
	 * 
	 * @param shopDetails the new shop details
	 */
	public void setShopDetails(HashMap<String, String> shopDetails) {
		this.shopDetails = shopDetails;
	}

	/**
	 * Constructor method to initialize the name and telephone number of the shop
	 * 
	 * @param name         the name of the shop
	 * @param telephoneNumber the telephone number of the shop
	 */
	public Shop(String name, String telephoneNumber) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
	}

	/**
	 * Method to add an invoice to the list
	 * 
	 * @param invoice the invoice to add to the list
	 */
	public void addInvoice(Invoice invoice) {
		invoices.add(invoice);
	}

	/**
	 * Getter method to return the name of the shop
	 * 
	 * @return the name of the shop
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method to update the name of the shop
	 * 
	 * @param name the new name of the shop
	 */
	public void setName(String name) {
		this.name = name;

	}

	/**
	 * Getter method to return the telephone number of the shop
	 * 
	 * @return the telephone number of the shop
	 */
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * Setter method to update the telephone number of the shop
	 * 
	 * @param telephoneNumber the new telephone number of the shop
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	/**
	 * Getter method to return the fax number of the shop
	 * 
	 * @return the fax number of the shop
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * Setter method to update the fax number of the shop
	 * 
	 * @param fax the new fax number of the shop
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * Getter method to return the email of the shop
	 * 
	 * @return the email of the shop
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method to update the email of the shop
	 * 
	 * @param email the new email of the shop
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter method to return the website of the shop
	 * 
	 * @return the website of the shop
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * Setter method to update the website of the shop
	 * 
	 * @param website the new website of the shop
	 */
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
			System.out.print("The item has been added successfully");
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
