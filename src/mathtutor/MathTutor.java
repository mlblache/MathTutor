/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathtutor;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author S-Mercedes.Blache
 */
public class MathTutor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Write a program that can be used as a math tutor for a young student.
The program displays a menu allowing the user to select an addition or subtraction
problem. The final selection of the menu should let the user quit the program.
Math Tutor
1. Addition problem
2. Subtraction problem
3. Quit
Enter your choice (1 – 4):
After the user made a choice, the program should display two random numbers in the
range [0 – 999] to be added / subtracted, such as:
 247
+ 29 <- - Output problem in this format.
-------
The program should wait for the student to enter the answer. If the answer is correct, the
message of congratulations should be printed. If the answer is incorrect, a message
should be printed showing the correct answer.
Then the program should display a menu again. This process is repeated until the user
chooses to quit the program.
Requirements:
1. Input validation: if the user selects an item not on the menu, display an error
message and display the menu again.
2. Make sure the numbers are appearing in correct order: the top position is always
occupied by the number with higher number of digits.
Sample of INCORRECT formatting:
        3. Make sure the numbers are aligned properly when printed out as
addition/subtraction problem. Use Java numeric formatting to print out numbers
correctly aligned. The one-digit and two- digit numbers must be aligned well
with the 3-digit numbers For example:
 247
 + 8
 -------
*/
       Scanner keyboard = new Scanner(System.in);
       Random rand = new Random();
       
       
       String str;   
       int choice = 0;        
      
       boolean again = true;
       while(again) // input validation loop
       {
        System.out.print("MathTutor: \n 1. Addition problem\n "
                + "2. Subtraction problem\n "
                + "3. Quit \n"
                + "Enter your choice 1-3: ");
        str = keyboard.nextLine(); // get a string containing an int number
        str = str.trim(); // remove any extra whitespace from string sides
        try    // trying to convert string to integer, expecting exceptions
        {
          choice  = Integer.parseInt(str);  // convertion. 
          
          again =  false; 
        }
        catch (Exception e) // handle the exception below
        {
          System.out.println("INPUT ERROR: Please enter an integer number!!"); 
          System.out.println(e.getMessage());
        }
       } // end of validation loop
          
       
       switch(choice){
       case 1:
                 
       System.out.print("Please solve problem:\n");
       int a = rand.nextInt(999)+1;
       int b = rand.nextInt(999)+1;
       int c;
       if(a>b){
           c = a+b;
       System.out.printf("%4d\n+%3d", a, b);
       System.out.print("\n----\n");
       int answer = keyboard.nextInt();
       if(answer == (a+b)){
           System.out.print("Correct!");
           break;
       }else
            System.out.print("Sorry wrong answer, Answer = " +c+"" );
            break;
       }else 
           c = b+a;
           System.out.printf("%4d\n+%3d", b, a);
           System.out.print("\n----\n");
       int answer = keyboard.nextInt();
       if(answer == (b+a)){
           System.out.print("Correct!");
           break;
       }else
           System.out.print("Sorry wrong answer..." +c+ "");
       break;
       
       case 2:
       
       System.out.print("Please solve problem:\n");
        a = rand.nextInt(999)+1;
        b = rand.nextInt(999)+1;
        if(a>b){
            c = a-b;
       System.out.printf("%4d\n-%3d", a, b);
       System.out.print("\n----\n");
       answer = keyboard.nextInt();
       if(answer == (a-b)){
           System.out.print("Correct!");
           break;
       }else
            System.out.print("Sorry wrong answer..." +c+ "");
            break;
       }else 
           c = b-a;
           System.out.printf("%4d\n-%3d", b, a);
           System.out.print("\n----\n");
       answer = keyboard.nextInt();
       if(answer == (b-a)){
           System.out.print("Correct!");
           break;
       }else
           System.out.print("Sorry wrong answer..." +c+ "");
       break;
       
       case 3:
           System.out.print("You Quit, Goodbye!...");
       break;
       
       default: 
           System.out.print("Sorry, no choice was picked...");
    }
       
       
    }
}
