public class reverse {


        static class ListNode {
            int val;
            ListNode next;
            ListNode(int val) { this.val = val; }
        }

        public static ListNode reverseListIterative(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            // 'nextTemp' is used to store the next node before overwriting curr.next
            ListNode nextTemp = null;

            while (curr != null) {
                nextTemp = curr.next;    // 1. Save the next node
                curr.next = prev;        // 2. Reverse the current node's pointer
                prev = curr;             // 3. Move 'prev' pointer forward
                curr = nextTemp;         // 4. Move 'curr' pointer forward
            }

            // 'prev' will be the new head of the reversed list
            return prev;
        }

        // Example Usage:
        public static void main(String[] args) {
            // Create a sample list: 1 -> 2 -> 3 -> 4 -> 5 -> null
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            ListNode reversedHead = reverseListIterative(head);

            // Print the reversed list: 5 -> 4 -> 3 -> 2 -> 1 -> null
            while (reversedHead != null) {
                System.out.print(reversedHead.val + (reversedHead.next != null ? " -> " : " -> null\n"));
                reversedHead = reversedHead.next;
            }
        }
    }

