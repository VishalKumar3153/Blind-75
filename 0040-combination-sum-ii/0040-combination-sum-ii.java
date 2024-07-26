class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(candidates);
        comsum2(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void comsum2(int ind,int a[],int t,List<List<Integer>> ans,List<Integer> ds)
    {
         if(t==0)
         {
            ans.add(new ArrayList<>(ds));
            return;
         }
        for(int i=ind;i<a.length;i++)
        {
            if(i>ind && a[i]==a[i-1])
            {
                continue;
            }
            if(a[i]>t)
            {
                break;
            }
            ds.add(a[i]);
            comsum2(i+1,a,t-a[i],ans,ds);
            ds.removeLast();
        }
    }
}