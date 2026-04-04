public class ClearithBit {
    public static void main(String[] args) {
        int  n = 13;
        int k = 2;
        System.out.println(clear(n,k));
    }
    static int clear(int n,int k){
        return n&(~(1<<k));
    }
}
