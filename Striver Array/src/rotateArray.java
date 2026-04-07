//[1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]

import java.util.ArrayList;
import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);

        }
        static void rotate(int[] arr , int k){
           int[] list = new int[arr.length];
           for (int i = 0; i < arr.length ; i++) {
               list[(i+k) % arr.length] = arr[i];
           }

            System.out.println(Arrays.toString(list));
            }
        }


