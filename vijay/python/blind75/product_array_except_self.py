"""
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
"""

"""
Pseudocode

- Basically need to multiply numbers
by every other number except current index
for each index.

Need to write in O(N) time

Brute force idea
- Create a result array
- Loop through each index
- Find other indices and multiply them to get product
- Push product into result array
- Return result array when done with all products
O(N^2)


Optimized:
Original array
[1,2,3,4]
If division allowed ->
multiply all the numbers 
then divide by missing index+1 (0 based index) 
to get new value
1*2*3*4 = 24
24/1 -> 24
24/2 -> 12
24/3 -> 8
24/4 -> 6
[24,12,8,6]
O(N)
Not sure if this works when dividing by 0, convert to 1?

Division not allowed -> 
"""