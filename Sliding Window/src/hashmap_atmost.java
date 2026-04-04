import java.util.HashMap;
import java.util.Map;

public class hashmap_atmost {
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(longestSubstring(s , k));
    }
    private static int longestSubstring(String s , int k) {
        int l = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while(map.size() > k ){
                char d = s.charAt(l);
                map.put(d, map.getOrDefault(d, 0) -1);
                if(map.get(d)==0){
                    map.remove(d);
                }
                l++;
            }
            max = Math.max(max, i-l+1);
        }
        return max;
    }
}
