import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and column");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[] []= new int[row][col];
        System.out.println("enter the elements");
        for(int i = 0; i<row;i++){
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
         
        }
       System.out.println("print the elements");
       for (int i = 0; i < row; i++) {
        for (int j = 0; j <col; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
       }

    }
}
