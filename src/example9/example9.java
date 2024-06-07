package example9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example9 {
    public static void main(String args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Is", "Fun");
        List<String> filteredStrings = filterLetters(strings);
        System.out.println("Исходный список: " + strings);
        System.out.println("Список строк, содержащих только буквы: " + filteredStrings);
    }

    public static List<String> filterLetters(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.matches("[a-zA-Z]+")) {
                filteredStrings.add(string);
            }
        }
        return filteredStrings;
    }
}