package example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example3 {
    public static void main(String args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Is", "Fun");
        List<String> upperCaseStrings = filterUpperCase(strings);
        System.out.println("Исходный список: " + strings);
        System.out.println("Список с строками, начинающимися с большой буквы: " + upperCaseStrings);
    }

    public static List<String> filterUpperCase(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.charAt(0) >= 'A' && string.charAt(0) <= 'Z') {
                filteredStrings.add(string);
            }
        }
        return filteredStrings;
    }
}
