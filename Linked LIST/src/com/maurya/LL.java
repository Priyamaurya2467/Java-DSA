package com.maurya;

import org.w3c.dom.Node;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;

    }

    //insert using Recursion

    public void insertRecr(int index, int value) {
        head = inesertRecursion(head, index, value);
    }
        private Node inesertRecursion(Node node , int index,int value){
        if(index == 0){
            Node temp = new Node(value , node);
            size++;

            return temp;
        }
        node.next = inesertRecursion(node.next, index-1, value);
        return node;

    }

    public Node get(int index){
        Node node = head;
        for(int i=1;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int temp = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }

        size--;
        return temp;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();

        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
         
    }

    public void reverseList(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            //update
            prev = curr;
            curr = next;
        }

    }


    public static LL merge(LL first , LL second) {
            Node f = first.head;
            Node s = second.head;
            LL ans = new LL();
            while(f!=null && s != null){
                if(f.value<s.value){
                    ans.insertLast(f.value);
                    f = f.next;
                }
                else{

                        ans.insertLast(s.value);
                        s= s.next;
                }
            }
            while(f!=null){
                ans.insertLast(f.value);
                f = f.next;
            }
            while(s!=null){
                ans.insertLast(s.value);
                s = s.next;
            }
            return ans;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node temp = get(index);
        int val = temp.next.value;
        temp.next = temp.next.next;

        return val;
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

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public  void removeDuplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next  =null;
    }
}

