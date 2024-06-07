package example5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example5 {
    public static void main(String args) {
        List<String> strings = Arrays.asList("Hello World", "Java Is Fun", "This is a test");
        List<String> filteredStrings = filterSubstring("is", strings);
        System.out.println("Исходный список: " + strings);
        System.out.println("Список с подстрокой 'is': " + filteredStrings);
    }

    public static List<String> filterSubstring(String substring, List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.contains(substring)) {
                filteredStrings.add(string);
            }
        }
        return filteredStrings;
    }
}