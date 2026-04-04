import java.util.HashMap;

public class Number_that_appear_twice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(brute(arr));
        System.out.println(better(arr));
        System.out.println(best(arr));
    }



    //Brute froce Approach : 0(n^2)
    static int brute(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }

                if (count == 1) {
                    return arr[i];
                }
                count = 0;

        }
        return 0;
    }


    // Better Approach : 0(n) + 0(n) = 0(2n)
    static int better(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }


    //Best Approach : 0(n)
    static int best(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor =  xor ^ arr[i];

        }
        return xor;
    }
}
