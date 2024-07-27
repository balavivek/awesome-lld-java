package awesome.lld.java.oop.accessmodifierstest;

import awesome.lld.java.oop.accessmodifiers.AccessModifiersExamples;

public class AccessModifiersChildTest extends AccessModifiersExamples {


    /**
     * Protected method can be accessible from child class of AccessModifiersExamples.
     */
    public static void protectedMethodTest(){
        AccessModifiersExamples.protectedMethod();
    }

}
