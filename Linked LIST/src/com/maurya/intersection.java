package com.maurya;

public class intersection {


    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(9);
        Node c = new Node(10);
        Node d = new Node(51);
        Node e = new Node(10);
        Node f = new Node(95);
        Node g = new Node(32);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node a1 = new Node(5);
        Node b1 = new Node(9);
        Node c1 = new Node(10);
        Node d1 = new Node(51);
        Node e1 = new Node(10);
        Node f1 = new Node(95);
        Node g1 = new Node(32);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;
        e1.next = f1;
        f1.next = g1;


        







    }
}
