
/*
    operators
    1. Arithmatic
        +, -, *, /, %
    //
    2. Assignment
        =, +=, -=, *=, /=, %=
    //
    3. Comparison / Relational
        ==, <, >, <=, >=, !=
    //
    4. Unary, increment/decrement
        ++, --
        postfix and prefix
        a++          ++a
    //
    5. Logical
        And ( && ), OR ( || ), Not ( ! )
    //
    6. Bitwise, shift operator
        And ( & ), Or ( | ) , xor ( ^ ),
        left shift ( << ), right shift ( >> ),
        unsigned right shift ( >>> )
    //
    7. Ternay
        ?, :

 */

public class JavaOperators
{
    public static void main(String[] args)
    {
        System.out.println(" at JavaOperators example ");
        //testArithmaticOperator();
        //testAssignmentOperator();
        testRelationalOperator();
    }


    public static void testArithmaticOperator()
    {
        // +, -, *, /, %
        int a = 10;
        int b = 5;
        int c = 8;

        int result = (a + b) * a / b; //
        //
        System.out.println("result "+result);
        int mod = a % c;
        System.out.println("mod "+mod);
        //String fullName = "100 "+ "28";
        byte b1 = (byte) ((byte)100 + 30);
        byte bb = (byte) ((byte)  100 + 30); // -128 to 127
        System.out.println("b1 : "+b1);
        System.out.println("bb : "+bb);
    }

    public static void  testAssignmentOperator()
    {
        // =, +=, -=, *=, /=, %=
        double a = 10;
        a = a + 5; // 15
        a += 5; // 20
        a -= 5; // 15
        a *= 2;  //30
        a /= 5; // 6
        System.out.println("a : "+a);
        a %= 7;  // 6
        //a += 14; // 20
        //a /= 10; //
        a = (int) a / 10; // explicit conversion from double to int
        System.out.println("a : "+a);
        double ad = 10; // implicit conversion from int to double
        System.out.println("ad : "+ad);

        int b = 10;
        b += 5; // 15
        b += b + 5; // 35
        // 15 +=  20
        System.out.println("b : "+b);
        b -= b * 2; // 40
        // 35 -=  70;
        System.out.println("b : "+b);
        b *= b + 3;
        // -35 *=  -32
        System.out.println("b : "+b);
    }


    // comparison
    public static void testRelationalOperator()
    {
        // ==, <, >, <=, >=, !=
        int a = 10;
        int b = 5;
        int c = 10;
        System.out.println( a == b);
        System.out.println( a < c );
        System.out.println( a <= c );
        System.out.println( a != c);
        System.out.println( a != b);
    }

}
