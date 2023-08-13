class Solution
{
        /* Function to print nodes in a given Circular linked list */
	    void printList(Node head)
        {
             Node temp = head;
             System.out.print(temp.data+" ");
             temp=temp.next;
             while(temp!=null)
             {
                 if(temp==head)
                 break;
                 System.out.print(temp.data+" ");
                 temp=temp.next;
             }
	    }
	    
	    
}
