// Brute method
public class Twopointers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 6;
        System.out.println(pointer(arr,target));
    }

        static boolean pointer ( int[] arr, int target){
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                for(int j=i+1; j<n; j++){
                    if (arr[i] + arr[j] == target) {
                        return true;

                    }

            }


            }
            return false;

        }

}
