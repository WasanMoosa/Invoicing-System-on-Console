/**
 * 
 */
package com.invoice.system;

/**
 * This class represents items of the menu, and the item itself could be a menu 
 * 
 * @author Wasan
 */
public class MenuItem {
	// Unique identifier for the menu item
	private int id;
	// Title of the menu item
	private String title;
	// Reference to the sub-menu, if it exists
	Menu menu = null;

	/**
	 * Constructor for creating a menu item
	 * 
	 * @param id    unique identifier for the menu item
	 * @param title title of the menu item
	 */
	public MenuItem(int id, String title) {
		this.id = id;
		this.title = title;
	}

	/**
	 * Check if the menu item is a sub-menu
	 * 
	 * @return true if the menu item has a sub-menu, false otherwise
	 */
	public boolean isSubMenu() {
		return menu != null;
	}

	/**
	 * Get the id of the menu item
	 * 
	 * @return the id of the menu item
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Get the title of the menu item
	 * 
	 * @return the title of the menu item
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Assign a sub menu to the item
	 * 
	 * @param menu the menu  to be assigned
	 */
	public void AssignSubMenu(Menu menu) {
		this.menu = menu;

	}


}
