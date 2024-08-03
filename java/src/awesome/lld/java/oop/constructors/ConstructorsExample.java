package awesome.lld.java.oop.constructors;

/**
 * Same name as class name.
 * Construct will not return any type.
 * Block of code similar to the method, it is called when instance of the class is created.
 * While calling constructor memory of an object is allocated in the memory.
 * Construct will get called only once at the time of object creation.
 * Every time object is created using new keyword.
 * Java compiler will create default constructor (no arguments) if there is no constructor created for the class.
 *
 * Constructor Chaining - TBD
 * Copy Constructor - TBD
 */
public class ConstructorsExample {

    String course;
    String topic;

    /**
     * default constructor
     */
    ConstructorsExample(){
        System.out.println("Default Constructor called ! ");
    }

    /**
     * Parameterized  constructor
     */
    ConstructorsExample(String course, String topic){
        this.course = course;
        this.topic = topic;
    }

    /**
     * Constructor overloading
     */
    ConstructorsExample(String course){
        this.course = course;
    }

    /**
     * Copy constructor
     * @param constructorsExample
     */
    ConstructorsExample(ConstructorsExample constructorsExample){
        this.course = constructorsExample.course;
        this.topic = constructorsExample.topic;
    }

    public static void main(String[] args) {
        // instance of the class is created with default constructor.
        ConstructorsExample defaultConstructorsExample = new ConstructorsExample();

        // instance of the class is created with Parameterized constructor.
        ConstructorsExample oops = new ConstructorsExample("lld-1", "oops");
        System.out.println("oops : Course Name : "+oops.course+" Topic Name : "+oops.topic);

        // instance of the class is created with Parameterized constructor.
        ConstructorsExample accessModifier = new ConstructorsExample("lld-2", "accessModifier");
        System.out.println("accessModifier : Course Name : "+accessModifier.course+" Topic Name : "+accessModifier.topic);


        // instance of the class is created with Parameterized constructor and constructor overloading.
        ConstructorsExample courseName = new ConstructorsExample("lld");
        System.out.println("overloading : Course Name : "+courseName.course);

        // instance of the class is created with copy constructor
        ConstructorsExample copyConstructor = new ConstructorsExample(accessModifier);
        System.out.println("copyConstructor : Course Name : "+copyConstructor.course+" Topic Name : "+copyConstructor.topic);

    }
}
