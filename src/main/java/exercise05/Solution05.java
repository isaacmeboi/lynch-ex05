package exercise05;
import java.util.Scanner;
public class Solution05 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("What is your first number, mortal? ");
            int n1 = sc.nextInt();

            System.out.println("What is your second number, plebeian? ");
            int n2 = sc.nextInt();

            System.out.println("Here are you pathetic solutions.");

            System.out.println(n1 + " + " + n2 + " = " + (n1+n2));

            System.out.println(n1 + " - " + n2 + " = " + (n1-n2));

            System.out.println(n1 + " * " + n2 + " = " + (n1*n2));

            System.out.println(n1 + " / " + n2 + " = " + (n1/n2));

        }
    }
    /*the textbook also helped with formatting this solution. first, we import
    the java.util library to use the scanner function. after that a main function
    is created and an instance and declaration of the scanner function is made.
    then, the first prompt is printed and then the next input is read by the
    computer. a second prompt is given with another scanner function to read
    the number input by the user. finally, all the solutions are printed in
    a list using the println function and built in means to do mathematics.*/
