package techm;
import java.lang.*;
	public class oddpositionchar {
	    public static void main(String[] args) {
	        String input = "Hey there!";
	        System.out.println("Input: " + input);
	        System.out.print("Output: ");
	        for (int i = 1; i < input.length(); i += 2) {
	            System.out.print(input.charAt(i));}}
	}

