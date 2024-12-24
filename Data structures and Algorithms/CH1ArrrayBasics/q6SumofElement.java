

import java.util.Scanner;

public class q6SumofElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of elements of the array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println(" elements of the array are-");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int sle :arr){
            sum = sum+sle;
        }
        System.out.println(sum);

    }
}
