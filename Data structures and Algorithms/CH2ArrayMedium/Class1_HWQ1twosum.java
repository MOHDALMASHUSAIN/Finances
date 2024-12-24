 package CH2ArrayMedium;
 import java.util.Scanner;

 public class Class1_HWQ1twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter no of elements of the array");        
        int n = sc.nextInt();
        int arr[] = new int[n];
      System.out.print("the array is:: ");
      for(int k = 0; k<n;k++){
      arr[k] = sc.nextInt();
       }
      // for (int i = 0;i<arr.len)
      System.out.println("give the input element (target)");
      int target = sc.nextInt();
      for (int i =0;i<arr.length-1;i++){
        for (int k =i+1;k<arr.length;k++){
            if(arr[i]+ arr[k]==target){
           System.out.println(arr[i] +arr[k]);
            }
        }
      }
      sc.close();
     
      }
     
    }
 





