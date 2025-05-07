import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the value of n for Fibonacci series
        System.out.print("Enter the value of n for Fibonacci series: ");
        int n = scanner.nextInt();

        // Read the range [start, end]
        System.out.print("Enter the range (start end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Create instances of both classes
       
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter(start, end);
 // Create threads for both tasks
	Thread evenThread = new Thread(evenNumberPrinter);
 // Start both threads
	evenThread.start();
 
 FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(n);
       
        Thread fibonacciThread = new Thread(fibonacciGenerator);
        

       
        fibonacciThread.start();
        
    }
}
