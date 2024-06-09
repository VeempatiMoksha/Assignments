package examp;
import java.util.Scanner;
import techm.Phone;
public class Solution6 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Phone[] phones = new Phone[4];

	        for (int i = 0; i < 4; i++) {
	            int phoneId = scanner.nextInt();
	            String os = scanner.next();
	            String brand = scanner.next();
	            int price = scanner.nextInt();
	            phones[i] = new Phone(phoneId, os, brand, price);
	        }

	        String brand = scanner.next();
	        String os = scanner.next();

	        int price = findPriceForGivenBrand(phones, brand);
	        if (price > 0) {
	            System.out.println(price);
	        } else {
	            System.out.println("The given Brand is not available");
	        }

	        Phone phone = getPhoneIdBasedOnOs(phones, os);
	        if (phone != null) {
	            System.out.println(phone.getPhoneId());
	        } else {
	            System.out.println("No phones are available with specified os and price range");
	        }

	        scanner.close();
	    }

	    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
	        int totalPrice = 0;
	        for (Phone phone : phones) {
	            if (phone.getBrand().equalsIgnoreCase(brand)) {
	                totalPrice += phone.getPrice();
	            }
	        }
	        return totalPrice;
	    }

	    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
	        for (Phone phone : phones) {
	            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
	                return phone;
	            }
	        }
	        return null;}}

