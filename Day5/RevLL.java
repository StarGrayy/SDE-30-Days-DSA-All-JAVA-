package Day5;
public class RevLL{
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
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }

        ListNode next= null;
        ListNode prev= null;
        ListNode current= head;

        while(current!=null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
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

    ListNode current = reverseList(head);
    System.out.print("Reversed List: ");
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;
    }
        
    }
}