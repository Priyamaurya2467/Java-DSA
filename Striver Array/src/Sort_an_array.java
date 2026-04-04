import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Sort_an_array {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};
    //    System.out.println(Arrays.toString(better(arr)));
        System.out.println(Arrays.toString(best(arr)));
    }
    static  int[] better(int[] arr) {
        int count0 =0 ,  count1 =0 , count2 =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i = 0 ; i < count0 ; i++){
            arr[i] = 0;
        }
        for(int i = count0 ; i < count1+count0 ; i++){
            arr[i] = 1;
        }
        for(int i = count1+count0 ; i < arr.length ; i++){
            arr[i] = 2;
        }
        return arr;
    }
    static  int[] best(int[] arr) {
        int low = 0 , mid = 0, high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                //swap
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                //swap
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;













                
            }
        }
        return arr;
    }
}
