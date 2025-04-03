import java.util.Arrays;

public class linear_Search {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int key = 6;
        boolean val =  search(arr , key);
        System.out.println("present at index :" + val);
    }
    static boolean search(int [] arr , int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
