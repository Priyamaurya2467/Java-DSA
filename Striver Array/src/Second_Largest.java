import java.util.Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr  = {1,2,4,7,7,5};
        System.out.println(brute(arr));
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
    //brute force approach : 0(NlogN + N)
    static int brute(int[] arr){
        Arrays.sort(arr);
        int secondLarget = 0;
        int largest = arr[arr.length-1];
        for(int i = arr.length-2; i > 0; i--){
            if(arr[i] != largest){
                secondLarget = arr[i];
                break;
            }
        }
        return secondLarget;
    }

    //better approach : 0(2N)

    static int better(int[] arr){
        int largest = 0 ;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] != largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    //optimal Approach : 0(N)

    static int optimal(int[] arr){
        int largest = arr[0];
        int secondlarget = -1;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > largest){
                secondlarget = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondlarget){
                secondlarget = arr[i];
            }
        }
        return secondlarget;
    }
}
