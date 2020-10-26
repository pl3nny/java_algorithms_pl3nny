package ds.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long j) {
        if (!isFull()) {
            top++;
            stackArray[top] = j;
            System.out.println("added: " + j);
        } else {
            System.out.println("Looks like the stack is full...could not add " + j + " :/");
        }

    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty...");
            return -1;
        } else {
            int old_top = top;
            top--;

            return stackArray[old_top];
        }
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

}
