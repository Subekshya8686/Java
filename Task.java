// make function to check if a number is prime or not
import java.util.Scanner; 

public class Task {
    public static void main(String[] args) {
        areaofRectangle();
        addNum();
    }
    
    public static void addNum() {
        int a = 5;
        int b = 6; 
        int sum = a+b;
        System.out.println("The sum is: "+ sum);
    }    

    public static void areaofRectangle() {
        int length = 6;
        int breadth = 7;
        int area = length*breadth;
        System.out.println("The area is: "+ area);
    }

    public static void primeNum() {
        int num;
        Scanner key = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = key.nextInt();

        if (num == 0){
            System.out.print("It is not prime number.");
        }    
           
        else if (num%2==0){
            System.out.print("It is not prime number.");
        }

        else {
            System.out.print("It is prime number.");
        }
        key.close();
    }

}


