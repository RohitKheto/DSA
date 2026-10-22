class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int len = 0;
        for(char c : s.toCharArray()) {
            freq[c]++;
            if(freq[c] == 2) {
                len += 2;
                freq[c] = 0;
            }
        }

        for(int c : freq) {
            if(c == 1) return len + 1;
        }
        return len;
    }
}
