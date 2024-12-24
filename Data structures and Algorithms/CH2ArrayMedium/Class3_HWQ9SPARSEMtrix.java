package CH2ArrayMedium;

import java.util.Scanner;

public class Class3_HWQ9SPARSEMtrix {
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
        int zero = 0;
        int nonzero =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
 //  arr1[j][i] = arr[i][j]; // Swap indices for transposing
           if(arr[i][j]==0){
            zero++;
           }
           if(arr[i][j]!=0){
            nonzero++;
           }
            }
        }
        if(zero>nonzero){
            System.out.println("sparse matrix");
        }
  sc.close();


    }
}
