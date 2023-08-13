class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node hd =null;
        Node middle = null;
        Node last =null;
        Node temp = head;
        while(temp!=null)
        {
            int d = temp.data;
            Node n = new Node(d);
            
            Node tmp = hd;
            if(hd==null)
            hd = n;
            else if(d==0)
            {
                    n.next = hd;
                    hd =n;
            }
            else if(d==1)
            {
                     // finding the insertion position, so that we no need to iterate each time
                if(hd.data!=0)
                    {
                        n.next = hd;
                        hd = n;
                        middle = n;
                    }
                
                else if(middle==null)
                    {
                         tmp = hd;
                         Node prev = null;
                         while(tmp!=null && tmp.data==0)
                             { 
                                 prev = tmp;
                                 tmp = tmp.next;
                             }
                         middle = prev;
                
                    Node k = middle.next;
                    middle.next = n;
                    n.next=k;
                 
                    }
                else
                    {
                         Node k = middle.next;
                         middle.next = n;
                         n.next=k;
                     }
              
              
              
            }
            else if(d==2)
            {
               if(last==null)
               {
                   tmp = hd;
                   while(tmp.next!=null)tmp=tmp.next;
                   last = tmp;
               }
               last.next = n;
               last = n;
            }
            
            temp=temp.next;
        }
        return hd;
    }
}
