package example8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example8 {
    public static void main(String args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> greaterNumbers = filterGreaterThan(30, numbers);
        System.out.println("Исходный список: " + numbers);
        System.out.println("Список чисел больше 30: " + greaterNumbers);
    }

    public static List<Integer> filterGreaterThan(int threshold, List<Integer> numbers) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > threshold) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }
}