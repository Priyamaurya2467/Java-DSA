package queue;
import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        System.out.println(deque);
        deque.addFirst(6);
        System.out.println(deque);
        System.out.println(deque.getFirst());
    }
}
