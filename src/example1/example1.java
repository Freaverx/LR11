package example1;

import java.util.Arrays;

public class example1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = filterEven(numbers);
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Массив с четными числами: " + Arrays.toString(evenNumbers));
    }

    public static int[] filterEven(int[] data) {
        int countLength = 0;
        for (int i = 0; i < data.length; i++) {
            if (datai % 2 == 0) {
                countLength++;
            }
        }
        int filArray = new intcountLength;
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (datai % 2 == 0) {
                filArrayj = datai;
                j++;
            }
        }
        return filArray;
    }
}
