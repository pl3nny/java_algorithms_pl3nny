package ds.queue;

public class Queue {

    // queue FIFO rule
    // main methods - queue, dequeue, peek, isFull, isEmpty

    private int maxSize;
    private long[] queueArray;
    private int rear;
    private int nitems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new long[maxSize];

        // fill arrays without using Arrays import 
        for(int i = 0; i < maxSize; i++)
        {
            queueArray[i] = -1;
        }

        rear = 0;
        nitems = 0;
    }

    public void enqueue(int item) {
        if (isEmpty()) {
            queueArray[0] = item;
            rear++;
            nitems++;
        } else {
            if (isFull())
                System.out.println("Queue is full...");
            else {
                queueArray[rear] = item;
                rear++;
                nitems++;
            }
        }
    }

    public long dequeue() {
        long dequeued = queueArray[0];
        long temp = 0;
        for (int i = 0; i < maxSize; i++) {
            if ((i + 1) < maxSize) {
                temp = queueArray[i + 1];
                queueArray[i] = temp;
            }
            else {
                break;
            }
        }
        rear--;
        nitems--;
        queueArray[rear] = -1;
        return dequeued;
    }

    public long peek()
    {
        return queueArray[0];
    }

    public boolean isEmpty() {
        if (nitems == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (nitems == maxSize)
            return true;
        else
            return false;
    }

    public void showQueue() {
        System.out.print("[ ");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("]");
    }

    public int getItemCount()
    {
        return rear;
    }

}
