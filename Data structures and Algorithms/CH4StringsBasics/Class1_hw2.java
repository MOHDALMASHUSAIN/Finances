//QUES-User Input-"______".find the length of string without using .length()
package CH4StringsBasics;

import java.util.Scanner;

public class Class1_hw2 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int count = 0;
        
        // Iterate through each character in the string until we reach the end
        while (!str.isEmpty()) {
            // Remove the first character of the string
            str = str.substring(1);
            count++;
        }
        
        System.out.println("Length of the string is: " + count);
    }   
}
