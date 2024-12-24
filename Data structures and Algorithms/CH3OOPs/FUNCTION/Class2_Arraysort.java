package CH3OOPs.FUNCTION;

import java.util.Arrays;

public class Class2_Arraysort {
    static void muin(int arr[]){
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {12,4,54,6};
        muin(arr);

    }  
}
