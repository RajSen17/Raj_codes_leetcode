// Random swapping
import java.util.Arrays;
import java.util.Random;

public class random_swappiing {
     public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        Random rand = new Random();

        System.out.println("Before Swaps: " + Arrays.toString(arr));

        // Perform 3 random swaps
        for (int i = 0; i < 3; i++) {
            int index1 = rand.nextInt(arr.length);
            int index2 = rand.nextInt(arr.length);
            swap(arr, index1, index2);
        }

        System.out.println("After Swaps: " + Arrays.toString(arr));
    }
      public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



