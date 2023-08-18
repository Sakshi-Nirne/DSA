class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer>ans=new ArrayList<Integer>();
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max)
            {
                max=arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}


output
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
