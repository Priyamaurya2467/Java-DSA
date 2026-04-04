import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.*;
public class intro {
    static void HashMapMethods() {
        //Syntax
        Map<String, Integer> map = new HashMap<>();
        //Adding elements
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);

        map.put("Harry", 18);


        //Getting element
        System.out.println(map.get("Yas"));

        //changing/updating value of a key in the HahMap
        map.put("Akash", 22);
        System.out.println(map.get("Akash"));


        //removing
        System.out.println(map);
        map.remove("Akash");
        System.out.println(map);


        map.putIfAbsent("Akash", 23);
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());

        if(map.containsKey("Ak")){
            System.out.println("present in the map");
        }
        else{
            System.out.println("not present in the map");
        }



        // Iteration
        int arr[] = {12,15,18};
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        for ( int val : arr){
            System.out.println(val + " ");
        }
        System.out.println();


        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }



    public static void main(String[] args) {
        HashMapMethods();
    }
}
