package com.maurya;

import java.util.LinkedList;
import java.util.Queue;

//Print all the elements present in given queue only using add() , remove() , peek() , size() using extra queue
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Queue<Integer> helper = new LinkedList<>();
        while (q.size()>0) {
            int num = q.poll();
             helper.add(num);

        }
        while (helper.size()>0) {
            q.add(helper.poll());
        }
        System.out.println(q);

    }
}
