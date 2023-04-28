package com.github.gridu.dsa;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i <= n - 1; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
