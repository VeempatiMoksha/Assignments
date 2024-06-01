package techm;
import java.lang.*;
public class perfectnum {
	    public static boolean isPerfectSquare(int number) {
	        if (number < 0) {
	            return false; 
	        }
	        int sqrt = (int) Math.sqrt(number);
	        return (sqrt * sqrt == number);
	    }
	    public static void main(String[] args) {
	        int number = 9;
	        if (isPerfectSquare(number)) {
	            System.out.println("TRUE");
	        } else {
	            System.out.println("FALSE");}}
	}

