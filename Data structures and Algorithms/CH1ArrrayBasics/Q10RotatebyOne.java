

public class Q10RotatebyOne {
    public static void main(String[] args) {
        int arr[] = {43,5,435,1,2,3};
        int temp = arr[arr.length-1];
       
        for (int i =arr.length-1;i>0;i--){
            arr[i] =arr[i-1];
        }
         arr[0] = temp;
        
    
      for (int i : arr) {
       System.out.print(i +" ");
     }

    }
}
