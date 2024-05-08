package Day5;

public class MergeTwo {
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
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node1= list1;
        ListNode node2= list2;
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while(node1!=null && node2!=null){
            if(node1.val>node2.val){
                current.next=node1;
                node1 = node1.next;
            }else{
                current.next=node2;
                node2 = node2.next;
            }
        }
        while(node1!=null){
            current.next=node1;
            node1 = node1.next;
        }
        while(node2!=null){
            current.next=node2;
            node2=node1.next;
        }
        return dummy;
    }
    public static void main(String[] args) {
        ListNode head1 = null;
        ListNode head2 = null;
        ListNode tail1 = null;
        ListNode tail2 = null;

        int[] arr1 = {1,2,4};
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
        int[] arr2 = {1,3,4};
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
        ListNode node = mergeTwoLists(head1,head2);
    System.out.print("New List: ");
    while (node != null) {
        System.out.print(node.val + " ");
        node = node.next;
    }
    }
}
