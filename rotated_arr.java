import java.util.*;
public class rotated_arr { // right rotation by d=2

    public void rotateArray(int arr[], int d) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Rotate the list to the right by d steps
        Collections.rotate(list, d); // use -d for left rotation by 2

        // Copy back to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;

        rotated_arr obj = new rotated_arr();
        obj.rotateArray(arr, d);

        // Print obj instead of arr
        System.out.println(Arrays.toString(arr));
    }
}


