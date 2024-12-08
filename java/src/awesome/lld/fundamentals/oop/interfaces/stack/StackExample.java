package awesome.lld.fundamentals.oop.interfaces.stack;

/**
 * HW: Implement ArrayStack and LinkedList Stack which implements stack interface
 * <p>
 * Interfaces in Java are like blueprints or contracts that define a set of methods that a class must implement.
 * They provide a way to achieve: *
 * Total Abstraction: Interfaces focus on what a class should do without specifying how it's done.
 * This means you can define the behavior without worrying about the implementation details.
 * <p>
 * Multiple Inheritance: While Java doesn't allow classes to directly inherit from multiple other classes,
 * it can achieve a similar effect using interfaces. A class can implement multiple interfaces,
 * inheriting the methods defined in each.
 * <p>
 * Loose Coupling: Interfaces promote loose coupling between classes. This means that changes to the implementation
 * of a class won't affect other classes as long as they adhere to the interface contract.
 * <p>
 * Abstraction: Interfaces provide a level of abstraction by defining a common set of methods that different classes
 * can implement in their own unique ways.
 * <p>
 * In simpler terms: Interfaces are like rules that classes must follow. They define what a class should be able to do,
 * but don't dictate how it should do it. This makes your code more flexible, organized, and easier to understand.
 */
public class StackExample {

    /**
     * The main method demonstrates the usage of ArrayStack and LinkedListStack implementations.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an ArrayStack with a capacity of 5
        Stack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        System.out.println("ArrayStack Pop: " + arrayStack.pop()); // Output: 3
        System.out.println("ArrayStack peek: " + arrayStack.peek()); // Output: 2

        // Create a LinkedListStack
        Stack linkedListStack = new LinkedListStack();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("LinkedListStack Pop: " + linkedListStack.pop()); // Output: 30
        System.out.println("LinkedListStack Peek: " + linkedListStack.peek()); // Output: 20
    }

}
