package examp;

import java.util.Scanner;

import techm.Player1;

public class Solution2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Player1[] players = new Player1[4];

	        for (int i = 0; i < 4; i++) {
	            int id = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            String name = scanner.nextLine();
	            int iccRank = scanner.nextInt();
	            int matchesPlayed = scanner.nextInt();
	            int runsScored = scanner.nextInt();

	            players[i] = new Player1(id, name, iccRank, matchesPlayed, runsScored);
	        }

	        int target = scanner.nextInt();

	        double[] averages = findAverageOfRuns(players, target);

	        for (double average : averages) {
	            if (average >= 80 && average <= 100) {
	                System.out.println("Grade A");
	            } else if (average >= 50 && average <= 79) {
	                System.out.println("Grade B");
	            } else {
	                System.out.println("Grade C");
	            }
	        }
	    }

	    public static double[] findAverageOfRuns(Player1[] players, int target) {
	        double[] averages = new double[players.length];

	        for (int i = 0; i < players.length; i++) {
	            if (players[i].getMatchesPlayed() >= target) {
	                averages[i] = (double) players[i].getRunsScored() / players[i].getMatchesPlayed();
	            } else {
	                averages[i] = 0; // Set to 0 if matches played is less than target
	            }
	        }

	        return averages;}


}


