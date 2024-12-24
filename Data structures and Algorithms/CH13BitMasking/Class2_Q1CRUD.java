package CH13BitMasking;

import java.util.Scanner;

public class Class2_Q1CRUD {
    static int get_bit(int n,int i){
       return ((n>>i-1)&1); 

    }
    static int set_bit(int n ,int i){
        return ((1<<i-1)|n);
    }
    static int clear_bit(int n,int i){
        return  (n &  ~(1 << i));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        System.out.println("put the value of i");
        int i = sc.nextInt();
       
        System.out.println("get the ith bit:" + get_bit(n, i));
        System.out.println("set the ith bit:" +set_bit(n, i));
        System.out.println("clear the ith bit:" + clear_bit(n, i));
        sc.close();

    }
}
