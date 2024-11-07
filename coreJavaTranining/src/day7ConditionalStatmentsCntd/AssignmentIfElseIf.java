package day7ConditionalStatmentsCntd;

public class AssignmentIfElseIf {
    public static void main(String[] args) {

       // Grading system
        int score = 75;
        char grade = 'F';

        if (score >= 90) {
            grade = 'A';
                    }
        else if (score >= 80) {
            grade = 'B';
                  }
        else if (score >= 70) {
            grade = 'C';
                  }
        else if (score >= 60) {
            grade = 'D';
                }
        System.out.println("Your score is " + score + " Your grade is " + grade);

/*

        // the largest number
        int a = 1000;
        int b = 200;
        int c = 300;
        if (a >= b && a >= c) {
            System.out.println( a  + " is the largest number");
        } else if (b >=a && b >= c) {
            System.out.println( b + "is the largest number");
        } else {
            System.out.println(c + "is the largest number");
        }

 */


    }
}



