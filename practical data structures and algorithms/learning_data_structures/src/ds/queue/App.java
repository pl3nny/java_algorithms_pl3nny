package ds.queue;

public class App {

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);

        System.out.println();
        System.out.println("Peek: " + queue.peek());
        System.out.println("is full? " + queue.isFull());
        queue.dequeue();
        System.out.println("Peek: " + queue.peek());
        System.out.println("is full? " + queue.isFull());

        System.out.println();

    }
    
}
