package Day5;

public class DeleteNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
        
    }
    public static void deleteNode(ListNode node) {
        
        if (node == null || node.next == null) {
            return;
        }
           
        node.val = node.next.val;
        
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        ListNode head = null;
        ListNode tail = null;

        int[] arr = {4,5,1,9};
        for(int i:arr){
            ListNode newNode = new ListNode(i);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
        }
        ListNode node = head;
        while(node.val!=5){
            node=node.next;
        }
        deleteNode(node);
        node = head;
    System.out.print("New List: ");
    while (node != null) {
        System.out.print(node.val + " ");
        node = node.next;
    }
        
    }

}
