package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;


public class Binary_search {
 
    public static int binary_search(
        int x, ArrayList<Integer> arr){
        int low=0 , hight=arr.size()-1;
        int index_middel= (low+hight)/2;
       while(low<=hight){
        index_middel= (low+hight)/2;
        if(arr.get(index_middel)==x)  return index_middel;
        if(arr.get(index_middel)<x){
            low=index_middel+1;
            hight=arr.size()-1;
           } else{
            hight=index_middel-1;
            low=0;
           }
       }
        return 0;
    }

    public static void main(String[] args) {
      // Custom input array
      int arr[] = { 2, 3, 4, 10, 40 };
 
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(17);
    list.add(20);
    list.add(23);
    list.add(25);
   System.out.println( binary_search(25, list));


   System.out.println(23 + " found at location " + Arrays.binarySearch(arr, 2));

        }

}
