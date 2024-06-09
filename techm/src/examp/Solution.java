package examp;
import java.util.ArrayList;
import techm.Associate;
public class Solution {

		    public static ArrayList<Associate> associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
		        ArrayList<Associate> result = new ArrayList<>();
		        for (Associate associate : associates) {
		            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) && associate.getExperienceInYears() % 5 == 0) {
		                result.add(associate);
		            }
		        }
		        return result;
		    }

		    public static void main(String[] args) {
		        java.util.Scanner scanner = new java.util.Scanner(System.in);
		        Associate[] associates = new Associate[5];
		        for (int i = 0; i < 5; i++) {
		            Associate associate = new Associate();
		            associate.setId(scanner.nextInt());
		            scanner.nextLine(); // Consume newline
		            associate.setName(scanner.nextLine());
		            associate.setTechnology(scanner.nextLine());
		            associate.setExperienceInYears(scanner.nextInt());
		            associates[i] = associate;
		        }
		        String searchTechnology = scanner.next();
		        scanner.close();

		        ArrayList<Associate> result = associatesForGivenTechnology(associates, searchTechnology);
		        for (Associate associate : result) {
		            System.out.println(associate.getId());}}
		}




