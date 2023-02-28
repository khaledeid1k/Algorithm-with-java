package QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static QuickSort.Quicksort.FirestQuicksort.printArray;
import static QuickSort.Quicksort.FirestQuicksort.quickSort;
import static QuickSort.Quicksort.SecondQuicksort.quicksort;


public class Quicksort {


    static class FirestQuicksort {
        // A utility function to swap two elements
        static void swap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        /* This function takes last element as pivot, places
        the pivot element at its correct position in sorted
        array, and places all smaller (smaller than pivot)
        to left of pivot and all greater elements to right
        of pivot */
        static int partition(int[] arr, int low, int high)
        {

            // pivot
            int pivot = arr[high];

            // Index of smaller element and
            // indicates the right position
            // of pivot found so far
            int index_Of_swap_element = (low - 1);

            for (int j = low; j <= high - 1; j++) {

                // If current element is smaller
                // than the pivot
                if (arr[j] < pivot) {

                    // Increment index of
                    // smaller element
                    index_Of_swap_element++;
                    swap(arr, index_Of_swap_element, j);
                }
            }
            // swap pivot number
            swap(arr, index_Of_swap_element + 1, high);

            return (index_Of_swap_element + 1);
        }

        /* The main function that implements QuickSort
                arr[] --> Array to be sorted,
                low --> Starting index,
                high --> Ending index
        */
        static void quickSort(int[] arr, int low, int high)
        {
            if (low < high) {

                // pi is partitioning index, arr[p]
                // is now at right place
                int pi = partition(arr, low, high);

                // Separately sort elements before
                // partition and after partition
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }

        // Function to print an array
        static void printArray(int[] arr)
        {
            for (int j : arr) System.out.print(j + " ");

            System.out.println();
        }

    }
    static class SecondQuicksort {
        static List<Integer> quicksort(List<Integer> list) {
            if (list.size() < 2) {
                // base case, arrays with 0 or 1 element are already "sorted"
                return list;
            } else {
                // recursive case
                Integer pivot = list.get(0);

                // sub-array of all the elements less than the pivot
                List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot)
                        .collect(Collectors.toList());

                // sub-array of all the elements greater than the pivot
                List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot)
                        .collect(Collectors.toList());

                return Stream.of(
                                quicksort(less).stream(),
                                Stream.of(pivot),
                                quicksort(greater).stream())
                        .flatMap(Function.identity()).collect(Collectors.toList());
            }
        }

    }






    public static void main(String[] args)
    {
        // one way
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr);


        // two-way
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(9);
        quicksort(list).forEach(System.out::println);

    }

}

