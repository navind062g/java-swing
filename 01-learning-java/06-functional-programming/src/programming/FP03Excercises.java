package programming;

import java.util.List;
import java.util.function.BinaryOperator;

public class FP03Excercises {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 15, 6, 4, 8, 9, 18, 19, 10, 2);
		
		BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		
		int sum = numbers.stream().reduce(0, accumulator);
		
		System.out.println("Sum of the numbers are : "+sum);
	}

}
