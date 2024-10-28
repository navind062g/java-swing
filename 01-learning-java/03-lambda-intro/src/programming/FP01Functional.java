package programming;

import java.util.List;
import java.util.function.Predicate;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 5, 8, 9, 2, 4, 12, 15);
        printAllNumbersInListFunctional(numbers);

        printEvenNumbersInListFunctional(numbers);

        printOddNumbersInListFunctional(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        printCoursesInListFunctional(courses);

        printCoursesContaintingSpringInList(courses);

        printCoursesHavingLengthFourInList(courses);
    }

    private static void printCoursesHavingLengthFourInList(List<String> courses) {
        System.out.println("========= Printing Courses containing 4 or more letters =========");
        courses.stream().filter(str -> str.length() >= 4).forEach(System.out::println);

    }

    private static void printCoursesContaintingSpringInList(List<String> courses) {
        System.out.println("========= Printing Courses containing Spring =========");
        courses.stream().filter(str -> str.contains("Spring")).forEach(System.out::println);
    }

    private static void printCoursesInListFunctional(List<String> courses) {

        System.out.println("====== Printing the Courses =======");

        courses.stream().forEach(System.out::println);
    }

    private static void printNumber(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

        System.out.println("======= Printing All Numbers ======");
        numbers.stream().forEach(FP01Functional::printNumber);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        System.out.println("======= Printing Even Numbers ======");
        numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
    }

    private static boolean isEven(int x) {
        return x % 2 == 0;
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {

        System.out.println("======= Printing Odd Numbers ======");
        numbers.stream().filter(x -> x%2 != 0).forEach(System.out::println);
    }
}
