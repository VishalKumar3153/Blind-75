class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)
        {
            return true;
        }
        int m=nums[0];
        for(int i=1;i<nums.length && m>=i;i++)
        {
            if(m<i+nums[i])
            {
                m=i+nums[i];
            }
            if(m>=nums.length-1)
            {
                return true;
            }
        }
        return false;
    }
}