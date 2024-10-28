package day6ConditionalStatments;

public class IfConditional {
    public static void main(String[] args) {
        // real-world examples using if function
        //1. checking for file existance
        //2. Sending notificaction if a user is online
        //3. status flag  first false then turned into true
        //4. Applying discount if coupon is valid
        //5. Email validation before submission
        // Analogy of mulesoft validation module
        /*
        boolean isUserOnline = true;
        boolean hasAddiction = false;
        // if a user is online, send notification
        // == , !=, stringName.equals.("testString"),
        // if(isUserOnline == true), if(isUserOnline) if we are checking for a value to be true
        // if(isUserOnline == false), if(!isUserOnline) if we are checking for a value to be false
        if(isUserOnline){
            System.out.println("Sending notifiaction: Your freind is online");
        }
        System.out.println("This part is not under if - this will be executed in either case if -true, false");

        if(!hasAddiction){
            System.out.println("Is able to learn driving licence");
        }
        System.out.println("This part is not under if - this will be executed in either case if -true, false");
        */


        boolean validCoupon = false;
        // Apply discount if coupon is valid 10%
        double totalPrice = 100.00;

        if(validCoupon) {
            totalPrice = totalPrice - 0.1*totalPrice;
            System.out.println("Final Price is " + totalPrice);
        }

        System.out.println("Final Price is " + totalPrice);

        // If the email is not empty, proceed with sending form
        String email = ""; // simulate an email field
        if(!email.isEmpty()){
            System.out.println("Proceed with form submission");
        }
        System.out.println("Program execution continues...");



    }
}
