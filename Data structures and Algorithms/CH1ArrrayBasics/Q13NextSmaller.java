

public class Q13NextSmaller {
    public static void main(String[] args) {
        int arr[] = {12,3,43,5,7,6}; 
        int count = 0;       
       for (int i = 0;i<arr.length;i++){
        
        for (int j =i+1;j<arr.length;j++){
            if(arr[i] >arr[j]){
                count ++;
            } 
        }
        System.out.println("Nxt smaller element of" +arr[i] +" :" + count);
       }       
    }
}
