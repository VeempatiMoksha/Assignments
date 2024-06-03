package assignment;
import java.util.Arrays;
import java.util.List;
public class EvenOddSum {
	
	    public static int sumOfEvenNumbers(List<Integer> numbers) {
	        return numbers.stream()
	                      .filter(n -> n % 2 == 0)
	                      .mapToInt(Integer::intValue)
	                      .sum();
	    }
	    public static int sumOfOddNumbers(List<Integer> numbers) {
	        return numbers.stream()
	                      .filter(n -> n % 2 != 0)
	                      .mapToInt(Integer::intValue)
	                      .sum();
	    }

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        int sumEven = sumOfEvenNumbers(numbers);
	        int sumOdd = sumOfOddNumbers(numbers);

	        System.out.println("Sum of even numbers: " + sumEven);
	        System.out.println("Sum of odd numbers: " + sumOdd);}
	}

