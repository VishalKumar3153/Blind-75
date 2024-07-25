class Solution {
    public int rob(int[] nums) {
        // int a[]=new int[nums.length-1];
        // int b[]=new int[nums.length-1];
        if(nums.length==1)
        {
            return nums[0];
        }
        int a[] = Arrays.copyOfRange(nums, 0, nums.length-1); 
        int b[] = Arrays.copyOfRange(nums, 1, nums.length); 
        int dp[]=new int[a.length];
        Arrays.fill(dp,-1);
        int one=robber(a.length-1,a,dp);
        Arrays.fill(dp,-1);
        int two=robber(b.length-1,b,dp);
        return Math.max(one,two);
    }
    public int robber(int i,int a[],int dp[])
    {
        if(i==0)
        {
            return a[i];
        }
        if(i<0)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int take=a[i]+robber(i-2,a,dp);
        int notTake=0+robber(i-1,a,dp);
        return dp[i]=Math.max(take,notTake);
    }
}