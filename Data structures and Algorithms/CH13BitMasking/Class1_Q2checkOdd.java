package CH13BitMasking;

public class Class1_Q2checkOdd {
    public static void main(String[] args) {
        int x =2 ,y=4;
        System.out.println("check if OR is odd" );
        int z=x|y;
        if ( (z& 1) ==1) {
            System.out.println("Odd number");
        }
        else{
            System.out.println("even num");
        }
    }
}
