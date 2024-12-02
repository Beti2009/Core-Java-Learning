package day9ConditionalStatmentsCntd;
import java.text.BreakIterator;
import java.util.Scanner;
//1 Bank ATM : Transaction Menu
// 1 you can switch case to handle d/t transaction options
// 1. Check Balance 2. Withdraw money 3. Deposit Money and 4.Exist

//2. Online shopping : Discount calculation based on the coupon code
// use switch case to apply different discount based on the code the use enter
// "SUMMER10" GETS 10%, "FALL15" -> 15%, "WINTER20" -> 20%
//Implement a logic that determine discounted oamount based on the coupon code, and wether the coupon applied or
// not for a total price

// 3 Car rental system : calculate  rental charges based on car type
// a switch case can calculate the rental price based on the car type selected by user
// "SUV" -> 50, "BMW" -> 75, "Truck" -> 90, otherwise 60

// 4. Employee Payroll system
// use switch case statement in calculateSalary method (input = String role , output = double salary)
// call calculateSalary method and provide test data from main method and dont forget to keep/store/print the returned value
// within the calculateSalary use switch to determine d/t values of salary
// Logic : monager -> 70,000; developer -> 80,000, tester -> 50,000, hr -> 45,000 and anyother role is 40,000.
// Posible : Add a method to ask a user for their role the prove a salary info that matches their role

public class SwitchcaseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATM Menu - Please provide your option");
        System.out.println("1 Check Balance");
        System.out.println("2 Withdraw Money");
        System.out.println("3 Depot Money");
        System.out.println("4 Exit");

        // initals
        double balance = 10_000.00;
        // prompt user option
        System.out.print("\nYour option here ");
        int option = scanner.nextInt();
        // implement a logic based on options

        switch (option) {
            case 1:
                System.out.println("Your available balance is $ " + balance);
                break;
            case 2:
                System.out.println("Enter amount to withdraw");
                double amount = scanner.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    // user has take the money then balance has to update
                    System.out.println("Collect you cash. Updated balance is $: " + balance);

                } else {
                    System.out.println("Insuficient Balance");
                }
                break;
            case 3:
                System.out.println("How many cash dou you want to deposit");
                double deposit = scanner.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Deposit of " + deposit + " is made to you account, your new balance is $" + balance);
                } else {
                    System.out.println("Deposit must be valid or greaterthan 0 dollar");
                }
                break;
            case 4:
                System.out.println("Exiting ... thank you !");
                break;
            default:
                System.out.println("Invalid option. please try again !");
                break;

        } // end switch
    }
    }
