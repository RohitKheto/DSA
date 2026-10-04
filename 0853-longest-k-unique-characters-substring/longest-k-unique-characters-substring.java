class Solution {
    public int longestKSubstr(String s, int k) {
        int alphabetsCount[] = new int[26];
        int maxLength = -1;
        int low = 0;
        for(int high = 0; high < s.length(); high++) {
            int index = s.charAt(high) - 'a';
            if(alphabetsCount[index] == 0)
                k--;
            alphabetsCount[index]++;
            while(k < 0) {
                int i = s.charAt(low++) - 'a';
                alphabetsCount[i]--;
                if(alphabetsCount[i] == 0) k++;
            }
            if(k == 0) {
                maxLength = Math.max(maxLength, high - low + 1);
            }
        }
        return maxLength;
    }
}
