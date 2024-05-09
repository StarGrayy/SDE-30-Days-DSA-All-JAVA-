package Day6;

public class RevKLL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        int count = 0;

        // Traverse k nodes
        while (node != null && count < k) {
            node = node.next;
            count++;
        }
        // If less than k nodes remaining, no need to reverse
        if (count < k) {
            return head;
        }

        // Reverse the first k nodes
        ListNode revHead = reverseHead(head, node);

        // Recursively reverse the remaining nodes in groups of k
        head.next = reverseKGroup(node, k);

        return revHead;
    }

    public static ListNode reverseHead(ListNode start, ListNode end) {
        ListNode prev = null;
        ListNode cur = start;

        while (cur != end) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Example usage and testing
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.println("Original List:");
        printList(head);

        ListNode reversedHead = reverseKGroup(head, k);

        System.out.println("\nList after reversing in groups of " + k + ":");
        printList(reversedHead);
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
