
class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	
    	Node temp = head;
    	int cnt =0;
    	while(temp!=null)
    	{temp=temp.next;++cnt;}
    	
    	if(n>cnt)
    	return -1;
    	
    	n = cnt-n;
    	temp = head;
    	while(n-- >0)
    	temp=temp.next;
    	
    	return temp.data;
    	
    }
}
