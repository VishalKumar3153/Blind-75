class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        comsum(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void comsum(int i,int[] a,int t,List<List<Integer>> ans,List<Integer> ds)
    {
        if(i==a.length)
        {
            if(t==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
            if(a[i]<=t)
            {
                ds.add(a[i]);
                comsum(i,a,t-a[i],ans,ds);
                ds.removeLast();
            }
            comsum(i+1,a,t,ans,ds);
    }
}