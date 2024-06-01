package techm;

public class spacesandchar {
    public static void main(String[] args) {
        String input = "Hello This is ABCD from XYZ city";
        int spaceCount = 0;
        int charCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
            	
                // Ignore digits
                continue;
            } else if (c == ' ') {
                spaceCount++;
            } else {
                charCount++;
            }
        }

        System.out.println("No of spaces : " + spaceCount + " and characters : " + charCount);}
}