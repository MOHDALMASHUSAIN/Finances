package CH2ArrayMedium;

import java.util.Scanner;

public class Class3_HWQ6transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int arr1[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[j][i] = arr[i][j]; // Swap indices for transposing
            }
        }

        System.out.println("Transpose of the matrix is:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
