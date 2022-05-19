package com.blind75.arrays.easy;

import com.blind75.helper.Task;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate extends Task {

    public static void main(String[] args) {
        new ContainsDuplicate().run();
    }

    /**
     * O(n^2) time complexity
     *
     * @param nums
     * @return
     */
    private boolean bruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j)
                    return true;
            }
        }
        return false;
    }

    /**
     * O(n) time & space complexity
     *
     * @param nums
     * @return
     */
    private boolean optimized(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

    @Override
    protected void run() {
        int[] nums = {1, 2, 3, 4};
        System.out.println("bruteForce==>" + bruteForce(nums));
        System.out.println("optimized==>" + optimized(nums));
    }
}
