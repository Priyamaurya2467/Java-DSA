public class Kadane_Algorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = arr.length;
        System.out.println(brute(arr,sum));
    }
    static long brute(int[] arr,int target){
        long sum = 0 , max = Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum > max){
                max = sum;
            }
            // If sum < 0; discard the sum calculated
            if(sum < 0){
                sum = 0;
            }
        }
        return max;

    }
}



/* Algorithm
   Run thoughout the whole array and take a sum , if the sum will be < 0, drop it , otherwise count the sum

   for(i->n){
           if(sum==0) start = i;                          max = INT_MIN
           sum = sum+arr[i];                              sum = 0
           if(sum > max)                                  ansStart = -1
           {                                              ansEnd = -1
                max = sum;
                ansStart = start , ansEnd = i;                          T.C -> 0(n)
           }                                                            S.C -> 0(1)
           if( sum < 0){
                   sum = 0;
           }
       }
 */


