package CH3OOPs.FUNCTION;

import java.util.Scanner;

 class Class1_Switch {
    static void add(int a , int b){
        System.out.println(a+b);
    }
    static void sub(int a , int b){
        System.out.println(a-b);
    }
    static void mul(int a , int b){
        System.out.println(a*b);
    }
    static void rem(int a , int b){
        System.out.println(a%b);
    }
    
    public static void main(String[] args) {
        System.out.print("put the values of a & b");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("put the value of choice");
System.out.print("1 : add " + "2: substract " + " 3: multiply" + "4: remainder");
        
        
        int choice  = sc.nextInt();
        switch(choice){
            case 1:
            add(num1, num2); 
            break;
             case 2:
            sub(num1, num2); 
            break;
             case 3:
            mul(num1, num2); 
            break;
            case 4:
            rem(num1, num2);
            break;
            default : 
            System.out.println("invalid input ");
        
        }
    }   
}
