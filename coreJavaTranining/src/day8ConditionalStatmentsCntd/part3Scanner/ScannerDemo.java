package day8ConditionalStatmentsCntd.part3Scanner;
//1 console app -
//3 desktop app -
//4 mobile app -
//2 web app -
// embeded system app -

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // Declare the scanner object variable - initialize with predifined standard input object
        Scanner scanner = new Scanner(System.in);

        // Prompt a employee to provide personal details and print the detail to standard console
        // String input
        System.out.println("What is your fullname ");
        String fullName = scanner.nextLine();
        //Character Input
        System.out.println("What is your gender (M for Male , F for Female) ");
        char gender = scanner.next().charAt(0);
        // Numerical Input
        System.out.println("Please provide your age ");
        int age = scanner.nextInt();
        // What is salary
        System.out.println("What is your salary ");
        double salary = scanner.nextDouble();
        System.out.print("What is your mobile number ");
        long mobileNumber = scanner.nextLong();

        // prepare a response
        System.out.println("Here is employee personal details");
        System.out.println("Full Name = " + fullName );
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
        System.out.println("Mobile Number = " + mobileNumber);
    }
}
