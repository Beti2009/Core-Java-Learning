package day9ConditionalStatmentsCntd;
import java.util.Scanner;
//
public class CalculateCarRental {

    public static void userOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dear customer which car type do you want for rent ?");
        String carType = scanner.nextLine();
        System.out.println(calculateRentalCost(carType));
    }

    public static String calculateRentalCost(String carType ){
        int rentalCost;
        switch(carType){
            case "SVU":
                rentalCost = 50;
                break;
            case "BMW":
                rentalCost = 75;
                break;
            case "TRUCK":
                rentalCost = 90;
                break;
            default:
                rentalCost = 60;
                break;
        }
        return "For " + carType + " rental cost is " + rentalCost + ".";
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Danny Car Rental service ");
        userOption();
        System.out.println("Program is exiting..., thank you for using our service");
//        System.out.println("The rental cost for BMW is = " +  calculateRentalCost("BMW"));
//        System.out.println("The rental cost for TRUCK is = " +  calculateRentalCost("TRUCK"));
//        System.out.println("The rental cost for OTHERS is = " +  calculateRentalCost("Bugati"));
    }

}

