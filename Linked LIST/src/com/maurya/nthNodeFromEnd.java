package com.maurya;



public class nthNodeFromEnd {

    public static ListNode nthNode( ListNode head , int n){
        int size = 0;
        //length
        ListNode curr = head;
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        int m  = size - n + 1;
        //mth node from start
        curr = head;
        for(int i=1;i<m;i++){
            curr = curr.next;
        }
        return curr;
    }
    public static ListNode nthNode2( ListNode head , int n){
        ListNode  slow = head;
        ListNode fast = head;
        for( int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void removenth( ListNode head , int n){
        ListNode  slow = head;
        ListNode fast = head;
        for( int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

    }

    public static  void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }



    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode a = new  ListNode(100);
        ListNode b = new  ListNode(13);
        ListNode c = new  ListNode(4);
        ListNode d = new  ListNode(5);
        ListNode e = new  ListNode(12);
        ListNode f = new  ListNode(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 100  13  4  5  12  10
        ListNode p = nthNode(a,4);
        System.out.println(p.data);
        ListNode q =  nthNode2(a,4);
        System.out.println(q.data);
        display(a);
        removenth(a,6);
        display(a);


    }

}
