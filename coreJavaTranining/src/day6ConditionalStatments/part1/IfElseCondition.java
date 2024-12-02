package day6ConditionalStatments.part1;

public class IfElseCondition {
    // Here are some real-world examples where an if else condition is used in Java:
    // There is a single condition to be checked but either of job to be done
    // 1. User Login Authentication - A typical use case in applications where the user is trying to log in,
    // and the system checks if the credentials are correct.
    // 2. Bank ATM Transaction - When a user tries to withdraw money from an ATM, the system checks
    // if the balance is sufficient.
    // 3. Age Verification for Voting - A program that checks if a user is eligible to vote based on their age.
    // 4. Hotel Room Reservation - A program that checks room availability and books a room accordingly.
    // 5. Checking if a number is even or odd
    // 6. Largest of the two number
    public static void main(String[] args) {


        String username = "test";
        String password = "test123";

        String correctUsername = "test";
        String correctPassword = "test123";

        if(username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful");

        } else {
            System.out.println("Invalid credentialds, please try again.");
        }
    }
}
