package Sorting_algorithm;

import java.util.Arrays;

//ascending order
//Time complexity: O(n²)
// check by if the current value is bigger than the next one, if yes then swap
// the whole process repeat
public class bubble_sort {
    public static void main(String[] args) {
        int[] nums = {5, 9, 8, 6, 7, 3, 1, 2, 4};
        int size = nums.length;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size - 1; j++){
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                System.out.println("Unsorted Array:" + Arrays.toString(nums));
            }
        }
        System.out.println("Sorted Array:" + Arrays.toString(nums));
    }
}
