package day8ConditionalStatmentsCntd.part3;

public class NestedIfElse {
    public static void main(String[] args) {
        // conditons are interdependent - that means to check fot the second condition the first condition must be meet
        //1 . ATM Transaction - withdrawal is possible if youre in daily limit, then check available balance (100k), withdrawAmount 1K
        // Ass: dailyLimit , accountBalance, withdrawAmount
        //2. Credit card approval based on income and credit score

        //3. Ticket pricing based on Age and day of a week
        // Ass: age, day (a>=12, tp =5; age >=60, tp =6; othersiwe, tp=10) and if (weekday(Sun & San), tp +=2)

        //4. Employee bonus based on performance and year of service
        /*
        double income = 6000;
        int creditScore = 800;
        boolean isApproved = false;

        if(income >= 5000) {
            if(creditScore >= 700){
                isApproved = true;
            } else {
                System.out.println("low credit score");
            }
        } else {
            System.out.println("income is too low");
        }

        if(isApproved){
            System.out.println("Credit card application approved successfully");
        } else {
            System.out.println("Credit card application denied.");
        }

         */
        /*
        double performanceRating = 5;
        int yearsOfService = 5;

        double bonus = 0.0;

        if(performanceRating >= 4){
            if(yearsOfService >= 5){
                bonus = 5000;
            } else {
                bonus = 4000;
            }
        } else if (performanceRating >= 3){
            if(yearsOfService >= 5){
                bonus = 3000;
            }
        } else {
            System.out.println("No bonus due to low performance");
        }

        if(bonus > 0){
            System.out.println("You recieved a bonus of $" + bonus);
        }

         */

        // ATM Transaction
        int dailyLimit = 1000;
        int availableBalance = 100000;
        int withdrawAmount = 1000;

        if (withdrawAmount <= dailyLimit) {
              if (withdrawAmount <= availableBalance) {

                  System.out.println("Here is you cash: " + withdrawAmount);
            } else {
                 System.out.println("Sorry! Insufficient balance.");
            }
        } else {

            System.out.println("Sorry! You exceed daily withdrawal limit.");
        }



      /*
        //Ticket pricing based on Age and day of a week
        // Ass: age, day (a<=12, tp =5; age >=60, tp =6; othersiwe, tp=10) and if (weekday(Sun & San), tp +=2)
        int age = 30;
        String day = "Sunday";
        int ticketPrice;

        if (age <= 12) {
            ticketPrice = 5;
        }
            else if (age >= 60) {
                ticketPrice = 6;
            } else {
                ticketPrice = 10;
            }
         if (day.equals("Sunday") || day.equals("Saturday")) {
            ticketPrice += 2;
        }

        System.out.println("Ticket Price: $" + ticketPrice);
    }

       */

    }

    // end main
}



