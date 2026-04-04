import java.util.LinkedList;
import java.util.List;

public class nthFromEnd {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void display(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();

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
        deleteNode(d);
        display(a);
        fromEnd(a , 2);
    }

    //Delete Last Node
    public static void deleteNode(ListNode node){
        node.data = node.next.data;
        node.next = node.next.next;
    }
    //Finding nth node from last
    public static void fromEnd(ListNode head , int n){
        int m = sizeOfNode(head);
        int end = m-n+1;
        ListNode temp = head;
        for (int i = 0 ; i < end ; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);

    }
    public static int sizeOfNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }

}
