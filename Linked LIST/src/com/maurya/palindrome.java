package com.maurya;
public class palindrome {

   public boolean isPalindrome(Node a) {
       Node slow = a;
       Node fast = a;
       while(fast.next!=null && fast.next.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       Node temp = reverse(slow.next);
       slow.next = temp;
       Node p1 = a;
       Node p2 = slow.next;
       while(p2 != null){
           if(p1.data != p2.data){
               return false;
           }
           else{
               p1 = p1.next;
               p2 = p2.next;
           }

       }
       return true;
   }
   public static Node reverse(Node a){
       Node prev = null;
       Node curr = a;
       while(curr!=null){
           Node next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       return prev;
   }


    public static class Node {
        int data;
        Node next;
        Node(int value) {
            data = value;
            next = null;

        }
    }

    public void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(1);
           a.next = b;
        b.next = c;
        c.next = d;


        System.out.println(isPalindrome(a));
    }
}