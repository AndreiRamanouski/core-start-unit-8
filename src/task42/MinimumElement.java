package task42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumElement {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int lengthOfArray = readInteger();
        int[] array = readElementsAndFillArray(lengthOfArray);
        System.out.println(findMin(array));
    }

    public static int readInteger() throws IOException {
        return Integer.valueOf(reader.readLine());
    }

    public static int[] readElementsAndFillArray(int quantity) throws IOException {
        int[] returnedValue = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            returnedValue[i] = Integer.valueOf(reader.readLine());
        }
        return returnedValue;
    }

    public static int findMin(int[] array) {
        if (array == null) {
            return -1;
        }
        int returnedValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < returnedValue) {
                returnedValue = array[i];
            }
        }
        return returnedValue;
    }
}
