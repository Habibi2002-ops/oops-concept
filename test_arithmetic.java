import Arithmetic.Calculator;

public class test_arithmetic {
    public static void main(String[] args) {
        Calculator A = new Calculator();

        System.out.println("**OPERATIONS**");
        System.out.println("\n____ADDITION____");
        A.addition();

        System.out.println("\n____SUBTRACTION____");
        A.subtraction();

        System.out.println("\n____MULTIPLICATION____");
        A.multiplication();

        System.out.println("\n____DIVISION____");
        A.division();
    }
}