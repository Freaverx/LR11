package example2;

import java.util.Arrays;

public class example2 {
    public static void main(String args) {
        int array1 = {1, 2, 3, 4, 5};
        int array2 = {3, 4, 5, 6, 7};
        int commonElements = findCommonElements(array1, array2);
        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));
        System.out.println("Общие элементы: " + Arrays.toString(commonElements));
    }

    public static int findCommonElements(int array1, int array2) {
        int commonElements = new int;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1i == array2j) {
                    commonElements.add(array1i);
                    break;
                }
            }
        }
        return commonElements;
    }
}

