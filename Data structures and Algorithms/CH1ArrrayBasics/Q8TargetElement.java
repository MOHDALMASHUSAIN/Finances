

import java.util.Scanner;

public class Q8TargetElement {
    static int findTarget(int arr[] ,int target){
        for (int i = 0;i<arr.length;i++){
            if(target==arr[i]  ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,43,5,5,65,23,33,87,98};
        /* 
        
        int arr[] = {12,43,5,33,1,6,5,67,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("give the target element");
        int n = sc.nextInt();
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == n){
                System.out.println(i);
            }
            
            }
           
            System.out.println("element not found ");
            */
Scanner sc = new Scanner(System.in);
System.out.println(" the target element IS ");
int target = sc.nextInt();
    if(findTarget( arr,target)==-1){
        System.out.println("element not found");
    }
    
 else{
    System.out.println(" the element found at index :" +findTarget(arr, target) );
 }



        }
    }

