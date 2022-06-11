"""
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.
"""
from typing import List
# Examples
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
nums1 = [5, 4, -1, 7, 8]
nums2 = [1]

"""
largest subarray is n-1, unless negative, 
sum both n, n-1
"""


def max(nums: List[int]) -> tuple:
    max = 0
    max_index = 0

    for i in range(0, len(nums)):
        if nums[i] >= max:
            max = nums[i]
            max_index = i
    return (max, max_index)


def max_sub_array(nums: List[int]) -> List:
    # start
    if(len(nums) <= 0):
        return 0

    if(len(nums) == 1):
        return nums[0]

    start = max(nums)
    max_num = start[0]
    start_index = start[1]
    end_index = -1
    sum = 0

    for i in range(start_index, 0, -1):
        sum += nums[i]
        if sum >= max_num:
            end_index = i

    new_sum = 0
    for i in range(start_index, end_index-1, -1):
        new_sum += nums[i]

    return new_sum


print(max_sub_array(nums))
print(max_sub_array(nums1))
print(max_sub_array(nums2))
