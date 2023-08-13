class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        Node temp =head;
        Node prev = null;
        while(temp!=null)
        {
           
            if(temp.data==d)
            {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node nxt = null;
        while(curr.next!=head)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        curr.next = prev;
        head.next = curr;
        head = curr;
        return head;
        
    }
}
