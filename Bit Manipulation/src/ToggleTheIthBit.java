public class ToggleTheIthBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        System.out.println(toggle(n,i));
    }
    static int toggle(int n,int i){
        return n ^ (1<<i);
    }
}
