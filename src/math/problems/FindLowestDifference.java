package math.problems;
import java.util.Iterator;
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        selectionSort(array1);
        selectionSort(array2);

        if (array1[0] < array2[0]) {
            System.out.println("Lowest number between arrays is: " + array1[0]);
        } else {
            System.out.println("Lowest number between arrays is: " + array2[0]);
        }

    }

    public static int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        return array;

    }
}

