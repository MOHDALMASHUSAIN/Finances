package CH5Recursion;

public class Class1_CWQ2print1toN {

/* Approach 2 STACK DROP
    static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
*/

   //  Approach 1 STACK UP
     
    static void print(int n,int state){
        if(state==n){
            return;
        }
        System.out.println(state+1);
        print(n, state+1);

    }
            
     public static void main(String[] args) {
        print(5, 0);
              

    }
}
