package com.blind75.arrays.easy;

import java.util.HashMap;

public class TwoSum {

    /**
     * O(m+n) time complexity - every for loop add time complexity.
     * O(2n) which is basically O(n) since its linear than quadratic
     * @param nums
     * @param target
     * @return
     */
    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    /**
     * O(n) complexity in time and space
     * a tad faster.
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[0];
    }
}
