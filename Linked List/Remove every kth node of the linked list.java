class GfG
{
    /*You are required to complete this method*/
     Node delete(Node head, int k)
    {
        if(k==0)
        return head;
        if(k==1 || head==null)
        return null;
      Node temp =head;
      Node prev = null;
      int i=1;
      while(temp!=null)
      {
          if(i%k==0)
          {
              prev.next = temp.next;
              temp=temp.next;
             ++i;
          }
          prev = temp;
          if(temp!=null)
          temp=temp.next;
          ++i;
      }
      return head;
   
    }
}
