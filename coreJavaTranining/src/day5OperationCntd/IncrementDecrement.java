package day5OperationCntd;

public class IncrementDecrement {
    public static void main(String[] args) {
        // when we are adding / substructing one to/from a variable value and assign back to the variable

        // 1. increment (a++)
        /*
        int a = 10;
        a = a + 1;
        System.out.println(a); // 11
        a += 1;
        System.out.println(a); // 12

        a++;
        System.out.println(a); // 13

        // post increment and pre increment - where we assign  a variable value that increment to another variable
        int i = 10;
        System.out.println("Post Increment");
        int result = i++; // result = i = i + 1
        System.out.println("i = " + i);
        System.out.println("result = " + result); // post increment

        // pre increment
         i = 10;
        result = ++i;
        System.out.println();
        System.out.println("Pre Increment");
        System.out.println("i = " + i);
        System.out.println("result = " + result);
    */

        // 2 Decrement Operation
        // a-- -> post decrement
        // --a -> pre decrement
        int i = 3;
        int substruct = i--;
        System.out.println("post decrement");
        System.out.println("i = " + i); // 2
        System.out.println("substruct = " + substruct); // 3

        System.out.println();
        System.out.println("Pre decrement");
        i = 3;
        substruct = --i;
        System.out.println("i = " + i); //2
        System.out.println("substruct = " + substruct); // 2

        // Operators type - based on operand / value they act on
        // 1. Unary Operators -> =, !, ++, --, +=, -=, /=, %=
        // 2. Binary Opeators -> >, >=, << <=, ==, !=, -, +, /, * , &&, ||
        // 3. Ternary Operator -> ? _ : _



    }
}
