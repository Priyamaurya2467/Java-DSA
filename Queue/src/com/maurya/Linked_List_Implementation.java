package com.maurya;

public class Linked_List_Implementation {
    public static  class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }


        public int peek(){
            return head.val;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int val = head.val;
                head = head.next;
                size--;
                return val;
            }
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
            }
            Node t = head;
            while(t != null){
                System.out.print(t.val + " ");
                t = t.next;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        queueLL q = new queueLL();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.display();
        q.remove();
        q.display();
    }
}
