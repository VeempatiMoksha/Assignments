package assignment;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MaxMinElements {
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(30);
	        list.add(20);
	        list.add(50);
	        list.add(40);
	        if (list.isEmpty()) {
	            System.out.println("The list is empty.");
	        } else {
	            int minElement = Collections.min(list);
	            int maxElement = Collections.max(list);  
	            System.out.println("The minimum element in the list is: " + minElement);
	            System.out.println("The maximum element in the list is: " + maxElement);}}
	}


