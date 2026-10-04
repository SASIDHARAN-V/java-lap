package labpg3;

import java.util.Scanner;

public class fibonacci {
    static int calls = 0;
    static int fib(int n) {
        calls++;
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            System.out.print("Fibonacci sequence: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fib(i) + (i == n - 1 ? "" : " "));
            }
            System.out.println(); 
            calls = 0;
            int value = fib(n);
            System.out.println("Fibonacci value = " + value);
            System.out.println("Function calls = " + calls);
        }System.out.println("----------");
        System.out.println("V.SASIDHARAN");
        System.out.println("2117250020390");
        System.out.println("CSE G");
        sc.close();
    }
}