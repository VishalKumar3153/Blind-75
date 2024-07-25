class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int ms=nums[0];
        if(nums.length==1)
        {
            ms=nums[0];
        }
        else
        {
            for(int i=1;i<nums.length;i++)
        {
            if(cs>=0)
            {
                cs=cs+nums[i];
            }
            else
            {
                cs=nums[i];
            }
            if(cs>ms)
            {
                ms=cs;
            }
        }
        }
        
        return ms;
    }
}