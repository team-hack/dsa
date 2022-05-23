"""
Find the max profit, given a list of prices
Assume indices represent days in order
Can't go back in time
"""

from typing import List

prices = [7,1,5,3,6,4]

# O(N^2) Time Complexity
# O(1) Space Complexity
def bruteForce(prices:List[int]) -> int:
    highest = 0
    max_profit = 0
    for i in range(len(prices)):
        for j in range(i + 1, len(prices)):
            if prices[i] < prices[j]:
                highest = prices[j]
                profit = highest - prices[i]
                if profit > max_profit:
                    max_profit = profit
    return max_profit
               
                

# O(NlogN) Time Complexity
# O(N) Space Complexity
def optimized(prices: List[int]) -> int:
    prices_sorted = sorted(prices)
    max_index = len(prices_sorted) - 1
    max = prices_sorted[max_index]
    for i in range(len(prices)):
        if prices[i] == max:
            max_index = max_index - 1
            max = prices_sorted[max_index]
        else:
            if prices[i] < max:
                return max - prices[i]
    return 0 

print(bruteForce(prices))
#print(optimized(prices))