package com.maurya;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_the_queue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int n = q.size();

        Stack<Integer> st = new Stack<>();
        while(n>0){
            st.push(q.poll());
            n--;
        }
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
}
