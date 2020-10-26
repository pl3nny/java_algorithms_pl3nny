package ds.stack;

public class CharStack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public CharStack(int size)
    {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j)
    {
        top++;
        this.stackArray[top] = j;
    }

    public char pop()
    {
        int old_top = top;

        top--;
        return stackArray[old_top];
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return(top + 1 == maxSize);
    }

    public char peek()
    {
        return stackArray[top];
    }
}

