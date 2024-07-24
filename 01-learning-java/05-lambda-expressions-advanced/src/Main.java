import java.util.*;
import java.util.function.BinaryOperator;

public class Main {

    record Person(String firstName, String lastName) {

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"
        ));

        for(String str: list) {
            System.out.println(str);
        }

        System.out.println("============================================================================");
        list.forEach((String myString) -> System.out.println(myString));

        System.out.println("============================================================================");
        final String prefix = "nato";
        list.forEach((String myStr) -> {
            char strCharacter = myStr.charAt(0);
            System.out.println(prefix + " " + myStr + " means " + strCharacter);
        });

        int result = calculator((var a, var b) -> {
            return a + b;}, 5, 2);

        double result2 = calculator((a, b) ->  a / b, 10.0, 2.5);
        System.out.println("Double value of dividing 10 and 2.5 is "+result2);

        String name = calculator((a, b) -> a + " " + b, "John", "Doe");
        System.out.println("Name value is "+name);
    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of the operation: "+result);
        return result;
    }
}