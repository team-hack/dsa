package com.blind75.arrays.easy;

import com.blind75.helper.Task;

import java.util.HashMap;

public class TwoSum extends Task {

    /**
     * O(n^2) time complexity - every for loop add time complexity.
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * O(n) complexity in time and space
     * and faster.
     *
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

    public static void main(String[] args) {
        new TwoSum().run();
    }

    @Override
    protected void run() {
        int[] nums = {2, 7, 12, 23};
        int target = 9;
        printArray(bruteForce(nums, target), "bruteforce");
        printArray(twoSum(nums, target), "optimized");
    }
}
