import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        // Country(key) , Population(value)
        HashMap< String , Integer> map = new HashMap<>();
        // Insertion(adding elements)
        map.put("India" , 180);
        map.put("USA" , 150);
        map.put("China" , 170);
        System.out.println(map);
        map.put("China" , 200);
        map.put("Eng" , 140);
        System.out.println(map);
        //Search
        if(map.containsKey("Indonesia")){
            System.out.println("key is present");
        }
        else System.out.println("key is not present");
        // key - value get karne ke liye
        System.out.println(map.get("India"));// key is present
        System.out.println(map.get("Indonesia")); // key is not present
          int arr[] = {12, 15, 18};
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int val : arr){
            System.out.print(val + " ");
     }
         //Iteration in hashmap
        for (Map.Entry<String,Integer>val:map.entrySet()){

            System.out.println(val.getKey());
            System.out.println(val.getValue());
        }
        //remove the key value
        map.remove("China");
        System.out.println(map);

    }


}
