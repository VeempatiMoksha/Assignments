package examp;

import java.util.Scanner;

import techm.Player;

public class Solution1{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Player[] players = new Player[4];

	        for (int i = 0; i < 4; i++) {
	            int playerId = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            String skill = scanner.nextLine();
	            String level = scanner.nextLine();
	            int points = scanner.nextInt();

	            players[i] = new Player(playerId, skill, level, points);
	        }

	        String skill = scanner.next();
	        String level = scanner.next();

	        int points = findPointsForGivenSkill(players, skill);
	        if (points > 0) {
	            System.out.println(points);
	        } else {
	            System.out.println("The given Skill is not available");
	        }

	        Player player = getPlayerBasedOnLevel(players, level, skill);
	        if (player != null) {
	            System.out.println(player.getPlayerId());
	        } else {
	            System.out.println("No player is available with specified level, skill and eligibility points");
	        }
	    }

	    public static int findPointsForGivenSkill(Player[] players, String skill) {
	        int sumPoints = 0;
	        for (Player player : players) {
	            if (player.getSkill().equalsIgnoreCase(skill)) {
	                sumPoints += player.getPoints();
	            }
	        }
	        return sumPoints;
	    }

	    public static Player getPlayerBasedOnLevel(Player[] players, String level, String skill) {
	        for (Player player : players) {
	            if (player.getLevel().equalsIgnoreCase(level) && player.getSkill().equalsIgnoreCase(skill) && player.getPoints() >= 20) {
	                return player;
	            }
	        }
	        return null;}
	}
	


