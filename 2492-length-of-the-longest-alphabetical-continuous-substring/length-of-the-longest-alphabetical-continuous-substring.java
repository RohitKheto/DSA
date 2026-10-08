class Solution {
    public int longestContinuousSubstring(String s) {
        int maxLen = 1, currLen = 1;
        for(int i = 1; i < s.length(); i++) {
            currLen = (s.charAt(i - 1) + 1 == s.charAt(i)) ? (currLen + 1) : 1;
            maxLen = Math.max(maxLen,currLen);
            if(maxLen == 26) break;
        }
        return maxLen;
    }
}