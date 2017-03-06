package com.renz.RestauranItems;
/*
 * Demonstrate reading, writing and creating new file
 * Jayson Mallari
 */
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class RestaurantItems {

	public static void main(String[] args){
		File menuData = new File("menu.txt");
		File menuDataUpdate = new File("menuWithPrice.txt");
		double itemPrice;
		
		
		System.out.println("Enter the price for the following items.");
		
		
		try{
			PrintWriter itemWithPrice = new PrintWriter(menuDataUpdate);
			Scanner itemData = new Scanner(menuData);
			Scanner in = new Scanner(System.in);
			
			while(itemData.hasNextLine()){
			
				String holder = itemData.nextLine();
			
				System.out.println(holder+" : ");
				itemPrice= in.nextDouble();
				itemWithPrice.println(holder+": \t"+itemPrice);
			}
			itemWithPrice.close();
			
			Scanner newItemData = new Scanner(menuDataUpdate);
			int count = 1;
			System.out.println();
			System.out.println("MENU with price");
			while(newItemData.hasNextLine()){
				System.out.println("Menu no."+count);
				System.out.println(newItemData.nextLine());
				count += 1;
			}
		}
		catch(Exception e){
			System.out.println("Error occured : " + e.toString());
		}
	}
}
