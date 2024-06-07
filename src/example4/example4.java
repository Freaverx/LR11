package example4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example4 {
    public static void main(String args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = squareNumbers(numbers);
        System.out.println("Исходный список: " + numbers);
        System.out.println("Список квадратов: " + squares);
    }

    public static List<Integer> squareNumbers(List<Integer> numbers) {
        List<Integer> squaredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            squaredNumbers.add(number * number);
        }
        return squaredNumbers;
    }
}
