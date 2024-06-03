package assignment;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
public class AvgCalculator {
	    public static void main(String[] args) {
	        // List of integers
	        List<Integer> numbers = Arrays.asList(2,4,6,8,10);

	        // Calculating the average using streams
	        OptionalDouble average = numbers.stream()
	                                        .mapToInt(Integer::intValue)
	                                        .average();

	        // Checking if a value is present and printing the average
	        if (average.isPresent()) {
	            System.out.println("The average is: " + average.getAsDouble());
	        } else {
	            System.out.println("The list is empty, no average to calculate.");}}
	}
