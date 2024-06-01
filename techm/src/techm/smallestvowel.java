package techm;

public class smallestvowel {
        public static char smallestVowel(String s) {
	        char smallest = Character.MAX_VALUE; // Initialize with the maximum possible character value
	        String vowels = "aeiou"; // String containing all vowels
	        
	        for (char c : s.toCharArray()) {
	            if (vowels.indexOf(c) != -1 && c < smallest) {
	                smallest = c;
	            }
	        }
	        
	        return smallest == Character.MAX_VALUE ? '\0' : smallest; // Return '\0' if no vowel is found
	    }

	    public static void main(String[] args) {
	        String input = "matrix";
	        char result = smallestVowel(input);
	        
	        if (result != '\0') {
	            System.out.println(result);
	        } else {
	            System.out.println("no vowels detected");}}
}
