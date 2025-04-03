import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(2);
//        list.add(5);
//        list.add(7);
//        list.add(8);
//        list.add(4);
//        list.add(8);
//
//        System.out.println(list);
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }
       // System.out.println(list);

    }
}



