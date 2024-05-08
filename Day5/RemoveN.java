package Day5;

public class RemoveN {
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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = head;
        int size = 0;
        
        while (node != null) {
            node = node.next;
            size++;
        }
        
        int idxToRemove = size - n;
        
        if (idxToRemove == 0) {
            return head.next;
        }
        
        node = dummy;
        while (idxToRemove > 0) {
            node = node.next;
            idxToRemove--;
        }
        
        node.next = node.next.next;
        
        return dummy.next; 
    }
    public static void main(String[] args) {
        ListNode head = null;
        ListNode tail = null;

        int[] arr = {1,2,3,4,5};
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
       
        ListNode node = removeNthFromEnd(head,2);
    System.out.print("New List: ");
    while (node != null) {
        System.out.print(node.val + " ");
        node = node.next;
    }
    }
}
