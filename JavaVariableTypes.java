
/*
    variable types:
    1. local variable : method level scope
    2. instatnce variable / non static class variable : class level scope /
    3. static variable / global :
       3.1 class level + project level scope
       3.2 can't create new static variable inside any type of method

    method types:
    1. non-static method
    2. static method
 */

public class JavaVariableTypes
{
    int a = 7; // instance variable
    String name = "rohan"; // instance vaiable / non-static variable
    static int rollNo = 1005; // static variable
    //static method
    public static void main(String args[])
    {
        int a = 10; // local variable
        System.out.println("rollNo : "+rollNo);
        //System.out.println("name : "+name); // it will not work
        // to use non-static variable on static  method we have to create
        // that class object, and using object reference we can call or use
        // non-static variable
        JavaVariableTypes javaVariableTypes = new JavaVariableTypes(); // new object
        System.out.println("javaVariableTypes object reference "+javaVariableTypes);
        System.out.println("name : "+javaVariableTypes.name); // instance / non-static
        String name = "aman"; // local
        System.out.println("name : "+name); // local
        testStaticMethod();
        //testNonStaticMethod(); // it will not work
        // to use non-static method on static  method we have to create
        // that class object, and using object reference we can call or use
        // non-static method
        javaVariableTypes.testNonStaticMethod();
    }

    // static method
    public static void testStaticMethod()
    {
        System.out.println("inside testStaticMethod ");
        // we can't use non-static variable directly on static method
        //System.out.println("name : "+name); // it will not work
        // with the help of object we can use non-static variable
        JavaVariableTypes javaVariableTypes = new JavaVariableTypes(); // new object
        System.out.println("javaVariableTypes object reference "+javaVariableTypes);
        System.out.println("name : "+javaVariableTypes.name); // instance / non-static
        int a = 10; // local variable
        String name = "aman"; // local
        System.out.println("rollNo : "+rollNo); // static variable
        int rollNo = 2005; // local variable
        System.out.println("rollNo : "+rollNo); // local variable
        // we can't call direclty non-static  method from static  method
        //testNonStaticMethod();
        // we can call non-static method using object from static method
        javaVariableTypes.testNonStaticMethod();
    }

    // non-static method
    public void testNonStaticMethod()
    {
        System.out.println("inside testNonStaticMethod ");
        System.out.println("rollNo : "+rollNo); // static variable
        System.out.println("a : "+a); // instance variable / non static
        int a = 10; // local variable
        System.out.println("a : "+a); // local variable
        System.out.println("name : "+name); // instance / non-static
        String name = "aman"; // local
        System.out.println("name : "+name);
        ////
        // we can call directly non-static method from non-static method
        testNonStaticMethod();
        // we can  call directly static  method from non-static method
        testStaticMethod();
    }

    // non-static
    public void testOtherNonStaticMethod()
    {
        System.out.println("inside testOtherNonStaticMethod ");
    }

}




