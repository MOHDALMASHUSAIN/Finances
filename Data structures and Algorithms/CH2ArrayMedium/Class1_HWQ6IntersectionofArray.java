// package CH2ArrayMedium;

// import java.util.Scanner;

// public class Class1_HWQ6IntersectionofArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements in the array1");
//         int n = sc.nextInt();
//         int arr1[] = new int[n];
//         System.out.print("The array is: ");
//         for (int k = 0; k < n; k++) {
//             arr1[k] = sc.nextInt();
//         }

//         System.out.println("Enter the number of elements in the array2");
//         int m = sc.nextInt();
//         int arr2[] = new int[m];
//         System.out.print("The array is: ");
//         for (int k = 0; k < m; k++) {
//             arr2[k] = sc.nextInt();
//         }

//         // Remove duplicates in arr1
//         for (int i = 0; i < arr1.length - 1; i++) {
//             for (int j = i + 1; j < arr1.length; j++) {
//                 if (arr1[i] == arr1[j]) {
//                     arr1[j] = -1;
//                 }
//             }
//         }

//         // Remove duplicates in arr2
//         for (int i = 0; i < arr2.length - 1; i++) {
//             for (int j = i + 1; j < arr2.length; j++) {
//                 if (arr2[i] == arr2[j]) {
//                     arr2[j] = -1;
//                 }
//             }
//         }

//         // Find intersection of arr1 and arr2
//         System.out.println("Intersection of array1 and array2:");
//         for (int i = 0; i < arr1.length; i++) {
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i] == arr2[j] && arr1[i] != -1 && arr2[j] != -1) {
//                     System.out.print(arr1[i] + " ");
//                     arr1[i] = -1; // Mark arr1 element as visited
//                     arr2[j] = -1; // Mark arr2 element as visited
//                 }
//             }
//         }

//         sc.close();
//     }
// }


