package awesome.lld.fundamentals.oop.accessmodifiers;

/**
 * There are four access modifiers in java
 * public : Class, Package, Subclass, World
 * private : Class
 * protected : Class, Package, Subclass
 * default : Class, Package
 */
public class AccessModifiersExamples {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * Default:
     * No key word required
     * default access will provide to class, method, or property
     * it's also called package private, which means access only in same package
     * not accessible outside of package
     */
    static void defaultMethod() {
        System.out.println("I'm accessible only inside same package ");
    }

    public static void publicMethod(){
        System.out.println("I'm available everywhere in this project");
    }

    /**
     * Access from the same class only
     * most restricted access modifier
     * core concept of encapsulation
     * All data will be hidden from outside world
     */
    private static void privateMethod(){
        System.out.println("I'm accessible only inside the class");
    }

    /**
     * Access everywhere inside package
     * Outside package access only via subclass.
     */
    protected static void protectedMethod(){
        System.out.println("I'm accessible via subclass if needed othside package");
    }


}
