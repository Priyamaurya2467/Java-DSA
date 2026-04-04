public class CheckIthBit {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        System.out.println(check(n,i));
    }
    static boolean check(int n,int i){
        return (n & (1<<i)) != 0;
//        return ((n>>1)&1) != 0;

    }
}
