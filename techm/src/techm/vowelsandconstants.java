package techm;
import java.util.Scanner;
public class vowelsandconstants {
  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        scanner.close();

	        int vowelsCount = 0;
	        int consonantsCount = 0;
	        input = input.toLowerCase();

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (Character.isAlphabetic(ch)) {
	                if (isVowel(ch)) {
	                    vowelsCount++;
	                } else {
	                    consonantsCount++;
	                }
	            }
	        }

	        System.out.println("Vowels count - " + vowelsCount);
	        System.out.println("Consonants count - " + consonantsCount);
	    }

	    public static boolean isVowel(char ch) {
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}

