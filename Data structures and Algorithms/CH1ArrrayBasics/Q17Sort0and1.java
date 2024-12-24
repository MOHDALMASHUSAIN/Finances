

public class Q17Sort0and1 {
    public static void main(String[] args) {
        int arr [] = {1,0,0,1,0,1,0,0};
        int countofZERO = 0;
         for(int i : arr){
            if (i==0){
                countofZERO ++;
            }
         }
         int n =countofZERO;
         for (int i = 0; i<n;i++){
            arr[i] =0;
         }
         for(int j=n;j<arr.length;j++){
            arr[j] = 1;
         }
         for (int i:arr){
          System.out.print(i + " ");
         }
        
    }
}
