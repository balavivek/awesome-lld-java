package awesome.lld.fundamentals.oop.accessmodifierstest;

import awesome.lld.fundamentals.oop.accessmodifiers.AccessModifiersExamples;

public class AccessModifiersChildTest extends AccessModifiersExamples {


    /**
     * Protected method can be accessible from child class of AccessModifiersExamples.
     */
    public static void protectedMethodTest(){
        AccessModifiersExamples.protectedMethod();
    }

}
