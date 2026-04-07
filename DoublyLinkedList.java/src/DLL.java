package com.Maurya;


public class DLL {

    Node head;


    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;

    }
    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse order");

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;

        }
        System.out.println("START");

    }


    public void insertLast(int val) {
        Node last = head;
        Node newNode = new Node(val);
        if(head == null){
            newNode.prev = null;
            head = new Node(val);
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
        last = newNode;
    }

    public void insert(int val ,  int after) {

        Node p = find(after);
        if(p == null){
            System.out.println("Value not found");
            return;
        }
        Node newNode = new Node(val);
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        newNode.next.prev = p;






    }
    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value==value){
                return temp;

            }
            temp = temp.next;
        }
        return null;
    }





    private class Node{
        private int value;
        private Node next;
        private Node prev;

    public Node(int value){
        this.value = value;
    }

    //Constructor
    public Node(int value, Node next ,  Node prev){
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
}