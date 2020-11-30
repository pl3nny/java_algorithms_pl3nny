package queue;

public class Queue {

    // queue FIFO rule
    // main methods - queue, dequeue, peek, isFull, isEmpty

    private int maxSize;
    private long[] queueArray;
    private int rear;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new long[maxSize];
        rear = 0;
    }

    public void enqueue(int item) {
        if (isEmpty()) {
            queueArray[0] = item;
            rear++;
        } else {
            if (isFull())
                System.out.println("Queue is full...");
            else {
                queueArray[rear] = item;
                rear++;
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
        queueArray[rear] = 0;
        
        return dequeued;
    }

    public boolean isEmpty() {
        if (queueArray[0] == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (queueArray[maxSize - 1] != 0)
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

}
