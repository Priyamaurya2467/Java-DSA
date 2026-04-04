public class countNumberOfSetBits {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(count(n));
    }
    static int count(int n){
        int count = 0;
        while(n!=1){
//            if(n%2==1){
//                count++;
//            }
            count+=n&1;
//            n= n/2;
            n=n>>1;
        }
        return count+1;
    }
}
