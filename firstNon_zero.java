import java.util.Arrays;

public class firstNon_zero {
    public static int firstNonZeroElement(int[] arr){
     int count =0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]!=0){

                System.out.println("Index: " + i +", Value: "+ arr[i]);
                count++;

            }


        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr={0,0,3,0,4};
       int index= firstNonZeroElement(arr);

        System.out.println("Total number of non zero element: " + index);

    }
}
