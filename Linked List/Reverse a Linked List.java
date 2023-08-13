
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node curr = head, next=null, prev = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
