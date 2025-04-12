package Searching_Algorithm;

public class binary_search {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++){
            nums[i] = i + 1;
        }

        int target = 99;
        int start = 0;
        int end = nums.length;
        int result = 0;

        for (int i : nums){
            int minIndex = (start + end) / 2;
            if (nums[minIndex] > target) {
                end = minIndex - 1;
            }
            else if (nums[minIndex] < target){
                start = minIndex + 1;
            }
            else if (nums[minIndex] == target){
                result = minIndex;
                break;
            }
            else{
                result = -1;
            }
        }
        System.out.printf("Result found at index %d", result);
    }
}

