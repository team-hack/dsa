"""
Return a list containing the index pair
of a list that contains the sum
of a target
"""
from typing import List

# O(N^2) Time Complexity
# O(N) Space Complexity
def bruteForce(nums:List[int], target:int) -> List[int]:
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if target - nums[i] == nums[j]:
                return [i, j]
    return []

# O(N) Time Complexity
# O(N) Space Complexity
def optimized(nums:List[int], target:int) -> List[int]:
    lookup = {}
    for i in range(len(nums)):
        print(lookup.get(target - nums[i]))
        if lookup.get(target - nums[i]) is not None: 
            print('true')
            return [lookup.get(target - nums[i]), i]
        lookup[nums[i]] = i

    
nums = [2,7,11,15]
target = 9

# print(bruteForce(nums, target))
print(optimized(nums, target))