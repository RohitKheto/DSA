class Solution {
    public int characterReplacement(String s, int k) {
        int maxC = 0;
        int res = 0 , low = 0;
        int[] arr = new int[26];
        for(int high = 0; high < s.length(); high++){
            arr[s.charAt(high) - 'A']++;
            maxC = Math.max(maxC,arr[s.charAt(high) - 'A']);

            if(high - low + 1 - maxC > k) {
                arr[s.charAt(low++) - 'A']--;
            }
            res = Math.max(res,(high - low + 1));

        }
        return res;
    }
}