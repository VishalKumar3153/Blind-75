class Solution {
    Map<String, Boolean> map = new HashMap<>();
    
    public boolean wordBreak(String s, List<String> wordDict) {
        return breakW(s, new HashSet<>(wordDict));
    }
    
    private boolean breakW(String s, Set<String> wordDict) {
        if (s.length() == 0) {
            return true; 
        }
        
        if (map.containsKey(s)) {
            return map.get(s); 
        }
        
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (wordDict.contains(prefix)) {
                String suffix = s.substring(i);
                if (breakW(suffix, wordDict)) {
                    map.put(s, true);
                    return true;
                }
            }
        }
        
        map.put(s, false); 
        return false;
    }
}