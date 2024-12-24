

public class Q9FREquency {
    public static void main(String[] args) {
        int arr[] = {12,3,12,3,4,6,6,5,6};
        for (int i =0; i<arr.length; i++){
           int  count = 1;
           if(arr[i] ==-1){
            continue;
           }
           for (int j =0; j<arr.length; j++){
            if(i!=j && arr[i] ==arr[j]){
                count ++;
                arr[j] = -1;
            }
           }
           System.out.println(" the frequency of  " + arr[i] + ":" + count );

        }
    }
    
}
