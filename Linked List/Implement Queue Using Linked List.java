class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
    
	void push(int a)
	{
	    int flag = 0;
	    QueueNode n = new QueueNode(a);
        if(front == null && rear == null)
        {
            front= n;
            rear=n;
        }
        else
        {
            if(flag==0)
            {
                 QueueNode temp = front;
            
                 while(temp!=rear)
                 temp=temp.next;
            
                 temp.next = n;
                 rear=n;
                 
                 flag=1;
            }
            else
            {
                rear.next = n;
                rear =n;
            }
            
            
           
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(front == null && rear == null)
	    return -1;
	    
        int x = front.data;
        if(front==rear)
        {front= front.next; rear = rear.next;}
        else
        front=front.next;
        return x;
	}
}
