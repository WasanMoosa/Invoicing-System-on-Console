package com.invoice.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

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

		// TODO upload static clicks
		////////////////////////////
		HashMap<String, Integer> numberOfClick = new HashMap<>();
		numberOfClick = loadProgDetails("program details.json");

		// Calling Top Level Menu
		TopLevelMenu topLevelMenu = new TopLevelMenu();
		TopLevelMenu.main(args);

		// read the choice input from the user
		Scanner userInput = new Scanner(System.in);
		int choice = 0;

		// Initialize shop
		Shop groceryShop = new Shop("cubcake", "123");
		// HashMap<String, String>
		groceryShop.shopDetails.put("name", groceryShop.getName());
		groceryShop.shopDetails.put("telephoneNumber", groceryShop.getTelephoneNumber());
		groceryShop.shopDetails.put("fax", groceryShop.getFax());
		groceryShop.shopDetails.put("email", groceryShop.getEmail());
		groceryShop.shopDetails.put("website", groceryShop.getWebsite());
		putInFileShoDetail(groceryShop.shopDetails);

		// Switch case for user input
		while (choice < 1 || choice > 8) {
			System.out.print("\nEnter your choice: ");

			try {
				choice = Integer.parseInt(userInput.nextLine());
				switch (choice) {
				case 1:
					//Increase number of clicks 
					numberOfClick.put("clickShopSetting",numberOfClick.get("clickShopSetting")+1);
					putInFileProgDetail(numberOfClick);
					// Calling Sub Menu
					SubMenuShop subMenuShop = new SubMenuShop();
					subMenuShop.main(args);

					// read the second choice input from the user
					int secondChoice = 0;
					while (secondChoice < 1 || secondChoice > 4) {
						System.out.print("\nEnter your choice: ");
						try {
							secondChoice = Integer.parseInt(userInput.nextLine());
							switch (secondChoice) {
							case 1:
								// TODO invoice reports
								System.out.println("The items you have in your store are");
								try {
									groceryShop.setProducts(loadProductFile(groceryShop));
									System.out.println("ID         Name");
									System.out.println("-------------------");
									for (Product ii : groceryShop.getProducts()) {
										System.out.println(ii.getId() + "        " + ii.getName());
									}
								} catch (Exception e) {
									System.out.println("The file is empty!");
								}

								break;

							case 2:
								System.out.println("The name of the shop is " + groceryShop.getName());
								String changeName = " ";
								while (!changeName.equals("y") && !changeName.equals("Y") && !changeName.equals("n")
										&& !changeName.equals("N")) {
									System.out.println("If you want to change it press y, go back press n");
									changeName = userInput.nextLine();
									if (changeName.equals("y") || changeName.equals("Y")) {
										System.out.print("Set the new name of the shop: ");
										String shopName = userInput.nextLine();
										groceryShop.setName(shopName);
										groceryShop.shopDetails.put("name", groceryShop.getName());
										putInFileShoDetail(groceryShop.shopDetails);
									} else if (changeName.equals("n") || changeName.equals("N")) {
										// return to sub menu
										subMenuShop.main(args);
										secondChoice = 0;

									}
								}

								break;

							case 3:
								System.out.println("Set the invoice header");
								System.out.print("Set the telephone Number: ");
								groceryShop.setTelephoneNumber(userInput.nextLine());
								groceryShop.shopDetails.put("telephoneNumber", groceryShop.getTelephoneNumber());
								System.out.print("Set Fax Number: ");
								groceryShop.setFax(userInput.nextLine());
								groceryShop.shopDetails.put("fax", groceryShop.getFax());
								System.out.print("Set Email: ");
								groceryShop.setEmail(userInput.nextLine());
								groceryShop.shopDetails.put("email", groceryShop.getEmail());
								System.out.print("Set Website: ");
								groceryShop.setWebsite(userInput.nextLine());
								groceryShop.shopDetails.put("website", groceryShop.getWebsite());
								putInFileShoDetail(groceryShop.shopDetails);

								break;
							case 4:
								TopLevelMenu.main(args);
								choice = 0;
								break;

							}
						} catch (Exception e) {
							System.out.println("Invalid input. Please choose a number.");
						}
					}

					break;
				case 2:
					//Increase number of clicks 
					numberOfClick.put("clickManageShop",numberOfClick.get("clickManageShop")+1);
					putInFileProgDetail(numberOfClick);
					// Calling Sub Menu
					SubMenuManage subMenuManage = new SubMenuManage();
					subMenuManage.main(args);

					// read the second choice input from the user
					secondChoice = 0;
					while (secondChoice < 1 || secondChoice > 5) {
						System.out.print("\nEnter your choice: ");
						try {
							secondChoice = Integer.parseInt(userInput.nextLine());
							switch (secondChoice) {

							// Adding items
							case 1:
								try {
									groceryShop.setProducts(loadProductFile(groceryShop));
								} catch (Exception e) {
									// TODO: handle exception
								}
								boolean currectDetails = false;
								while (!currectDetails) {
									try {
										System.out.println("Enter the item details that you want to add");
										System.out.print("Item id:");
										int itemId = Integer.parseInt(userInput.nextLine());
										System.out.print("Item name:");
										String itemName = userInput.nextLine();
										System.out.print("Item price:");
										Double itemPrice = Double.parseDouble(userInput.nextLine());
										System.out.print("Item quantity:");
										int quantity =Integer.parseInt(userInput.nextLine());
										Product product = new Product(itemId, itemName, itemPrice, quantity );
										groceryShop.addProduct(product);
										putInFileProduct(groceryShop.getProducts());
										currectDetails = true;

									} catch (Exception e) {
										System.out.println("Be carefull, Here is example how you can write");
										System.out.println("id should be integer number");
										System.out.println("Name can be anything you like");
										System.out.println("Price has to be number\n");
										System.out.println("quantity should be integer number");
									}
								}
								break;
							// deleting item
							case 2:
								try {
									groceryShop.setProducts(loadProductFile(groceryShop));
								} catch (Exception e) {
									// TODO: handle exception
								}
								System.out.println("The items you have are:");
								System.out.println("ID         Name");
								System.out.println("-------------------");
								for (Product ii : groceryShop.getProducts()) {
									System.out.println(ii.getId() + "        " + ii.getName());
								}
								Boolean checkCorrectID = false;
								while (!checkCorrectID) {
									try {
										System.out.println("Choose what you want to delet by writing id");
										int id = Integer.parseInt(userInput.nextLine());
										checkCorrectID = groceryShop.deleteProduct(id, checkCorrectID);
										putInFileProduct(groceryShop.getProducts());

									} catch (Exception e) {
										System.out.println("Invalid id");
										checkCorrectID = false;
									}

								}

								break;

							// change item price
							case 3:
								try {
									groceryShop.setProducts(loadProductFile(groceryShop));
								} catch (Exception e) {
									// TODO: handle exception
								}
								System.out.println("The items you have are:");
								System.out.println("ID         Name");
								System.out.println("-------------------");
								for (Product ii : groceryShop.getProducts()) {
									System.out.println(ii.getId() + "        " + ii.getName());
								}
								checkCorrectID = false;
								while (!checkCorrectID) {
									try {
										System.out.println(
												"Choose the item you want to change its price by writing the id");
										int id = Integer.parseInt(userInput.nextLine());

										for (int i = 0; i < groceryShop.getProducts().size(); i++) {
											if (groceryShop.getProducts().get(i).getId() == id) {
												System.out.println("The previous price is "
														+ groceryShop.getProducts().get(i).getPrice());
												System.out.println("Enter the new price: ");
												Double itemPrice = Double.parseDouble(userInput.nextLine());
												groceryShop.getProducts().get(i).setPrice(itemPrice);
												checkCorrectID = true;
											}
										}
										putInFileProduct(groceryShop.getProducts());
										if (!checkCorrectID) {
											System.out.println("id not exist");
										}

									} catch (NumberFormatException e) {
										System.out.println("Invalid id or price");
										checkCorrectID = false;
									}

								}

								break;
							// Report all items
							case 4:
								System.out.println("The items you have in your store are");
								try {
									groceryShop.setProducts(loadProductFile(groceryShop));
									System.out.println("ID         Name");
									System.out.println("-------------------");
									for (Product ii : groceryShop.getProducts()) {
										System.out.println(ii.getId() + "        " + ii.getName());
									}
								} catch (Exception e) {
									System.out.println("The file is empty!");
								}
								break;
							case 5:
								TopLevelMenu.main(args);
								choice = 0;
								break;

							}
						} catch (Exception e) {
							e.printStackTrace();
							System.out.println("Invalid input.");
						}
					}

					break;
				case 3:
					//Increase number of clicks 
					numberOfClick.put("clickCreateInvoice",numberOfClick.get("clickCreateInvoice")+1);
					putInFileProgDetail(numberOfClick);
					//Set the date 
					Calendar calendar = Calendar.getInstance();
					Date date = calendar.getTime();
					// Perform action for Create New Invoice
					System.out.println("Here you can create new invoice.");
					Invoice invoice = new Invoice("1", date, "wasan", 10, 100, 10);
					
					break;
				case 4:
					//Increase number of clicks 
					numberOfClick.put("clickReportStatic",numberOfClick.get("clickReportStatic")+1);
					putInFileProgDetail(numberOfClick);
					// Perform action for Report: Statistics
					System.out.println("Report: Statistics selected.");
					break;
				case 5:
					//Increase number of clicks 
					numberOfClick.put("clickReportInvoice",numberOfClick.get("clickReportInvoice")+1);
					putInFileProgDetail(numberOfClick);
					// Perform action for Report: All Invoices
					System.out.println("Report: All Invoices selected.");
					break;
				case 6:
					//Increase number of clicks 
					numberOfClick.put("clickSearchInvoice",numberOfClick.get("clickSearchInvoice")+1);
					putInFileProgDetail(numberOfClick);
					// Perform action for Search (1) Invoice
					System.out.println("Search (1) Invoice selected");
				case 7:
					//Increase number of clicks 
					numberOfClick.put("clickProgramStatic",numberOfClick.get("clickProgramStatic")+1);
					putInFileProgDetail(numberOfClick);
					System.out.println("Program Statistics:");
		            //Printing HashMap of number of click
				
						System.out.print(numberOfClick);
				
					
					break;
				case 8:
					// Perform action for exit
					String changeName = " ";
					while (!changeName.equals("y") && !changeName.equals("Y") && !changeName.equals("n")
							&& !changeName.equals("N")) {
						System.out.println("Are you sure you want to exit? If yes press y, if No press n");
						changeName = userInput.nextLine();
						if (changeName.equals("y") || changeName.equals("Y")) {
							System.out.println("See you soon!");
						} else if (changeName.equals("n") || changeName.equals("N")) {
							choice = 0;
							TopLevelMenu.main(args);
						}
					}
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid input. Please choose a number.");
			}
		}
	}

	public static void putInFileShoDetail(HashMap<String, String> FileUpload) {
		File myFile = new File("shop details.json");
		try (FileWriter writer = new FileWriter(myFile)) {
			Gson gson = new GsonBuilder().create();
			gson.toJson(FileUpload, writer);
			writer.write("\n");
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public static void putInFileProgDetail(HashMap<String, Integer> FileUpload) {
		File myFile = new File("program details.json");
		try (FileWriter writer = new FileWriter(myFile)) {
			Gson gson = new GsonBuilder().create();
			gson.toJson(FileUpload, writer);
			writer.write("\n");
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	public static void putInFileProduct(ArrayList<Product> fileUpload) {
		File myFile = new File("product.json");
		try (FileWriter writer = new FileWriter(myFile)) {
			// for(int i=0; i<fileUpload.size(); i++) {
			Gson gson = new Gson();
			String json = gson.toJson(fileUpload);
			writer.write(json);
			writer.close();
			// }

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	public static ArrayList<Product> loadProductFile(Shop shop) {
		File myFile = new File("product.json");
		ArrayList<Product> list = new ArrayList<>();
		ArrayList<Product> products = new ArrayList<>();
		if (myFile.exists()) {
			Gson gson = new Gson();
			Scanner scanFile;
			try {
				scanFile = new Scanner(myFile);
				String st;
				st = scanFile.nextLine();
				Type listType = new TypeToken<ArrayList<Product>>() {
				}.getType();
				list = gson.fromJson(st, listType);

				// }

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		} else {
			try {
				myFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;

	}

	public static HashMap<String, Integer> loadProgDetails(String fileName) {
		File myFile = new File(fileName);
		HashMap<String, Integer> numberOfClick = new HashMap<>();
		if (myFile.exists()) {
			Gson gson = new Gson();
			Scanner scanFile;
			try {
				scanFile = new Scanner(myFile);
				String st;
				st = scanFile.nextLine();
				Type listType = new TypeToken<HashMap<String, Integer>>() {
				}.getType();
				numberOfClick = gson.fromJson(st, listType);

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		} else {
			try {
				myFile.createNewFile();
				numberOfClick.put("clickShopSetting", 0);
				numberOfClick.put("clickManageShop", 0);
				numberOfClick.put("clickCreateInvoice", 0);
				numberOfClick.put("clickReportStatic", 0);
				numberOfClick.put("clickReportInvoice", 0);
				numberOfClick.put("clickSearchInvoice", 0);
				numberOfClick.put("clickProgramStatic", 0);
				putInFileProgDetail(numberOfClick);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return numberOfClick;

	}
}