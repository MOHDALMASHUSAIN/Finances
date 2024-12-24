

public class MaxandMin {
    public static void main(String[] args) {
        
        int arr[]  = new int[]{12,34,54,2};
        int max = arr[0];
       int min = arr[0];
        for (int i : arr) {
            if(i>max){
             max = i;
            }

             if(i<min){
                min = i;
             }
                 
        }
         System.out.println(max);
         System.out.print(min);

    }
}
