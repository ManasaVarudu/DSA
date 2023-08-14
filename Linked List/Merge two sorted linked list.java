class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
    
      Node temp1 = null,temp2=null; 
      int flag =0;
      if(head1.data <= head2.data)
      {temp1=head1; temp2=head2; flag=1;}
      else
      {temp1 = head2; temp2 = head1; flag=2;}
      
      while(temp1.next!=null && temp2!=null)
      {
           while(temp1.next!=null && temp1.next.data<=temp2.data)
             temp1=temp1.next;
      
           Node a = temp1.next;
           Node b = temp2.next;
           temp1.next = temp2;
           temp2.next = a;
           
           temp2 = b;
           temp1=temp1.next;
      }
      
      if(temp2!=null)
      temp1.next = temp2;
      
       if(flag==1)
       return head1;
       return head2;
      }
     
      
   } 
