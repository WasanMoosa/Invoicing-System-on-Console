/**
 * A class representing an Invoice, which contains details about the sale transaction.
 *
 * @author Wasan
 */
package com.invoice.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Invoice {
  /**
   * Unique identifier for the invoice
   */
  private String invoiceNo;

  /**
   * The date the invoice was created
   */
  private Date invoiceDate;

  /**
   * Name of the customer who purchased the products
   */
  private String customerName;

  /**
   * Number of products purchased
   */
  private int noOfItems;

  /**
   * Total cost of the products purchased
   */
  private double total;

  /**
   * Remaining balance owed by the customer
   */
  private double balance;

  /**
   * List of products purchased in the transaction
   */
  private ArrayList<Product> products= new ArrayList<>();

  /**
   * Shop details, such as name and address
   */
  HashMap<String, String> shopDetails= new HashMap<>();

  /**
   * Creates an Invoice instance with the specified details.
   *
   * @param shopDetails Details about the shop, such as name and address
   * @param invoiceNo Unique identifier for the invoice
   * @param invoiceDate Date the invoice was created
   * @param customerName Name of the customer who purchased the products
   * @param noOfItems Number of products purchased
   * @param total Total cost of the products purchased
   * @param balance Remaining balance owed by the customer
   */
  public Invoice(HashMap<String, String> shopDetails,String invoiceNo, Date invoiceDate, String customerName, int noOfItems, double total, double balance) {
    this.invoiceNo = invoiceNo;
    this.invoiceDate = invoiceDate;
    this.customerName = customerName;
    this.noOfItems = noOfItems;
    this.total = total;
    this.balance = balance;
    this.shopDetails=shopDetails;
  }

  /**
   * Returns the unique identifier for the invoice.
   *
   * @return Invoice number
   */
  public String getInvoiceNo() {
    return invoiceNo;
  }

  /**
   * Sets the unique identifier for the invoice.
   *
   * @param invoiceNo Invoice number to set
   */
  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  /**
   * Returns the date the invoice was created.
   *
   * @return Invoice date
   */
  public Date getInvoiceDate() {
    return invoiceDate;
  }

  /**
   * Sets the date the invoice was created.
   *
   * @param invoiceDate Invoice date to set
   */
  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  /**
   * Returns the name of the customer who purchased the products.
   *
   * @return Customer name
   */
  public String getCustomerName() {
    return customerName;
  }
}

 
