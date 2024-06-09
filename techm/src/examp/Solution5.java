package examp;

import java.util.Scanner;

import techm.AutonomousCar;

public class Solution5 {
	    public static int findTestPassedByEnv(AutonomousCar[] cars, String environment) {
	        int totalTestsPassed = 0;
	        for (AutonomousCar car : cars) {
	            if (car.getEnvironment().equalsIgnoreCase(environment)) {
	                totalTestsPassed += car.getNoOfTestsPassed();
	            }
	        }
	        return totalTestsPassed;
	    }

	    public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String brand) {
	        for (AutonomousCar car : cars) {
	            if (car.getBrand().equalsIgnoreCase(brand)) {
	                int rating = (car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted();
	                if (rating >= 80) {
	                    car.setGrade("A1");
	                } else {
	                    car.setGrade("B2");
	                }
	                return car;
	            }
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        AutonomousCar[] cars = new AutonomousCar[4];

	        // Reading input for 4 AutonomousCar objects
	        for (int i = 0; i < cars.length; i++) {
	            int carId = scanner.nextInt();
	            scanner.nextLine();  // Consume newline left-over
	            String brand = scanner.nextLine();
	            int noOfTestsConducted = scanner.nextInt();
	            int noOfTestsPassed = scanner.nextInt();
	            scanner.nextLine();  // Consume newline left-over
	            String environment = scanner.nextLine();

	            cars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
	        }

	        // Reading the environment for findTestPassedByEnv
	        String environment = scanner.nextLine();
	        int totalTestsPassed = findTestPassedByEnv(cars, environment);
	        if (totalTestsPassed > 0) {
	            System.out.println(totalTestsPassed);
	        } else {
	            System.out.println("There are no tests passed in this particular environment");
	        }

	        // Reading the brand for updateCarGrade
	        String brand = scanner.nextLine();
	        AutonomousCar car = updateCarGrade(cars, brand);
	        if (car != null) {
	            System.out.println(car.getBrand() + "::" + car.getGrade());
	        } else {
	            System.out.println("No Car is available with the specified brand");
	        }

	        scanner.close();}}




