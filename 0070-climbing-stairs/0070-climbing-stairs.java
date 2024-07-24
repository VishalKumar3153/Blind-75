class Solution {
    public int climbStairs(int n) {
        int a[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            a[i]=-1;
        }
        return count(n,a);
    }
    public int count(int n,int[] a)
    {
        if(n<=1)
        {
            return 1;
        }
        if(a[n]!=-1)
        {
            return a[n];
        }
        int left=count(n-1,a);
        a[n-1]=left;
        int right=count(n-2,a);
        a[n-2]=right;
        return left+right;
    }
}