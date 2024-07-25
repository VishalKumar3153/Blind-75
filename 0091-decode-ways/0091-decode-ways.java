class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[100];
        Arrays.fill(dp,-1);
        return decode(0,s,dp);
    }
    public int decode(int i,String s,int[] dp)
    {
        if(i>=s.length())
        {
            return 1;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int ans=0;
        int op1=s.charAt(i)-'0',op2=0;
        if(i<s.length()-1)
        {
            op2=op1*10+s.charAt(i+1)-'0';
        }
        if(op1>0)
        {
           ans+= decode(i+1,s,dp);
        }
        if(op1>0 && (op2>0 && op2<=26))
        {
            ans+=decode(i+2,s,dp);
        }
        return dp[i]=ans;
    }
}