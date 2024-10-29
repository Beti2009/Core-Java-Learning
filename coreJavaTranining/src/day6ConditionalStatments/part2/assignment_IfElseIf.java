package day6ConditionalStatments.part2;
public class assignment_IfElseIf {
    public static void main(String[] args) {
        int score = 85; // Change this value to test different scores

        if (score >= 90) {
            System.out.println("The student's grade is 'A'");
        } else if (score >= 80) {
            System.out.println("The student's grade is 'B'");
        } else if (score >= 70) {
            System.out.println("The student's grade is 'C'");
        } else if (score >= 60) {
            System.out.println("The student's grade is 'D'");
        } else {
            System.out.println("The student's grade is 'F'");
        }
    }
}
