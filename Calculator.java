package Arithmetic;
import java.util.Scanner;

interface Operations {
    void addition();
    void subtraction();
    void multiplication();
    void division();
}

public class Calculator implements Operations {
    Scanner s = new Scanner(System.in);

    public void addition() {
        System.out.println("Enter the first number :");
        int num1 = s.nextInt();
        System.out.println("Enter the second number :");
        int num2 = s.nextInt();
        System.out.println("Sum of given numbers is :"+(num1+num2));
    }
    public void subtraction() {
        System.out.println("Enter the first number :");
        int num3 = s.nextInt();
        System.out.println("Enter the second number :");
        int num4 = s.nextInt();
        System.out.println("Difference of given numbers is :"+(num3-num4));
    }
    public void multiplication() {
        System.out.println("Enter the first number :");
        int num5 = s.nextInt();
        System.out.println("Enter the second number :");
        int num6 = s.nextInt();
        System.out.println("Product of given numbers is :"+(num5*num6));
    }
    public void division() {
        System.out.println("Enter the first number :");
        int num7 = s.nextInt();
        System.out.println("Enter the second number :");
        int num8 = s.nextInt();
        System.out.println("Result of dividing given numbers is :"+(num7/num8));
    }
}
