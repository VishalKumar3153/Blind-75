class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[i].length;j++)
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
       
        for(int i=0;i<matrix.length;i++)
        {
             int k=0;
            int j=matrix[i].length-1;
            while(k<j)
        {
            int t=matrix[i][k];
            matrix[i][k]=matrix[i][j];
            matrix[i][j]=t;
            k++;
            j--;
        }  
        }
    }
}