package day2;

public class VariablesDemo {
    // 1. premitive data types - does not refer an object
    /*
    without fraction - Integer : small (0,1 .... trillion)
    integer
        byte (8bit)-> range (-128 to 127) ->
        short (2byte) range(-32,768 to 32,767)
        int (4byte) range (-2,147,483,648, to 2,147,483,647)
        long (8byte) range (9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
     Decimal - fraction part - accounting
        float num = 1.1234567
        double num2 = 1.123456789987654
     Character - used to store single letter and unicode symbols (Aa-Zz, 0-9, !,.., $))
        char
     Boolean
        true/false
    */
    char grade = 'A';
    int mark = 97;
    // 2. nonpremitive data types - refer an object - DOZEN
    String name = "Betty";
    int[] marks = {97,100,80,78};
    // integer
    byte roomNumber = 47;
    short pinNumber = 5902;
    int annualBudget = 2_000_000_000;
    long ethiopianBudget = 9223372036854775807l;
    // decimal 1000 = 10^3, 10*9^15
    float icecreamPrice = 9.99F;
    double temperature = 9.999999999999999999;
    // boolean
    boolean isActive = true;
    boolean isProgrammer = false;
    // char
    char payPeriodCode = 'M';

}
