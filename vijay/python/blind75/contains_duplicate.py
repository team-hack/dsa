"""
Contains duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
"""

from typing import List

"""
Brute force 
- Loop through the list each index
- Compare to every other index
- If numbers match - return duplicate
O(N^2) time complexity
"""
def bruteForce(nums: List[int]) -> bool:
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if nums[i] == nums[j]:
                return True
    return False


"""
Optimized 1:
Keep an in memory hash
- Store each number in an array
- Loop through list  
- If in hash return true
O(N) complexity
O(N) space
"""
def optimized1(nums: List[int]) -> bool:
    d = {}
    for i in range(len(nums)):
        if d.get(nums[i]):
            return True
        d[nums[i]] = nums[i]
    return False

"""
Optimized 2:
Use a set
Add numbers to set
Subtract length of set from length list
If list length larger, has duplicates
O(1) add numbers to set
O(1) space complexity
"""
def optimized2(nums: List[int]) -> bool:
    s = set(nums)
    if len(nums) > len(s):
        return True
    return False


n = [1,2,0,4,4]
print(bruteForce(n))
print(optimized1(n))
print(optimized2(n))