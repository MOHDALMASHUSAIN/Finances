package CH4StringsBasics;

import java.util.Scanner;

public class Class2_HWnonrepeatingalphabet {
    static char firstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return str.charAt(i);
            }
        }
        return '\0'; // Return null character if there is no non-repeating character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        char result = firstNonRepeating(str);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}
