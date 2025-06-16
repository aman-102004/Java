package Dsa50days;

public class MaxProductsSubarray {
    public static int maxProduct(int[] nums) {
        int result = nums[0];
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // If current is negative, swap max and min
            if (current < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            // Update max and min
            max = Math.max(current, max * current);
            min = Math.min(current, min * current);

            // Update result
            result = Math.max(result, max);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums)); // Output: 6
    }
}
