import java.util.Arrays;

public class moving_element {
   public static int[] moving_zeroes(int[] arr){
       int j =0;
       for(int i=0; i<arr.length; i++){
           if(arr[i]!=0){
               arr[j] = arr[i];
               j++;
           }


       }
       while(j<arr.length){
           arr[j]=0;
           j++;
       }
       return arr;
   }

    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        moving_zeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

}
