package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

 class Sum_N {
    static int t = 0;

    //base case-> array is empty
    //recursion case-> array have elements

    static int sum(ArrayList<Integer> arr) {

        if (arr.size() == 0) {
            return t;
        }
        t += arr.remove(arr.size() - 1);
        return sum(arr);
    }
    //  I start from index 1 to end and add index 0 
    /*   when I copy array I copy from 1 to end, every time I copy arry withot 
          index 0 for that element in index 1 go back to index 0 .  
    */ 
    private static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(1);
        arrl.add(2);
        arrl.add(23);
        arrl.add(4);
        int arr[]={1,3,4,5};
        System.out.println(sum(arr));
        System.out.println(sum(arrl));



    }



}
