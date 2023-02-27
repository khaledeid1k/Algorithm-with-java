package SelectionSort;
import java.util.ArrayList;

public class SelectionSort {

   public static int  findSmallest(ArrayList<Integer> arr){
    int smallest = arr.get(0);
    int smallest_index = 0;
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) < smallest){
            smallest=arr.get(i);
            smallest_index = i;

        }
        
    } 
    return smallest_index;

   }

   public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr){
    ArrayList<Integer> newArr=new ArrayList<>();
    while (arr.size()!=0) {
        int smallest_index = findSmallest(arr);
        newArr.add(arr.remove(smallest_index));
    }
    return newArr;
}


   public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(4);
    arr.add(25);
    arr.add(20);
    arr.add(5);
    System.out.println(selectionSort(arr));
   
}


   
    
}
