

import java.util.Scanner;

public class Q16PAIRwithgivenSUM {
    public static void main(String[] args) {
        
    
    int arr[]  = {12,34,54,2,34,2,5,67};
    Scanner scan = new Scanner(System.in);
    System.out.println("give the sum");
    int sum = scan.nextInt();
    for (int i=0;i<arr.length;i++){
   for (int j =0; j<arr.length;j++){
     if( j>i && sum == arr[i] +arr[j]){
       System.out.println("the sum pair is" + arr[i] +" " + arr[j]);
     }
   }
    }
   scan.close();
}
}
