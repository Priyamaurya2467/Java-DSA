package com.maurya;

public class merge_SortedLL {
    static Node merge(Node a21, Node a31){
        Node temp1 =  a21;
        Node temp2 = a31;
        Node head  = new Node(100);
        Node temp = head;
        while (temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                Node a = new Node(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;

            }
            else{
                Node a = new Node(temp1.val);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = a31;
        }
        else{
            temp.next = a21;
        }
        return head.next;

    }

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

        public static void main(String[] args) {
            Node a21 = new Node(1);
            Node a22 = new Node(4);
            Node a23 = new Node(9);
            Node a24 = new Node(14);
            Node a25 = new Node(51);
            a21.next = a22;
            a22.next = a23;
            a23.next = a24;
            a25.next = a25;

            Node a31 = new Node(2);
            Node a32 = new Node(5);
            Node a33 = new Node(8);
            Node a34 = new Node(10);
            Node a35 = new Node(15);
            Node a36 = new Node(16);

            a31.next = a32;
            a32.next = a33;
            a33.next = a34;
            a34.next = a35;
            a35.next = a36;

            System.out.println(merge(a21,a31));



        }
    }

