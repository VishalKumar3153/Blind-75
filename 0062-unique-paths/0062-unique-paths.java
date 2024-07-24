class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        return path(0,0,m,n,dp);
    }
    public int path(int i,int j,int m,int n,int[][] dp)
    {
        if(i<0 || j<0 || i>=m || j>=n)
        {
            return 0;
        }
        if(dp[i][j]>0)
        {
            return dp[i][j];
        }
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        int right=path(i,j+1,m,n,dp);
        int down=path(i+1,j,m,n,dp);
        dp[i][j]=right+down;
        return right+down;
    }
}