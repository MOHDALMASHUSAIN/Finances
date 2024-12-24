

public class Q20SortedorNOT {
    
public static void main(String[] args) {
    

        int arr[] = {12,54,56,233,65,762};
        boolean flag= true;

            for (int i =0;i<arr.length-1;i++){
                  if(arr[i] >arr[i+1]){
                  flag = false;
                   
                   break;
               }     
            
            }
            if(flag){
                System.out.println("the array is sorted");
            }
            else{
                System.out.println("Array is not sorted");
            }

  
    
        }
    }
    

    


    // aise case jismein akhri mein check krna ho wahan flag use kro

