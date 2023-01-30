/**
 * 
 */
package com.invoice.system;

import java.util.ArrayList;

/**
 * @author Wasan
 *
 */

public class Shop {
   private String name;
   private int telephoneNumber;
   private String fax;
   private String email;
   private String website;
   private ArrayList<Invoice> invoices;
   private ArrayList<Product> products;
   
   public Shop(String name, int telephoneNumber) {
      this.name = name;
      this.telephoneNumber = telephoneNumber;
   }
   
   public void addInvoice(Invoice invoice) {
      invoices.add(invoice);
   }
   
   public double getTotalAmount() {
      double total = 0;
      for (Invoice invoice : invoices) {
         total += invoice.getInvoiceAmount();
      }
      return total;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public int getTelephoneNumber() {
      return telephoneNumber;
   }
   
   public void setTelephoneNumber(int telephoneNumber) {
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
}


