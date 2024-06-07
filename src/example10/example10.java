package example10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example10 {
    public static void main(String args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> lessNumbers = filterLessThan(30, numbers);
        System.out.println("Исходный список: " + numbers);
        System.out.println("Список чисел меньше 30: " + lessNumbers);
    }

    public static List<Integer> filterLessThan(int threshold, List<Integer> numbers) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number < threshold) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }
}