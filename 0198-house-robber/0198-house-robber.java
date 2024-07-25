class Solution {
    public int rob(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return robber(nums.length-1,nums,dp);
    }
    public int robber(int n,int a[],int[] dp)
    {
        if(n==0)
        {
            return a[n];
        }
        if(n<0)
        {
            return 0;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int pick=a[n]+robber(n-2,a,dp);
        int notPick=0+robber(n-1,a,dp);
        return dp[n]=Math.max(pick,notPick);
    }
}