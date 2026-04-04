import java.util.HashSet;
import java.util.Iterator;

public class intro {
    public static void main(String[] args) {
        HashSet< Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);


        System.out.println(hashSet);

        if(!hashSet.contains(6)){
            System.out.println(" not contains");
        }
//        hashSet.remove(1);
//        System.out.println(hashSet);


        Iterator it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
