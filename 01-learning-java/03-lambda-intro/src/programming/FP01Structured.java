package programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 5, 8, 9, 2, 4, 12, 15);
        printAllNumbersInListStructured(numbers);

        printEvenNumbersInListStructured(numbers);
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {

        for(Integer intNum : numbers) {
            if(intNum % 2 == 0) {
                System.out.println(intNum);
            }
        }
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        for(Integer intNum : integers) {
            System.out.println("Print the number: " + intNum);
        }
    }

}

