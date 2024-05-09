package Day6;

public class IntersectionLL {
    public static class ListNode {
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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while (ptrA != ptrB) {
            ptrA = ptrA == null ? headB : ptrA.next;
            ptrB = ptrB == null ? headA : ptrB.next;
        }
        return ptrA;
    }

    public static void main(String[] args) {
        // Creating intersection node
        ListNode intersectionNode = new ListNode(8);
        
        // Creating linked list 1
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(1);
        head1.next.next = intersectionNode;

        // Creating linked list 2
        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(1);
        head2.next.next.next = intersectionNode;

        ListNode node = getIntersectionNode(head1, head2);
        if (node != null) {
            System.out.println("Intersection at node: " + node.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
