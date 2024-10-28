package programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehavioralParameterization {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 9, 6, 2, 4, 12, 15);
		filterAndPrint(numbers, x -> (x%2 != 0));
		
		List squaredNumbers = mapAndCreateList(numbers, x -> x*x);
		
		System.out.println("Squared Numbers List: "+ squaredNumbers);
	}
	
	private static List<Integer> mapAndCreateList(List<Integer> numbers, 
			Function<Integer, Integer> mapperFunction) {
		return numbers.stream().map(mapperFunction).collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers, 
			Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}
}
