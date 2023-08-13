public static Node reverseDLL(Node  head)
{
    Node curr_node = head;
    Node temp = null;
    
    while(curr_node!=null)
    {
        if(curr_node.next==null)
        head= curr_node;
        
        temp = curr_node.next;
        curr_node.next = curr_node.prev;
        curr_node.prev = temp;
        curr_node = curr_node.prev;
        
    }
    return head;
    
}
