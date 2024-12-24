package CH2ArrayMedium;
///Q- is this how we write boolean;
import java.util.Scanner;

public class Class3_HWQ5isSymmetric {
  static boolean check (int arr[][]){
     
     
          for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]!=arr[j][i]){
                 return false;
                }
            }

          }
          return true;

  }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row = sc.nextInt();
         System.out.println("enter the no of col");
        int col =sc.nextInt();
        if(row!=col){
          System.out.println("not symetric");
        }
        else{
          int arr[][] = new int[row][col];
          for(int i=0;i<row;i++ ){
            for(int j=0;j<col;j++){
                arr[i][j] =sc.nextInt();
            }
          }
          if(check(arr)==true){
             System.out.println("true ");
          }
          else{
            System.out.println("false");
          }}
         
 sc.close();
    }
}
