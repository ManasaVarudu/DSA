
class Solution
{
    // Reverse each k recursevily
    // In each iteration store first node , last node of the reversed LL
    // last node is used for connecting links and the first node is used for returning purpose
    
    public static Node reverse(Node node, int k)
    {
        Node curr= node;
        Node next=null, prev=null;
        Node other_first = null;
        int m = k;
        
        
        
        while(m-- !=0 && curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Node last = node;
        // node=prev;
        
      
        if(curr!=null)
        other_first  =  reverse(curr,k);
       
    //   last.next = other_first;
    node.next = other_first;
       
       
        
        return prev;
    }
}
