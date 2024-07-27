package awesome.lld.java.oop.accessmodifiers;

public class AccessModifiersTest {

    /**
     * This method tests the default access modifier method from the AccessModifiersExamples class.
     * It calls the defaultMethod() of AccessModifiersExamples.
     */
    public static void defaultMethodTest(){
        AccessModifiersExamples.defaultMethod();
    }


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
     * Access within the package.
     */
    public static void protectedMethodTest(){
        AccessModifiersExamples.protectedMethod();
    }

}
