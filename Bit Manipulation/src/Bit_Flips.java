public class Bit_Flips {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        System.out.println(minBitFlips(start, goal));
    }

    //    public static int minBitFlips(int start, int goal) {
//        int ans = start^goal;
//int count = 0;
//        while(ans != 1){
//        if(ans%2 !=0){
//count++;
//        }
//ans = ans /2;
//        }
//        return count+1;
//
//        }
//    public static int minBitFlips(int start, int goal) {
//        int ans  = start^goal;
//        return Integer.bitCount(ans);
//
//    }

    public static int minBitFlips(int start,int goal){
        int xorResult = start ^ goal;
        int count = 0;
        while(xorResult != 0){
            xorResult &= (xorResult - 1);
            count++;
        }
        return count;
    }
}
