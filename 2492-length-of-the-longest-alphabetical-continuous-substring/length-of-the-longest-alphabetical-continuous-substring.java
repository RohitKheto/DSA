class Solution {
    public int longestContinuousSubstring(String s) {
        int low = 0, maxLen = 1;
        for(int high = 1; high < s.length(); high++) {
            int prev = s.charAt(high - 1);
            int curr = s.charAt(high);

            if(prev + 1 != curr) low = high;
            
            maxLen = Math.max(maxLen,high - low + 1);
        }
        return maxLen;
    }
}