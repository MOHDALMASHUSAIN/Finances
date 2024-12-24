package CH5Recursion;

import java.util.Scanner;

public class Class2_CWQ1adddigits {

    // Function to print digits recursively
    static void digit(int n) {
        if (n / 10 == 0) {
            System.out.print(n % 10 + " ");
            return;
        }
        digit(n / 10);
        System.out.print(n % 10 + " ");
    }

    // Function to sum digits recursively
    static int sumDigits(int n) {
        if (n / 10 == 0) {
            return n % 10;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Digits: ");
        digit(number);

        int sum = sumDigits(number);
        System.out.println("\nSum of digits: " + sum);
        sc.close();
    }
}
