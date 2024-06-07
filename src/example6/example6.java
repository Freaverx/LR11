package example6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example6 {
    public static void main(String args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> divisibleNumbers = filterDivisible(5, numbers);
        System.out.println("Исходный список: " + numbers);
        System.out.println("Список чисел, кратных 5: " + divisibleNumbers);
    }

    public static List<Integer> filterDivisible(int divisor, List<Integer> numbers) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % divisor == 0) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }
}