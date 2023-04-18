import java.util.Scanner;

public class typecasting {
    // type cast the input double to integer
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Enter the length of square: ");
        double length = key.nextDouble();
        double area = Math.pow(length, 2);
        System.out.println("Area of Square: " + (int)area);

        key.close();
    }
}