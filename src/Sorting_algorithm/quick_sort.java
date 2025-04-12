package Sorting_algorithm;

import java.util.Arrays;
// Divide the array by pivot
// Recursion
// Pivot
// Tree

// Time Complexity: O(n log n)
public class quick_sort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            System.out.println("Unsorted Array:" + Arrays.toString(arr));

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 9, 8, 6, 7, 3, 1, 2, 4};

        quickSort(nums, 0, nums.length-1);

        System.out.println("Unsorted Array:" + Arrays.toString(nums));
        System.out.println("Sorted Array:" + Arrays.toString(nums));
    }
}
