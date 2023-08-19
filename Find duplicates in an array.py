class Solution:
    def duplicates(self, arr, n): 
      
        seen=set()
        temp=set()
     
        for num in arr:
            if num in seen:
                temp.add(num)
            else:
                seen.add(num)
    
        if not temp:
            return [-1]
    
        return sorted(temp)

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: 
-1
Explanation: 
There is no repeating element in the array. Therefore output is -1.
Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}
Output: 
2 3 
Explanation: 
2 and 3 occur more than once in the given array.
