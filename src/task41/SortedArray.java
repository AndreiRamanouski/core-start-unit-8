package task41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortedArray {


    public static void main(String[] args) throws IOException {
        int[] array = createArray(5);
        printArray(array);
        int[] sortedArray = sortArray(array);
        System.out.println("Sorting______________________");
        printArray(sortedArray);

    }

    public static int[] sortArray(int[] arrayToSort){
        int[] returnedValue = new int[arrayToSort.length];
        copyArray(arrayToSort,returnedValue);
        boolean continueSorting = true;
        while (continueSorting){
            continueSorting = false;
            for (int i = 0; i < returnedValue.length-1; i++) {
                if(returnedValue[i] < returnedValue[i+1]){
                    swapElements(returnedValue, i,i+1);
                    continueSorting = true;
                }
            }
        }
        return returnedValue;
    }
    public static void swapElements(int[] arrayToSwap, int one, int two){
        int temp = arrayToSwap[one];
        arrayToSwap[one] = arrayToSwap[two];
        arrayToSwap[two] = temp;
    }
    public static void copyArray(int[] original, int[] toCopyIn){
        for (int i = 0; i < original.length; i++) {
            toCopyIn[i] = original[i];
        }
    }
    public static int[] createArray(int length) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] returnedValue = new int[5];
        for (int i = 0; i < 5; i++) {
            returnedValue[i] = Integer.valueOf(reader.readLine());
        }
        return returnedValue;
    }
    public static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("Element i: " + i + ", value: " + arrayToPrint[i]);
        }
    }
}
