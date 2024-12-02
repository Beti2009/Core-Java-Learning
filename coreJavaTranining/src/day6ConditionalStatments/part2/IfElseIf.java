package day6ConditionalStatments.part2;

public class IfElseIf {
    // 1. Online shopping cart discount - different discounts may be applied to based on total purchase amount
    // totalPurchase >=1000 discount % = 2%, >=500 , 3%, >=100 5% otherwise there is no discout
    //ASSI 2. Grading system - a program that assign a leter grade based on score
    // if score >=90 then grade = 'A', else if score >=80, grade = 'B', ...
    // 3. Temperature control system - depending on temp, the system that turns on heater, or cooling.

    // 4. Traffic Light System - control system that decides the action based on color green, yellow, red
    //ASSI 5. Largest of three numbers
    // int a,b,c; a = 100; b=200; c=300;

    public static void main(String[] args) {

        // a progrma that calculate a discount amount
        /*
        double totalPurchase = 100.00;
        double discountedAmount;

        if (totalPurchase >=1000.00){
            discountedAmount = .02 * totalPurchase;
            System.out.println("2% discount("+ discountedAmount + ") applied pay - " + (totalPurchase - discountedAmount));
        } else if (totalPurchase >=500) {
            discountedAmount = .03 * totalPurchase;
            System.out.println("3% discount applied pay - " + (totalPurchase - discountedAmount));
        } else if (totalPurchase >=100){
            discountedAmount = .05 * totalPurchase;
            System.out.println("5% discount applied pay - " + (totalPurchase - discountedAmount));
        } else {
            System.out.println("No discount appplied pay - " + totalPurchase);
        }
        */
    /*
     double currentTemperature= 31;
     if(currentTemperature <= 18) {
         System.out.println("Turning on a heater ...");
     } else if (currentTemperature <= 30) {
         System.out.println("Temperature is within a normal range");
        } else {
         System.out.println("Turning air conditioner ...");
     }
     */


        String lightColor = "Pink";

        if(lightColor.toUpperCase().equals("GREEN")) {
            System.out.println("Go.");
        } else if (lightColor.toUpperCase().equals("YELLOW")){
            System.out.println("Slow down.");
        } else if(lightColor.toUpperCase().equals("RED")) {
            System.out.println("Stop.");
        }
        else {
            System.out.println("Invalid traffic light signal");
        }



    } // end main
}
