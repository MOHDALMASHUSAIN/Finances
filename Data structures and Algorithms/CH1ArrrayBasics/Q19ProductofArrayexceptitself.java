

public class Q19ProductofArrayexceptitself {
    public static void main(String[] args) {
        int arr[] = {1,4,6,7,3};
            for (int i = 0; i<arr.length; i++){
             int count = 1;
             for(int j=0;j<arr.length;j++){
                if(i!=j){
                    count = count*arr[j];
                }
             }
             System.out.print(count + " ");
            }
        
    }
}
