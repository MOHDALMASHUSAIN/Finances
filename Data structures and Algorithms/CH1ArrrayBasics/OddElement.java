

import java.util.Scanner;

public class OddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of elements of an array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            
        
        if(j%2 !=0){
            System.out.print(j);
        }}
    }
}
