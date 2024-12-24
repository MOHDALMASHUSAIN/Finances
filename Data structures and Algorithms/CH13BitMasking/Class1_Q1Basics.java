package CH13BitMasking;

public class Class1_Q1Basics {
    public static void main(String[] args) {
        int x= 3,y=6;
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(~x);// this is called complimentm (~n=(-1*(n+1)))
        System.out.println(x^y);
        int z =20;
        System.out.println(z << 1);
        System.out.println(z << 2);
        System.out.println(z << 3);
        System.out.println(z << 4);
        System.out.println("----------------------------");
        System.out.println(z >> 1);
        System.out.println(z >> 2);
        System.out.println(z >> 3);
        System.out.println(z >> 4);
        System.out.println(z >> 5);

    }
    
}
