import java.util.ArrayList;
import java.util.Collections;



public class Reverse_arr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        ArrayList<Integer> List = new ArrayList<>();
        for(int num: arr){
            List.add(num);


        }
        Collections.reverse(List);
        for(int num: List){
            System.out.print(num+" ");
        }
        System.out.println();


    }
}
