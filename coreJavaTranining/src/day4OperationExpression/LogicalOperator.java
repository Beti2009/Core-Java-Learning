package day4OperationExpression;
// They acts on boolean values - true and true, true or false , not true, not false
// returns a boolean type
public class LogicalOperator {
    public static void main(String[] args) {
        // Logical Operators - AND (&&), OR (||), NOT (!)
        // Logical And - both operand has to be true for a result to be true unless results to false
        boolean hasGoodCredit = false;
        boolean hasHighIncome = false;
        int a = 10;
        int b = 20;
        int c, d;
        c=d=10;
        boolean grantCredit;
        grantCredit = hasGoodCredit && hasHighIncome;

        System.out.println("Is legit for Credit " + grantCredit);

        System.out.println("And result - " + ((a>b) && (c==d))); // false && true = false

        // Logical Or - Its enough for a result to be true if one of operand value is true
        System.out.println("Or result = " + ((a>b) || (c==d))); // false || true = true
        // Not - inverting the operand value - !true = false, !false = true
        System.out.println(!hasHighIncome);
        System.out.println(!hasGoodCredit);
        System.out.println(!(c==d));
    }
}
