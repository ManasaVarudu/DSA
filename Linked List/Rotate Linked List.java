
class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        
        Node ori_head = head;
        Node temp = head;
        while(k-- >1)
        temp = temp.next;
        
        if(temp.next==null)
        return head;
        head = temp.next;
        temp.next = null;
        
        temp=head;
        while(temp.next!=null)
        temp= temp.next;
        
        temp.next = ori_head;
        return head;
        
    }
}
