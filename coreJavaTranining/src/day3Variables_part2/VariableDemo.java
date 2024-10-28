package day3Variables_part2;

public class VariableDemo {
    public static void main(String[] args) {
        // for every variable with d/t data types
        int age = 33;
        double price = 9.99;
        String fullName = "John Doe";

        float discountAmount;
        boolean status;

        // students id
        /*
        int id1 = 100;
        int id2 = 200;
        int id3 = 300;
        */
        /*
        int id1,id2,id3;
        id1 = 100;
        id2 = 200;
        id3 = 300;
         */
        // students id
        int id1 = 100,id2 = 200,id3 = 300;

        //int sumOfIDs = id1 + id2 + id3;
        System.out.println("id1 + id2 + id3 = " + (id1 + id2 + id3));
        // if all varibale have the same data type and the same value
        int x,y,z;
        x=y=z=100;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        // primitive data types
        // Integer - byte -> short -> int -> long(L/l)
        // Decimal - float(F/f) -> double
        // boolean - true / false
        // char - @, A, * - 0, 9, 1
    }
}
