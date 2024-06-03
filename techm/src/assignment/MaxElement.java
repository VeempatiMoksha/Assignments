package assignment;
import java.util.Vector;
import java.util.Collections;
public class MaxElement {

	    public static void main(String[] args) {
	        Vector<Integer> vector = new Vector<>();
	        vector.add(10);
	        vector.add(30);
	        vector.add(20);
	        vector.add(50);
	        vector.add(40);
	        if (vector.isEmpty()) {
	            System.out.println("The vector is empty.");
	        } else {
	            int maxElement = Collections.max(vector);
	            System.out.println("The maximum element in the vector is: " + maxElement);}}
	}

