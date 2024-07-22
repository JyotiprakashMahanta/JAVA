
// Java Program to multiply Two Numbers
import java.util.Scanner;
 
class Ascii{//Creating the class for the program in public type
    //Body of Main function of the program
    public  static void main(String[] args) {
        //Declaring the required variable for the program.
        char c;
        //Integer type variable to hold number value.
        // Creates a reader instance which takes
        // input from standard input - keyboard
        //Taking the input from the user
        System.out.print("Enter A character : ");
        
        //Scanner is imported from the import package
        Scanner sc = new Scanner(System.in);
   
        // Character input
         c = sc.next().charAt(0);
        int asciival = c; 
        
        // println() prints the following line to the output screen
        //Using the System.out.println();
        //Printing the ascii value of the charcter
        System.out.println("The ASCII value of " + c + " is: " + asciival);
    }
}