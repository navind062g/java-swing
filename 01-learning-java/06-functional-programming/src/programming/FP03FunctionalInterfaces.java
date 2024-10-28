package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FP03FunctionalInterfaces {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		//even numbers only
		Predicate<Integer> isEvenPredicate = (number) -> (number%2==0);
		Function<Integer, Integer> isSquaredFunction = (number) -> (number*number);
		
		//Supplier is like a factory pattern
		//it does not take any input 
		//but returns value based on the integer
		Supplier<Integer> randomIntegerSupplier = () -> {
			return new Random().nextInt(10000);
		};
		
		System.out.println(randomIntegerSupplier.get());
		
		/*
		 * numbers.stream() .filter(isEvenPredicate) .map(isSquaredFunction)
		 * .forEach(System.out::println);
		 */
		
		UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
		System.out.println(unaryOperator.apply(10));
		
		//BiPredicate
		boolean flag1 = false;
		boolean flag2 = true;
		
		Integer int1Obj = 10;
		Integer int2Obj = 8;
		BiPredicate<Integer, String> biPredicate = (number, str) -> {
			return number<10 && str.length()>5;
		};
		
		System.out.println(biPredicate.test(5, "in28minutes"));
		
		
		//BiFunction
		BiFunction<Integer, String, String> biFunction = (number, str) -> {
			return number + str;
		};
		System.out.println(biFunction.apply(10, "Spring Boot"));
		
		//BiConsumer
		BiConsumer<String, String> biConsumer = (str1, str2) -> {
			System.out.println(str1+" \n"+str2);
		};
		
		biConsumer.accept("in28", "minutes");
	}

}
