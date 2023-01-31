package com.invoice.system;

/**
 * Product class for creating product objects with properties: id, name and price.
 * 
 * @author Wasan
 */
class Product {
  // Private properties to store the product information
  private int id;
  private String name;
  private double price;
  
  /**
   * Constructor to initialize the product object
   * @param id the id of the product
   * @param name the name of the product
   * @param price the price of the product
   */
  Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }
  
  /**
   * Getter method to return the id of the product
   * @return the id of the product
   */
  public int getId() {
    return id;
  }
  
  /**
   * Getter method to return the name of the product
   * @return the name of the product
   */
  public String getName() {
    return name;
  }
  
  /**
   * Getter method to return the price of the product
   * @return the price of the product
   */
  public double getPrice() {
    return price;
  }
  
  /**
   * Setter method to update the price of the product
   * @param price the new price of the product
   */
  public void setPrice(double price) {
    this.price = price;
  }
  
 
}
