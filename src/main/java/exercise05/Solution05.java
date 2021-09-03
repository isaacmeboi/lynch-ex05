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
