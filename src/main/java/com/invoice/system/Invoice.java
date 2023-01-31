/**
 * 
 */
package com.invoice.system;

/**
 * @author Wasan
 *
 */
import java.util.Date;

public class Invoice {
  private String invoiceNo;
  private Date invoiceDate;
  private String customerName;
  private int noOfItems;
  private double total;
  private double balance;

  public Invoice(String invoiceNo, Date invoiceDate, String customerName, int noOfItems, double total, double balance) {
    this.invoiceNo = invoiceNo;
    this.invoiceDate = invoiceDate;
    this.customerName = customerName;
    this.noOfItems = noOfItems;
    this.total = total;
    this.balance = balance;
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
