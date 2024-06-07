package example7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example7 {
    public static void main (String args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Is", "Fun");
        List<String> filteredStrings = filterLength(3, strings);
        System.out.println("Исходный список: " + strings);
        System.out.println("Список строк длиннее 3 символов: " + filteredStrings);
    }

    public static List<String> filterLength(int minLength, List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > minLength) {
                filteredStrings.add(string);
            }
        }
        return filteredStrings;
    }
}