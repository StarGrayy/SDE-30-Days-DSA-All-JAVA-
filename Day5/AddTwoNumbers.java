package Day5;

public class AddTwoNumbers {
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;

            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            ListNode newNode=new ListNode(sum%10);
            current.next = newNode;
            current = current.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head1 = null;
        ListNode head2 = null;
        ListNode tail1 = null;
        ListNode tail2 = null;

        int[] arr1 = {2,4,3};
        for(int i:arr1){
            ListNode newNode = new ListNode(i);
            if(head1==null){
                head1=newNode;
                tail1=newNode;
            }else{
                tail1.next = newNode;
                tail1 = tail1.next;
            }
        }
        int[] arr2 = {5,6,4};
        for(int i:arr2){
            ListNode newNode = new ListNode(i);
            if(head2==null){
                head2=newNode;
                tail2=newNode;
            }else{
                tail2.next = newNode;
                tail2 = tail2.next;
            }
        }
        
    ListNode node = addTwoNumbers(head1, head2);
    System.out.print("New List: ");
    while (node != null) {
        System.out.print(node.val + " ");
        node = node.next;
    }
    }
}
