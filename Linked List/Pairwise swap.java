
class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        if(head==null)
        return null;
        
       Node prev = new Node (-1);
       Node ans = prev;
       prev.next = head;
       
       Node curr = head;
       Node next =  head.next;
       
       while(curr!=null && next!=null)
       {
           Node temp = next.next;
           next.next= curr;
           curr.next = temp;
           prev.next = next;
           
           prev = curr;
           curr=curr.next;
           if(curr!=null)
           next = curr.next;
       }
       
        return ans.next;
    } 
}
