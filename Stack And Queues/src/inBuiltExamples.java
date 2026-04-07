package com.maurya;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inBuiltExamples {
    public static void main(String[] args) {
//        Stack <Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        System.out.println(stack);
//        stack.pop();
//        stack.pop();7
//        System.out.println(stack);
//        System.out.println(stack);


        Queue<Integer> queue=new LinkedList<>();
        queue.add(11);
        queue.add(20);
        queue.add(32);
        queue.add(41);
        queue.add(59);
        queue.add(106);
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
