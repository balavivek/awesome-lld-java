package awesome.lld.fundamentals.oop.interfaces.stack;

/**
 * Implementation of a stack using an array.
 */
public class ArrayStack implements Stack {

    private int[] stack;
    private int top;
    private int capacity;

    /**
     * Constructs an ArrayStack with the specified capacity.
     *
     * @param capacity the maximum number of elements the stack can hold
     */
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    /**
     * Pushes an item onto the top of the stack.
     *
     * @param item the item to be pushed onto the stack
     * @throws StackOverflowError if the stack is full
     */
    @Override
    public void push(int item) {
        if (top == capacity - 1)
            throw new StackOverflowError("Stack is full");

        stack[++top] = item;
    }

    /**
     * Removes and returns the item at the top of the stack.
     *
     * @return the item at the top of the stack
     * @throws RuntimeException if the stack is empty
     */
    @Override
    public int pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return stack[top--];
    }

    /**
     * Returns the item at the top of the stack without removing it.
     *
     * @return the item at the top of the stack
     * @throws RuntimeException if the stack is empty
     */
    @Override
    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return stack[top];
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}