package day9ConditionalStatmentsCntd.Assignment;
import java.util.Scanner;
//2. Online shopping : Discount calculation based on the coupon code
//// use switch case to apply different discount based on the code the use enter
//// "SUMMER10" GETS 10%, "FALL15" -> 15%, "WINTER20" -> 20%
////Implement a logic that determine discounted amount based on the coupon code, and wether the coupon applied or
//// not for a total price
public class DiscountCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coupon code (SUMMER10, FALL15, WINTER20): ");
        String couponCode = scanner.next().toUpperCase();

        double discountPercentage;

        switch (couponCode) {
            case "SUMMER10":
                discountPercentage = 0.10;
                System.out.print("Enter your total price : ");
                double totalPrice = scanner.nextDouble();

                double discountAmount = totalPrice * discountPercentage;
                totalPrice -=discountAmount;
                    System.out.println("your discount balance is = " + couponCode);
                    System.out.println("your total price after discount = " + totalPrice );

                break;

            case "FALL15":
                discountPercentage = 0.15;
                System.out.print("Enter your total price : ");
                double totalPrice2 = scanner.nextDouble();

                double discountAmount2 = totalPrice2 * discountPercentage;
                totalPrice2 -=discountAmount2;
                System.out.print("your discount balance is = " + discountAmount2);
                System.out.println("your total price after discount = " + totalPrice2 );
                break;

            case "WINTER20":
                discountPercentage = 0.20;
                System.out.print("Enter your total price : ");
                double totalPrice3 = scanner.nextDouble();

                double discountAmount3 = totalPrice3 * discountPercentage;
                totalPrice3 -=discountAmount3;
                System.out.println("your discount balance is = " + discountAmount3);
                System.out.println("your total price after discount = " + totalPrice3 );
                break;
            default:
                System.out.println("Sorry You don't have discount!");
                discountPercentage = 0.0;
                System.out.print("Enter your total price : ");
                double totalPrice4 = scanner.nextDouble();

                double discountAmount4 = totalPrice4 * discountPercentage;
                totalPrice4 -=discountAmount4;
                System.out.println("your discount balance is = " + discountAmount4);
                System.out.println("your total price after discount = " + totalPrice4 );
                break;

        }

    }
}
