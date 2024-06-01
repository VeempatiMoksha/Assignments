package techm;

import java.util.Scanner;

public class UniqueCharacters {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String input = scanner.nextLine().toLowerCase();
	        scanner.close();

	        String result = getUniqueCharacters(input);
	        System.out.println(result);
	    }

	    private static String getUniqueCharacters(String input) {
	        StringBuilder result = new StringBuilder();
	        boolean[] seen = new boolean[26]; 

	        for (char ch : input.toCharArray()) {
	            int index = ch - 'a'; 
	            if (!seen[index]) {
	                seen[index] = true; 
	                result.append(ch);
	            }
	        }

	        return result.toString();}
	}



