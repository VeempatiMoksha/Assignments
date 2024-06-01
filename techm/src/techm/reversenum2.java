package techm;
import java.lang.*;
public class reversenum2 {
	
	    public static void main(String[] args) {
	        int number = 12345;
	        
	        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number)); 
	        stringBuffer.reverse(); 
	        
	        int reversedNumber = Integer.parseInt(stringBuffer.toString()); 
	        System.out.println("Reversed Number: " + reversedNumber);}
	}

