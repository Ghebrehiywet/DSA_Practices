package com.github.gridu.dsa;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int tempBest = nums[0];
        int best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tempBest + nums[i] > nums[i])
                tempBest += nums[i];
            else
                tempBest = nums[i];
            if (best < tempBest)
                best = tempBest;
        }
        return best;
    }
}
