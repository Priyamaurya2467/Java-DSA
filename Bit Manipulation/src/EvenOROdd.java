public class EvenOROdd {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(check(n));
    }
    static boolean check(int n){
        if ((n&1)!=0){
            return true;
        }
        return false;

    }
}
