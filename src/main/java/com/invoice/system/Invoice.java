/**
 * 
 */
package com.invoice.system;

import java.util.ArrayList;
/**
 * @author Wasan
 *
 */
import java.util.Date;
import java.util.HashMap;

public class Invoice {
  private String invoiceNo;
  private Date invoiceDate;
  private String customerName;
  private int noOfItems;
  private double total;
  private double balance;
  private ArrayList<Product> products= new ArrayList<>();
  HashMap<String, String> shopDetails= new HashMap<>();

  public Invoice(HashMap<String, String> shopDetails,String invoiceNo, Date invoiceDate, String customerName, int noOfItems, double total, double balance) {
    this.invoiceNo = invoiceNo;
    this.invoiceDate = invoiceDate;
    this.customerName = customerName;
    this.noOfItems = noOfItems;
    this.total = total;
    this.balance = balance;
    this.shopDetails=shopDetails;
  }

  public String getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public Date getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public int getNoOfItems() {
    return noOfItems;
  }

  public void setNoOfItems(int noOfItems) {
    this.noOfItems = noOfItems;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
