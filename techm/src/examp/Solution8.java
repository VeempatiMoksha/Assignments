package examp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import techm.Inventory;

public class Solution8 {
	    public static Inventory[] replenish(Inventory[] inventories, int limit) {
	        List<Inventory> result = new ArrayList<>();
	        for (Inventory inventory : inventories) {
	            if (inventory.getThreshold() <= limit) {
	                result.add(inventory);
	            }
	        }
	        return result.toArray(new Inventory[0]);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Inventory[] inventories = new Inventory[4];

	        for (int i = 0; i < 4; i++) {
	            Inventory inventory = new Inventory();
	            inventory.setInventoryId(scanner.nextLine());
	            inventory.setMaximumQuantity(Integer.parseInt(scanner.nextLine()));
	            inventory.setCurrentQuantity(Integer.parseInt(scanner.nextLine()));
	            inventory.setThreshold(Integer.parseInt(scanner.nextLine()));
	            inventories[i] = inventory;
	        }

	        int limit = Integer.parseInt(scanner.nextLine());
	        Inventory[] replenishedInventories = replenish(inventories, limit);

	        for (Inventory inventory : replenishedInventories) {
	            if (inventory.getThreshold() > 75) {
	                System.out.println(inventory.getInventoryId() + " Critical Filling");
	            } else if (inventory.getThreshold() >= 50 && inventory.getThreshold() <= 75) {
	                System.out.println(inventory.getInventoryId() + " Moderate Filling");
	            } else {
	                System.out.println(inventory.getInventoryId() + " Non-Critical Filling");}}}
	}




