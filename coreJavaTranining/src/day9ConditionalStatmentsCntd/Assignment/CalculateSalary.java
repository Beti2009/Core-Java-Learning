package day9ConditionalStatmentsCntd.Assignment;
import java.util.Scanner;

public class CalculateSalary {

    public static double calculateSalary(String role) {
        double salary;

        switch (role) {
            case "manager":
                salary = 70000;
                break;
            case "developer":
                salary = 80000;
                break;
            case "tester":
                salary = 50000;
                break;
            case "hr":
                salary = 45000;
                break;
            default:
                salary = 40000;
                break;
        }
        return salary;
    }
    public static void getUserRoleAndShowSalary() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your role: ");
        String userRole = scanner.nextLine();

        double salary = calculateSalary(userRole);
        System.out.println("The Salary for " + userRole + " = $"+salary);

          }

    public static void main(String[] args) {
        System.out.println("Welcome to Big Ass Fans Employee Payroll System! ");
        System.out.println("Salary for manager: $" + calculateSalary("manager"));
        System.out.println("Salary for developer: $" + calculateSalary("developer"));
        System.out.println("Salary for tester: $" + calculateSalary("tester"));
        System.out.println("Salary for hr: $" + calculateSalary("hr"));
        System.out.println("Salary for others: $" + calculateSalary("others"));


            getUserRoleAndShowSalary();
        }

    }


