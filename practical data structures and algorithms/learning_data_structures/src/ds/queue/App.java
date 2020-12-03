package ds.queue;

public class App {
    public static void main(String[] args) {
        System.out.println("\n\tQueue Data Structure\n");

        Queue queue = new Queue(5);

        queue.showQueue();
        System.out.println();

        System.out.println("Queuing items...");

        for(int i = 0; i < 5; i++)
        {
            queue.enqueue(i + 1);
        }

        queue.showQueue();
        System.out.println();

        System.out.println("Adding: 10 to the queue");
        queue.enqueue(10); // should output queue is full
        System.out.println();

        System.out.println("Dequeuing: " + queue.dequeue());
        System.out.println("Dequeuing: " + queue.dequeue());
        System.out.println("Dequeuing: " + queue.dequeue());
        System.out.println();

        queue.showQueue();
        System.out.println();

        System.out.println("Adding: 15 to the queue");
        queue.enqueue(15);
        queue.showQueue();

        System.out.println("\npeeking front: " + queue.peek());

        System.out.println("\nnumber of itmes in queue: " +queue.getItemCount());
    }
}
