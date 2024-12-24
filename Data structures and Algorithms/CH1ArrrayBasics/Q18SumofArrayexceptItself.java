

public class Q18SumofArrayexceptItself {
    public static void main(String[] args) {
        int arr[] = {12,4,3,7,8,5,44,89};
        
        for (int i = 0; i<arr.length;i++){
            int sum = 0;
            for (int j=0; j<arr.length;j++){
          if (i!=j)
      {
        sum = sum +arr[j];
        }
         
        
            }
System.out.println("the sum of array ther than number " + arr[i]+" : "  + sum);
        
           
        }
    }
}
