package task43;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 7, 3, 8, 6};
        reverse(array);
    }

    public static void reverse(int[] array) {
        printArray(array);
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        System.out.println();
        printArray(reversedArray);
    }

    public static void printArray(int[] arrayToPrint) {
        System.out.print("Array = [ ");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }
        System.out.print("]");
    }
}
