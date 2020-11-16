package ds.queue;

public class Queue {
    private int maxSize;
    private long queueArray[];
    private int front; // index position of the element at the front of the line
    private int rear; // index position of the element at the back of the line
    private int nItems; // counter to the maintain the number of items still in queue

    public Queue(int size)
    {
        this.maxSize = size;
        this.queueArray = new long[this.maxSize];
        this.front = 0;
        this.rear = -1; // no item to be considered to be at rear when initializing queue array
        this.nItems = 0; // no elements in array when initializing
    }

    public void enqueue(long j)
    {
        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    public long dequeue()
    {
        nItems--;
        front++;
        return queueArray[front - 1];
    }

    public boolean isFull()
    {
        if(nItems == maxSize)
            return true;
        return false;
    }

    public boolean isEmpty()
    {
        if(nItems == 0)
            return true;
        return false;
    }

    public long peek()
    {
        return queueArray[front];
    }
}
