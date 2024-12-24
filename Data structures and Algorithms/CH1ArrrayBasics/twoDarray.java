/* 
package Arrray;


import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        System.out.println("no of elements of rows and column");
        Scanner sc = new Scanner(System.in);
        int ruw = sc.nextInt();
        int col= sc.nextInt();
        int arr[][] = new int [ruw][col];
        for (int i = 0; i<ruw;i++){
            for (int j = 0; j<col;j++){
               arr[i][j] = sc.nextInt();
            }
        }
        for(int row[]: arr){
            for(int mo: row){
                System.out.print(mo +" ");
            }
        }
        System.out.println();
    }
}
*/


import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        System.out.println("Number of rows and columns:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Add this line to move to the next line after printing each row.
        }
    }
}
 
