
import java.util.HashMap;

public class Weekly {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(minLengthAfterRemovals(s));
    }
    static int minLengthAfterRemovals(String s){
        int l = 0 , r = 0 , maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > maxLen) {
                while (map.get(c) > maxLen) {
                    map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) - 1);
                    if(map.get(s.charAt(r)) == 0) {
                        map.remove(s.charAt(r));
                    }
                    l++;
                    maxLen = Math.max(maxLen, r - l+1);
                }
            }
            r++;
        }
        return maxLen;
    }

}
