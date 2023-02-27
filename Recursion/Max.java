package Recursion;

import java.util.Arrays;
public class Max {
    static  int  max_n=0;

    private static int max1(int[] list) {
        if (list.length == 0) {
            return max_n;
        }
    
        max_n=Math.max(list[0],max_n);
        return max1(Arrays.copyOfRange(list, 1, list.length));
    }

    private static int max2(int[] list) {
        if (list.length == 2) {
            return list[0] > list[1] ? list[0] : list[1];
        }

        int subMax = max2(Arrays.copyOfRange(list, 1, list.length));
        return list[0] > subMax ? list[0] : subMax;
    }
          
         
    public static void main(String[] args) {
        int arr[]={1,20,5,2};
        System.out.println(max1(arr));
        System.out.println(max2(arr));
    
    
    
    
    }
}
