package examp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import techm.Medicine;

public class Solution9 {
	    public static List<Integer> getPriceByDisease(Medicine[] medicines, String disease) {
	        List<Integer> prices = new ArrayList<>();
	        for (Medicine medicine : medicines) {
	            if (medicine.getDisease().equalsIgnoreCase(disease)) {
	                prices.add(medicine.getPrice());
	            }
	        }
	        Collections.sort(prices);
	        return prices;
	    }

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        Medicine[] medicines = new Medicine[4];

	        for (int i = 0; i < 4; i++) {
	            Medicine medicine = new Medicine();
	            medicine.setMedicineName(s.nextLine());
	            medicine.setBatch(s.nextLine());
	            medicine.setDisease(s.nextLine());
	            medicine.setPrice(Integer.parseInt(s.nextLine()));
	            medicines[i] = medicine;
	        }

	        String disease = s.nextLine();
	        List<Integer> prices = getPriceByDisease(medicines, disease);
	        
	        for (Integer price : prices) {
	            System.out.println(price);}}
}


