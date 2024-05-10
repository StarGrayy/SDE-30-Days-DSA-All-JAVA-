package Day7;

class Node {
    int val;
    Node next;
    Node random;
    
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CloneLL {
    public static Node copyRandomList(Node head) {
        if (head == null) return null;
        
        Node node = head;
        while (node != null) {
            Node copy = new Node(node.val);
            copy.next = node.next;
            node.next = copy;
            node = node.next.next;
        }
        
        node = head;
        while (node != null) {
            Node copy = node.next;
            copy.random = (node.random == null) ? null : node.random.next;
            node = node.next.next;
        }
        
        node = head;
        Node dummy = new Node(-1);
        Node res = dummy;
        while (node != null) {
            res.next = node.next;
            node.next = node.next.next;
            res = res.next;
            node = node.next;
        }
        
        return dummy.next;
    }

    public static void main(String[] args) {
        // Test the copyRandomList method
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Random pointers
        head.random = head.next.next;
        head.next.random = head.next.next.next;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head;

        Node clonedHead = copyRandomList(head);

        // Print the cloned linked list
        while (clonedHead != null) {
            System.out.println("Value: " + clonedHead.val + ", Random: " + (clonedHead.random != null ? clonedHead.random.val : "null"));
            clonedHead = clonedHead.next;
        }
    }
}
