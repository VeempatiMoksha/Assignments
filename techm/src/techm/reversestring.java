package techm;
import java.util.Scanner;
public class reversestring {
	
	
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();
	        String lowerCaseInput = input.toLowerCase();
	        String reversedString = new StringBuilder(lowerCaseInput).reverse().toString();
	        System.out.println(reversedString);
	        scanner.close();}
	}
