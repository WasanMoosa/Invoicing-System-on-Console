package com.invoice.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class testClass {

	public static void main(String[] args) {
		File myFile = new File("product.json");
		if (myFile.exists()) {
			Gson gson = new GsonBuilder().create();
			ArrayList<Product> temp = new ArrayList<>();

			Scanner scanFile;
			try {
				scanFile = new Scanner(myFile);
				while (scanFile.hasNextLine()) {
					String st;
					st = scanFile.nextLine();
					Type listType = new TypeToken<ArrayList<Product>>(){}.getType();
					ArrayList<Product> list = gson.fromJson(st, listType);  
					for (Product ii: list) {
						System.out.println(ii.getId()+" "+ ii.getname());
					}
				
				}

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
	}

	}
