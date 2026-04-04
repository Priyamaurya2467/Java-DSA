import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Array Rotation
        int[] arr = {-1,-100,3,99};
        int k = 2;
        //System.out.println(Arrays.toString(Rotate(arr,k)));
        Rotate(arr,k);
    }
   // static int[]Rotate(int[] arr, int k) {
    static void Rotate(int[] arr,int k){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i + k) % arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(result));

        }



        // using 0(1) space complexity

    static void printArray(int[] arr , int k ){
        int n = arr.length;
        k%=n;
        reverse(arr,0,n-1);
        reverse(arr,0,k);
        reverse(arr,k,n-1);

    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    }

