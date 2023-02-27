package Recursion;

import java.util.Arrays;

public class Count {
    //base case-> arrive to last index
    //recursion case-> array have elements
  private static int count(int[] list) {
    if (list.length == 0) {
        return 0;
    }

    return 1 + count(Arrays.copyOfRange(list, 1, list.length));
}
      
     
public static void main(String[] args) {
    int arr[]={1,3,4,5};
    System.out.println(count(arr));




}
}
