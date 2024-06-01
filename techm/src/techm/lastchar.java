package techm;

public class lastchar {
	    public static void main(String[] args) {
	        String input = "Hey3 Java   Learners";
	        System.out.println(getLastCharacters(input));
	    }

	    public static String getLastCharacters(String input) {
	        StringBuilder result = new StringBuilder();
	        String[] words = input.split("\\s+");

	        for (String word : words) {
	            // Remove digits from the word
	            String cleanedWord = word.replaceAll("\\d", "");
	            // Check if the cleaned word is non-empty
	            if (!cleanedWord.isEmpty()) {
	                // Append the last character of the cleaned word to the result
	                result.append(cleanedWord.charAt(cleanedWord.length() - 1));
	            }
	        }
	        return result.toString();}
}