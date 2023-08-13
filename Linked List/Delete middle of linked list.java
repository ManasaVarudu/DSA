
class Solution {
    Node deleteMid(Node head) {
        
        Node temp = head;
        int c=0;
        while(temp!=null)
        {
            temp = temp.next;
            c++;
        }
        
        int mid = c/2 ;
        //System.out.println(mid);
        temp = head;
        c = 0;
        while(++c != mid)
        {
            temp = temp.next;
        }
       // System.out.println(temp.data);
        
        temp.next  = temp.next.next;
        
        return head;
        
    }
}
