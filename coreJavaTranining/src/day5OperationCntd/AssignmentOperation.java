package day5OperationCntd;

public class AssignmentOperation {
    public static void main(String[] args) {
        // Assignment
        // = > assigns a value from right side to the left side operand x = 5;
        double price = 9.99;
        boolean isActive = false;
        // there might re using a variable value in assignment a = a + 5;
        int a = 10;
        System.out.println("original a = " + a );
        // add 10 to a
        System.out.println("Percentaged a = " + a);
        // compound assignment +=, -=, *=, /=, %=
        // a = a + 5; => a+=5
        System.out.println(a += 5); // a = 10 + 5 = 15
        System.out.println(a -= 5); // a = 15 - 5 = 10
        System.out.println(a *= 5); // a = 10 * 5 = 50
        System.out.println(a /= 5); // a = 50 / 5 = 10
        System.out.println(a %= 5); // a = 10 % 5 = 0

        // Special compound assignment
        // when adding or subsructing a variable value from itself only by one each time
        int i = 10;
        i = i + 1;
        i = i + 1;
        // we are adding one to i value each time -> increment operation
        int x = 5;
        x = x - 1;
        x = x - 1;
        // we are substructing one from x value each time -> decrement operation
        double balance = 1000;
        System.out.println(balance);
        double deposit = 200;
        double withdraw = 100;
        balance = balance + deposit;
        System.out.println(balance);
        balance = balance - withdraw;
        System.out.println(balance);



    }
}
