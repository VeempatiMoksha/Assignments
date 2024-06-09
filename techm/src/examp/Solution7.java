package examp;

import java.util.Scanner;

import techm.Institution;

public class Solution7 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Institution[] institutions = new Institution[4];

	        for (int i = 0; i < 4; i++) {
	            int institutionId = scanner.nextInt();
	            String institutionName = scanner.next();
	            int noOfStudentsPlaced = scanner.nextInt();
	            int noOfStudentsCleared = scanner.nextInt();
	            String location = scanner.next();
	            institutions[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
	        }

	        String location = scanner.next();
	        String institutionName = scanner.next();

	        int numClearance = findNumClearancedByLoc(institutions, location);
	        if (numClearance > 0) {
	            System.out.println(numClearance);
	        } else {
	            System.out.println("There are no cleared students in this particular location");
	        }

	        Institution updatedInstitution = updateInstitutionGrade(institutions, institutionName);
	        if (updatedInstitution != null) {
	            System.out.println(updatedInstitution.getInstitutionName() + "::" + updatedInstitution.getGrade());
	        } else {
	            System.out.println("No Institute is available with the specified name");
	        }

	        scanner.close();
	    }

	    public static int findNumClearancedByLoc(Institution[] institutions, String location) {
	        int totalClearance = 0;
	        for (Institution institution : institutions) {
	            if (institution.getLocation().equalsIgnoreCase(location)) {
	                totalClearance += institution.getNoOfStudentsCleared();
	            }
	        }
	        return totalClearance;
	    }

	    public static Institution updateInstitutionGrade(Institution[] institutions, String institutionName) {
	        for (Institution institution : institutions) {
	            if (institution.getInstitutionName().equalsIgnoreCase(institutionName)) {
	                int rating = (institution.getNoOfStudentsPlaced() * 100) / institution.getNoOfStudentsCleared();
	                if (rating >= 80) {
	                    institution.setGrade("A");
	                } else {
	                    institution.setGrade("B");
	                }
	                return institution;
	            }
	        }
	        return null;}
}


