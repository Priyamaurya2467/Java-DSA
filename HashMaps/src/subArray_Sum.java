import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.HashMap;

public class subArray_Sum {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3};
        int k = 3;
        HashMap < Integer, Integer > map = new HashMap<>();
        map.put(0 , 1);
        int ans = 0 ;
        int sum = 0;
        for( int j = 0 ; j < arr.length ; j++){
            sum += arr[j];
            if(map.containsKey(sum-k)){
                ans = ans + map.get(sum-k);
            }
            if (map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);

            }
            else{
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
