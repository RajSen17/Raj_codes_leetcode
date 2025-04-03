


import java.util.*;
public class ghup {

    public static void main(String args[]) {
        func(3);
    }
    public static void func(int n){
        if(n==0){
            return;
        }
        for(int i = 1 ; i <=2;i++){
            func(n-1);
            System.out.print(" "+n);
        }

    }
}

