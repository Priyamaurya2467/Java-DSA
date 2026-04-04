package com.maurya;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);

        }
            System.out.print("END");
            System.out.println();
        }

        public void delete(int value){
        Node temp = head;
        if(temp == null){
            return ;
        }
        if(temp.value == value){
            head = head.next;
            temp.next = head;
            return;


        }
        do {
            Node n = temp.next;
            if (n.value == value) {
                temp.next = n.next;
                break;

            }
            temp = temp.next;
        }while(temp != head);
        }

    private class Node {
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        //Constructor
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;

        }
    }
    }

