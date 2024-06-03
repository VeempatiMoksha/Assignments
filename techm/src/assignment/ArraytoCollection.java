package assignment;
import java.util.Arrays;
import java.util.Collection;
public class ArraytoCollection {

	    public static void main(String[] args) {
	        String[] array = {"Watermelon", "Strawberries", "Cherry", "Mango"};
	        Collection<String> collection = Arrays.asList(array);
	        System.out.println("The collection is: " + collection);}
	}

