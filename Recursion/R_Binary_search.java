package Recursion;

import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R_Binary_search {
     
    public static int binary_search(int x, List<Integer> arr){
        int low=0 , hight=arr.size()-1;
        
        int index_middel= (low+hight)/2;

       while(low<=hight){
        
        index_middel= (low+hight)/2;
        
        if(arr.get(index_middel)==x)  return index_middel;
        
        if(arr.get(index_middel)<x){
            low=index_middel+1;
            hight=arr.size()-1;
            binary_search(x,arr.subList(index_middel+1,  arr.size()-1));
           
        
        } else{
            hight=index_middel-1;
            low=0;
            binary_search(x,arr.subList(index_middel-1, 0));
           }
       }
        return 0;
    }
   
    static int binarySearch(int arr[], int l, int r, int x)
    {
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
        if (r >= l && l <= arr.length - 1) {
 
            int mid = l + (r - l) / 2;
 
            // If the element is present
            // at the middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present in
        // array
        return -1;
    }
 
   
   
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(17);
    list.add(20);
    list.add(23);
    list.add(25);
   System.out.println( binary_search(23, list));



   // Custom input array
   int arr[] = { 2, 3, 4, 10, 40 };
 
   // Length of array
   int n = arr.length;

   // Custom element to be checked
   // whether present or not
   int x = 10;

   // Calling above method
   int result = binarySearch(arr, 0, n - 1, x);

   // Element present
   if (result == -1)

       // Print statement
       System.out.println("Element not present");

   // Element not present
   else

       // Print statement
       System.out.println("Element found at index "
                          + result);









    }

}
