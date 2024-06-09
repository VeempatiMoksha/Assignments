package examp;

import java.util.Scanner;

import techm.NavalVessel;

public class Solution3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        NavalVessel[] vessels = new NavalVessel[4];

	        for (int i = 0; i < 4; i++) {
	            int vesselId = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            String vesselName = scanner.nextLine();
	            int noOfVoyagesPlanned = scanner.nextInt();
	            int noOfVoyagesCompleted = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            String purpose = scanner.nextLine();

	            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
	        }

	        int percentage = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        String purpose = scanner.nextLine();

	        System.out.println(findAvgVoyagesByPct(vessels, percentage));
	        System.out.println(findVesselByGrade(purpose, vessels));
	    }

	    public static int findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
	        int totalCompletedVoyages = 0;
	        int count = 0;

	        for (NavalVessel vessel : vessels) {
	            double pct = (vessel.getNoOfVoyagesCompleted() * 100.0) / vessel.getNoOfVoyagesPlanned();
	            if (pct >= percentage) {
	                totalCompletedVoyages += vessel.getNoOfVoyagesCompleted();
	                count++;
	            }
	        }

	        return count > 0 ? totalCompletedVoyages / count : 0;
	    }

	    public static String findVesselByGrade(String purpose, NavalVessel[] vessels) {
	        for (NavalVessel vessel : vessels) {
	            if (vessel.getPurpose().equals(purpose)) {
	                double pct = (vessel.getNoOfVoyagesCompleted() * 100.0) / vessel.getNoOfVoyagesPlanned();
	                if (pct == 100) {
	                    vessel.setClassification("Star");
	                } else if (pct >= 80 && pct <= 99) {
	                    vessel.setClassification("Leader");
	                } else if (pct >= 55 && pct <= 79) {
	                    vessel.setClassification("Inspirer");
	                } else {
	                    vessel.setClassification("Striver");
	                }
	                return vessel.getVesselName() + "%" + vessel.getClassification();
	            }
	        }

	        return "No Naval Vessel is available with the specified purpose";}

}

