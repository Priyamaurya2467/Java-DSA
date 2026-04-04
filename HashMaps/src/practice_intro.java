import java.util.*;

public class practice_intro {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        System.out.println(map.get("A"));
        System.out.println(map.getOrDefault("Y",16));
            }
}
