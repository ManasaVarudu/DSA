
class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        Node temp = head;
       
	    while(temp!=null)
	    {
	         Node sample = temp;
	            while(sample!=null && temp.data== sample.data)
	            sample= sample.next;
	            
	            temp.next=sample;
	            
	            temp = temp.next;
	            
	           
	       
	    }
	    return head;
    }
}
