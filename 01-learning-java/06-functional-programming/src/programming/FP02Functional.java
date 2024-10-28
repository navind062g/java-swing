package programming;

import java.util.List;

public class FP02Functional {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int sum = addListFunctional(numbers);
		
		System.out.println("Sum: "+ sum);
	}
	
	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + "::" + nextNumber);
		return aggregate + nextNumber;
	}

	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream()
		//	.reduce(0, FP02Functional::sum);
			.reduce(0, (aggregate, nextNumber) -> (aggregate + nextNumber));
	}
}
