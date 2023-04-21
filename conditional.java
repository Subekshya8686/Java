import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);

        // System.out.print("Enter the salary: ");
        // double salary = key.nextDouble();

        // if (salary > 50000) {
        //     System.out.println("You have high salary " + salary);
        // } else {
        //     System.out.println("You have low salary " + salary);
        // }

//////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Enter a number: ");
        int number = key.nextInt();

        if (number > 0) {
            System.out.println("It is positive");
        } else if (number < 0) {
            System.out.println("It is negative");
        } else {
            System.out.println("It is zero");
        }
        key.close();
    }
}