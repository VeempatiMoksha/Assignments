package techm;
import java.util.*;
public class reversenum {
	    public static void main(String[] args) {
	        int number = 12345;
	        int reversedNumber = 0;

	        while (number != 0) {
	            int digit = number % 10; 
	            reversedNumber = reversedNumber * 10 + digit; 
	            number = number / 10; 
	        }
	        System.out.println("Reversed Number: " + reversedNumber);}
	}


