package LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class reverse {

    public static ListNode revListNode(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        // 1->2->null
        /*
         * prev null curr 1 next 2
         * 
         * 
         * 2-> 1->null P C N curr.next->prev 1->null prev curr = 1 curr next 2 next =
         * next.next=2->null
         * 
         */
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            // System.out.println((curr != null) ? curr.val : "null");
            // System.out.println((next != null) ? next.val : "null");
            // System.out.println((prev != null) ? prev.val : "null");
        }
        return prev;
        /*
         * 9 1 1 1 2 9
         */
    }

    public static void main(String[] args) {
        ListNode lA_4 = new ListNode(4, null);
        ListNode lA_2 = new ListNode(2, lA_4);
        ListNode lA__1 = new ListNode(1, lA_2);
        ListNode lA_9 = new ListNode(9, lA__1);
        ListNode lA_1 = new ListNode(1, lA_9);
        ListNode head = lA_1;

        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }

        System.out.print("\n revListNode(lA_1) \n");
        head = revListNode(lA_1);

        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
        System.out.print("\n");

    }

}
