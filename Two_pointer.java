import java.util.Arrays; // Two pointer method

public class Two_pointer {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2,5};
        int target = 7;
        Arrays.sort(arr);
        System.out.println(pointer(arr, target));
        System.out.println(Arrays.toString(arr));

    }






        static boolean pointer ( int [] arr, int target){

            int left = 0, right = arr.length - 1;

            while (left<right) {
                int sum = arr[left] + arr[right];
                if (sum == target)
                    return true;
                else if (sum < target)
                    left++;
                else right++;
            }
             return false;




        }

}
