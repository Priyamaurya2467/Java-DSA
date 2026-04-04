import java.util.HashMap;
import java.util.HashSet;

public class Most_frequent {
    public static  void majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       
        for(int i = 0 ;  i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key)>nums.length/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,5,1};
        majorityElement(nums);

    }

}



