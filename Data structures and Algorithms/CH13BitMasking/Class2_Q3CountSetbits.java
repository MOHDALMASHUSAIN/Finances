package CH13BitMasking;

import java.util.Scanner;

public class Class2_Q3CountSetbits {
    static int countSetbits(int n){
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Count of set bits: " + countSetbits(n));
    }
}
