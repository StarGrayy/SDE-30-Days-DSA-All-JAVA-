package Day6;

public class FlattenLL {
    static class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }

    public static Node flatten(Node root) {
        if (root == null || root.next == null) {
            return root;
        }
        root.next = flatten(root.next);
        root = merge(root, root.next);
        return root;
    }

    public static Node merge(Node a, Node b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        Node res;

        if (a.data < b.data) {
            res = a;
            res.bottom = merge(a.bottom, b);
        } else {
            res = b;
            res.bottom = merge(a, b.bottom);
        }
        return res;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.bottom;
        }
    }

    public static void main(String args[]) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(19);
        head.next.next.next = new Node(28);

        head.next.bottom = new Node(7);
        head.next.bottom.bottom = new Node(8);
        head.next.bottom.bottom.bottom = new Node(30);

        head.next.next.bottom = new Node(20);

        head.next.next.next.bottom = new Node(22);
        head.next.next.next.bottom.bottom = new Node(50);

        head.next.next.next.next.bottom = new Node(35);
        head.next.next.next.next.bottom.bottom = new Node(40);
        head.next.next.next.next.bottom.bottom.bottom = new Node(45);

        head = flatten(head);

        System.out.println("Flattened Linked List:");
        printList(head);
    }
}

