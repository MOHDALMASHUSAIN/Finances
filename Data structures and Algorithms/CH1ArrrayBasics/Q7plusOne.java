

import java.util.Arrays;
import java.util.Scanner;

public class Q7plusOne {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("no of elements of the array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the elements");
    for (int i = 0; i<n;i++){
        arr[i] = sc.nextInt();
    }
    for (int j:arr){
        j+=1;
        System.out.print(j+" ");
    }

    }
}