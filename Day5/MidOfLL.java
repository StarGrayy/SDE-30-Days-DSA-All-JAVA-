package Day5;

public class MidOfLL {
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
    public static ListNode middleNode(ListNode head) {
        ListNode node = head;
        int size=0;
        while(node!=null){
            node=node.next;
            size++;
        }
        
        size=(int)Math.ceil(size/2);
        node=head;
        
        while(size!=0){
            node=node.next;
            size--;
        }
        return node;
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
       
        ListNode node = middleNode(head);
        System.out.print(node.val + " ");
    }
}

