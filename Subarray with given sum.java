class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int l = 0;
        int r = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        if (s == 0) {
            ans.add(-1);
            return ans;
        }
        
        boolean isFound = false;
        int sum = arr[0];
        
        while (r < n) {
            if (sum == s) {
                isFound = true;
                break;
            } else if (sum < s) {
                r++;
                if (r < n) {
                    sum += arr[r];
                }
            } else {
                sum -= arr[l];
                l++;
            }
        }
        
        if (isFound) {
            ans.add(l + 1);
            ans.add(r + 1);
        } else {
            ans.add(-1);
        }
        
        return ans;
    }
}

output
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
