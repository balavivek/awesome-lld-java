package awesome.lld.java.oop.accessmodifierstest;

import awesome.lld.java.oop.accessmodifiers.AccessModifiersExamples;

public class AccessModifiersTest {

    /**
     * compilation error:
     * 'defaultMethod()' is not public in 'awesome.lld.java.oop.accessmodifiers.AccessModifiersExamples'.
     * Cannot be accessed from outside package.
     * This will be applicable for class and properties as well.
     */
    public static void defaultMethodTest(){
        //AccessModifiersExamples.defaultMethod();
    }

    /**
     * public method can be access from outside the package
     */
    public static void publicMethodTest(){
        AccessModifiersExamples.publicMethod();
    }

    /**
     * Compilation error
     * 'privateMethod()' has private access in 'awesome.lld.java.oop.accessmodifiers.AccessModifiersExamples'
     */
    public static void privateMethodTest(){
//        AccessModifiersExamples.privateMethod();
    }

    /**
     * Compilation error
     * 'protectedMethod()' has protected access in 'awesome.lld.java.oop.accessmodifiers.AccessModifiersExamples'
     */
    public static void protectedMethodTest(){
//        AccessModifiersExamples.protectedMethod();
    }


}
