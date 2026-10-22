class Solution {
    public int maxNumberOfBalloons(String text) {
        int [] freq=new int [26];

        for(char ch : text.toCharArray()){
            freq[ch-'a']++;
        }

        freq['l'-'a'] /= 2;
        freq['o'-'a'] /= 2;

        int min=Integer.MAX_VALUE;

        for(char ch : "balon".toCharArray()){
            min = Math.min(min,freq[ch-'a']);
        }
        return min;
        
    }
}