class Solution
{
    public static int count(Node head, int search_for)
    {
        //code here
        int cnt=0;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==search_for)
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
}
