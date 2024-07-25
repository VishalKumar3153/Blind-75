class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean ans=true;
        if (s.length()!=t.length()){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++)
        {
            if(a[i]!=b[i])
            {
                ans=false;
                break;
            }
            else
            {
                ans=true;
            }
        }
        }
        return ans;
    }
}