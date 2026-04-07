import java.util.HashMap;
import java.util.Map;

public class hashmap_window {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longSub(s));
    }
    public static int longSub(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l =0 ;
        int max = 0;
        for(int r = 0 ; r < s.length() ; r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.get(c)>1){
                char d = s.charAt(l);
                map.put(d, map.get(d) - 1);
                if (map.get(d)==0){
                    map.remove(d);
                }
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }

}
