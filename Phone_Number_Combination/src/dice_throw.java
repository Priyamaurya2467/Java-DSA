import java.util.ArrayList;

public class dice_throw {
    public static void main(String[] args) {
        thro(" ", 4);
        System.out.println(throArray("", 4));
        System.out.println(throCount("", 4));


    }

    static void thro(String p, int n) {
        if (n == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= n; i++) {
            thro(p + i, n - i);
        }
    }

    static ArrayList<String> throArray(String p, int n) {
        if (n == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> lists = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= n; i++) {
            lists.addAll(throArray(p + i, n - i));
        }
        return lists;
    }
    static int throCount(String p, int n) {
        if (n == 0) {

            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= n; i++) {
            count = count +throCount(p + i, n - i);
        }
        return count;
    }

}