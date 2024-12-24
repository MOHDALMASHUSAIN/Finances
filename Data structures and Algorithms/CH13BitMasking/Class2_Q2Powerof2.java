package CH13BitMasking;

public class Class2_Q2Powerof2 {
    static boolean isPowerOfTwo(int x)
    {
        /* First x in the below expression is
          for the case when x is 0 */
        return x != 0 && ((x & (x - 1)) == 0);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(31) ? "Yes" : "No");
        System.out.println(isPowerOfTwo(64) ? "Yes" : "No");
    }
}
