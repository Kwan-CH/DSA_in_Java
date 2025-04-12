package Sorting_algorithm;

import java.util.Arrays;

// Time Complexity: O(n)
// doing by shifting the element to their exact position by comparing front and back element
public class insertion_sort {
    public static void main(String[] args) {
        int[] nums = {5, 9, 8, 6, 7, 3, 1, 2, 4};


        for (int i = 1; i < nums.length; i++){
            int j = i - 1;
            int temp = nums[i];

            while (j >= 0 && (nums[j] > temp)){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
            System.out.println("Unsorted Array:" + Arrays.toString(nums));
        }
        System.out.println("Sorted Array:" + Arrays.toString(nums));
    }
}
