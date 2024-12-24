 

public class Q12MajorityElement {
public static void main(String[] args) {
    int arr[] = {3,1,4,3,3,3,6,3};
    // majority element -> done by concept of frequency
for (int i = 0; i<arr.length; i++){
    int count = 1;
   if(arr[i] ==-1){
    continue;
   } 
   for (int j = 0; j<arr.length; j++){
    if(i!=j && arr[i]==arr[j]){
        count ++;
        arr[j] =-1;
        
    }
}
//System.out.println(count);
if(count >arr.length/2){
    System.out.println( "Majority Element is "+ arr[i]);
}


}    
}}