package Sorting_algorithm;

import java.util.Arrays;

//Time Complexity: O(n²)
// check if the current value is smaller than the minimum (1st index), if not ignore
// if yes update the minimum
// once inner loop done, replaced the 1st index with minimum, and the founded index with the 1st index value
public class selection_sort {
    public static void main(String[] args) {
        int[] nums = {5, 9, 8, 6, 7, 3, 1, 2, 4};
        int size = nums.length;

        int minIndex = 0;
        int tempValue = 0;

        for (int i = 0; i < size; i++){
            minIndex = i;
            for (int j = i; j < size; j++){
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            tempValue = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = tempValue;
            System.out.println("Unsorted Array:" + Arrays.toString(nums));
        }
        System.out.println("Sorted Array:" + Arrays.toString(nums));
    }
}
