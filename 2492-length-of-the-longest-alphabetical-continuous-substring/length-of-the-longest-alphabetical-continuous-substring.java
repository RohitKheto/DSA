class Solution {
    public int longestContinuousSubstring(String s) {
        int maxLen = 1, count = 1;
        for(int i = 1; i < s.length(); i++) {
            int prev = s.charAt(i - 1);
            int curr = s.charAt(i);

            count = (prev + 1 == curr) ? (count + 1) : 1;
            maxLen = Math.max(maxLen,count);
            if(maxLen == 26) break;
        }
        return maxLen;
    }
}