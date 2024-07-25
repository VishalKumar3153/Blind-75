class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ss=new HashSet<>();
        int st=0;
        int end=0;
        int len=Math.min(s.length(),1);
        while(end < s.length())
        {
            char c=s.charAt(end);
            while(ss.contains(c))
            {
                ss.remove(s.charAt(st));
                st+=1;
            }
            ss.add(c);
            int ml=end-st+1;
            len=Math.max(len,ml);
            end+=1;
        }
        
        return len;
    }
}