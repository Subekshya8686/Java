
// import java.util.Scanner;

// Syntax;
// -While
// While(condn)
// {//statement;
//  i++; //update
// }

// do {
//     //Statement;
//     i++;
// } while(condn);

// #for(initialization, condn, update)
// {//statement;
// }

/////////////////////////////////////////////////////////////////////

// write a program to print natural numbers from 100 to 150

// public class loop {
//     public static void main (String[] args) {
//         int i = 100; //initialization
//         while(i <= 150) {
//             System.out.println(i);
//             i++;
//         }
//         System.out.println("Loop complete");
//     }
// }




// public class loop {
//     public static void main (String[] args){
//         int number;
//         int maxValue;

//         System.out.print("I will display a table of " + "number and their sum. ");

        //   Scanner sc = new Scanner (System.in);

//         System.out.println("How high should I go? ");
//         maxValue = sc.nextInt();
        
//         System.out.println("Number    Number Squared");
//         System.out.println("-------------------------");
        
//         // int value = sc.nextInt();
//         for (number = 1; number <= maxValue; number++) {
//             System.out.println(number+ "\t\t" + number*number);

//         sc.close();
//         }
//     }
// }



/////////////////////////////////////////////////////////////////////////

// nested loop

// public class loop {
//     public static void main (String[] args) {
//         // for outer loop iterates over rows
//         for(int i = 1; i <=5 ; i++){
//             // for inner loop iterates over columns
//             for(int j = 1; j<= i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

////////////////////////////////////////////////////////////////////////////////////////////////

// write a program that asks your name and prints "Hello your name " five times . use a loop


// public class loop {
//     public static void main (String[] args) {

//         String name;

//         Scanner key = new Scanner(System.in);

//         System.out.println("Enter your name: ");
//         name = key.nextLine();

//         for(int i= 1; i<=5; i++){
//             System.out.print("Hello" + name);
//         }
//         key.close();

//     }
// }