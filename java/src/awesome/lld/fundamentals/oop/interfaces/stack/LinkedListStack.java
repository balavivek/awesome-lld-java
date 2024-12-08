package awesome.lld.fundamentals.oop.interfaces.stack;

/**
 * Implementation of a stack using a linked list.
 */
public class LinkedListStack implements Stack {

    /**
     * Node class represents each element in the linked list.
     */
    private static class Node {
        int data;
        Node next;

        /**
         * Constructs a Node with the specified data.
         *
         * @param data the data to be stored in the node
         */
        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    /**
     * Pushes an item onto the top of the stack.
     *
     * @param item the item to be pushed onto the stack
     */
    @Override
    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    /**
     * Removes and returns the item at the top of the stack.
     *
     * @return the item at the top of the stack
     * @throws RuntimeException if the stack is empty
     */
    @Override
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    /**
     * Returns the item at the top of the stack without removing it.
     *
     * @return the item at the top of the stack
     * @throws RuntimeException if the stack is empty
     */
    @Override
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }
}