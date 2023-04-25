import java.util.Scanner;

// public static   void       printMyName      (String args)
//              /return type   /function type    /parameter
// void sum (int a, int b)  // parameter
// sum (1,2)    // arguments

public class Function {
    public static void main(String[] args ) {
        Scanner sc =new Scanner(System.in);
        generateRandomNumbers(sc);
        sc.close();

    }

    public static void generateRandomNumbers(Scanner sc) {
        System.out.println("How many random numbers do you want to get? ");
        int count = sc.nextInt();
        System.out.println("Here are " + count+ " random numbers");
        for (int i =0; i< count; i++) {
            int num = (int) (Math.random()* 100); 
            System.out.print(num + " "); 
        }
    }

    // public static void printWelcomeMessage () {
    //     System.out.println("null");
    // }
public static void AddNumbers(int a, int b) {
    a = 5; 
    b = 6; 
    int sum = a+b;
    System.out.println("The sum is "+ sum);
}
    public static void main(String args) {
        
        
        
    }
}
