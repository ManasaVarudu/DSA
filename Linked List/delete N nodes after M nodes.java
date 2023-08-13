
class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        Node  temp = head;
        while(temp!=null)
        {
            int skp = M;
            int del = N;
            
            while(temp!=null && skp-- > 1)
            temp = temp.next;
            
            if(temp == null)
            break;
            
            else
            {
                Node temp2 = temp.next;
                while(temp2!=null && del-- >0)
                temp2 = temp2.next;
            
                
                temp.next = temp2;
            }
            
        temp=temp.next;
        }
        
    }
}
