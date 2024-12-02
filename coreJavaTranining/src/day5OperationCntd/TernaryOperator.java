package day5OperationCntd;

public class TernaryOperator {
    public static void main(String[] args) {
        // ternary operator natation
        // result_varType result_varName = (check_condition)? value_if_true : value_if_false;
        // example 1 - to find the maximum of two number
        int a  = 301;
        int b = 200;
        int max = (a > b)? a : b;
        //System.out.println(max);
        // 2. check if a number is even / odd
        // 10 - is even
        // 7 - is odd
        String fullName = "John Doe";
        String profession = "Teacher";
        String isEvenOdd =  (a % 2 == 0)? a + " is even" : a + " is odd";
        boolean isProgrammer = (profession.equals("Programmer"))? true : false;
        System.out.println(isEvenOdd);
        System.out.println(fullName + " - " + isProgrammer);
    }
}
