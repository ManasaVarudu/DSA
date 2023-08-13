

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
        Node temp = head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        
        int ans = (c/2)+1;
        
        int i=1;temp=head;
        int res = Integer.MAX_VALUE;
        while(temp!=null)
        {
            if(i==ans)
            {
                res = temp.data;
                break;
            }
            i++;
            temp=temp.next;
        }
        
        return res;
    }
}
