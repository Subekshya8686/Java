// variable and data type

// public class variable{
//     public static void main(String[] args){
//         // variable declaration
//         int month, days;
//         // variable initialization
//         month= 12;
//         days=30;
        
//         //printing output
//         System.out.println("Month "+ month +" has "+ days +" Days");
//     }
// }



public class variable{
    static int r = 12; ///static variable
    // System.out.println(r); // gives error


    void method(){
        int a = 5; // local variable
        System.out.println("The local variable is: "+ a);
    }

    public static void main(String [] args){
        int b = 7; //instance variable
        variable obj = new variable();
        obj.method();
        System.out.println("The static variable is: "+r);
        System.out.println("The instance variable is: "+b);
    }
}

