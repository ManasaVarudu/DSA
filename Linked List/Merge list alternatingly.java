class Solution {
    
    public static void mergeAlt(Node head1, Node head2){
         Node temp1 = head1;
         Node temp2= head2;
        
       while(temp1!=null && temp2!=null)
        {
           System.out.print(temp1.data+" ");
            System.out.print(temp2.data+" ");
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
        while(temp1!=null)
        {
           System.out.print(temp1.data+" ");
           temp1=temp1.next;
        }
        System.out.println();
        
         while(temp2!=null)
        {
           System.out.print(temp2.data+" ");
           temp2=temp2.next;
        }
    }     
        
}
