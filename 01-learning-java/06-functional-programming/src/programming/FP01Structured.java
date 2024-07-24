package programming;

import java.util.List;

public class FP01Structured {

	
	public static void main(String[] args) {
		printAlltheNumbersInStructure(List.of(12, 15, 6, 4, 8, 9, 18, 19, 10, 2));
	}

	private static void printAlltheNumbersInStructure(List<Integer> numbers) {
		for(int number: numbers) {
			System.out.println("Number "+number);
		}
	}
}
