class Solution {
    public void rotate(int[][] matrix) {
      int n=matrix.length;
      Stack<Integer> s=new Stack<>();

      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
              s.push(matrix[i][j]);
          }
      }

      for(int i=0;i<n;i++)
      {
          for(int j=n-1;j>=0;j--)
          {
              matrix[j][i]=s.pop();
          }
      }
    }
}




Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
