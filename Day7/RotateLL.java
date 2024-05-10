package Day7;
class ListNode {
    int val;
    ListNode next;
    
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class RotateLL {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        
        ListNode start = head;
        int size = 1;
        
        while (start.next != null) {
            start = start.next;
            size++;
        }
        
        start.next = head;

        k = k % size;
        int steps = size - k;
        
        ListNode newStart = head;
        for (int i = 0; i < steps - 1; i++) {
            newStart = newStart.next;
        }
        
        ListNode newHead = newStart.next;
        newStart.next = null;
        
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode rotatedHead = rotateRight(head, k);

        while (rotatedHead != null) {
            System.out.print(rotatedHead.val + " ");
            rotatedHead = rotatedHead.next;
        }
    }
}
