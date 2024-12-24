package CH2ArrayMedium;

import java.util.Scanner;

public class Class3_HWQ4SingleDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row = sc.nextInt();
         System.out.println("enter the no of col");
        int col = sc.nextInt();
        int arr[][]= new int[row][col];
        System.out.println("enter the elements");
        for(int i =0;i<row;i++){
            for (int j =0;j<col;j++){
                arr[i][j] =sc.nextInt();
            }
        }
        int sum =0;
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    sum+=arr[i][j];               
                }
            }
        }
        System.out.println("sum of single diagonal::" + sum);

  



         sc.close();
    }
    
}
