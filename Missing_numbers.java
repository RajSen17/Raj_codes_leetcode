import java.util.HashSet;

public class Missing_numbers {
    public static void main(String[] args) {
        int[] arr = {0, 3};


       int ans =  MissingNumber(arr);

        System.out.println("missing numbers: " + ans);
    }



    public static int MissingNumber(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);


        }


        for (int i = 0; i <= 3; i++) {
            if (!set.contains(i)){
                return i;

            }

        }
        return -1;
    }
}

