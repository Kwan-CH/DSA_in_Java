package Sorting_algorithm;

import java.util.Arrays;

public class merge_sort {

    public static void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int median = (left + right) / 2;

            mergeSort(arr, left, median);
            mergeSort(arr, median + 1, right);

            merge(arr, left, median, right);
        }
    }

    private static void merge(int[] arr, int left, int median, int right) {
        int n1 = median - left + 1;
        int n2 = right - median;

        int[] lArray = new int[n1];
        int[] rArray = new int[n2];

        for (int x = 0; x < n1; x++){
            lArray[x] = arr[x + left];
        }
        for (int x = 0; x < n2; x++){
            rArray[x] = arr[x + median + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if (lArray[i] <= rArray[j]){
                arr[k] = lArray[i];
                i++;
            }
            else{
                arr[k] = rArray[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = lArray[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = rArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 9, 8, 6, 7, 3, 1, 2, 4};
        System.out.println("Unsorted Array:" + Arrays.toString(nums));

        mergeSort(nums, 0, nums.length - 1);

        System.out.println("Sorted Array:" + Arrays.toString(nums));
    }
}
