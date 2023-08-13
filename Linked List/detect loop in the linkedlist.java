

class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
         Node slow = head;
        Node fast  = head.next;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
           if(slow == fast){
            return true;
        }
        
        }
        
        return false;
    }
}
