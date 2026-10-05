class Solution {
    private int storingFrequency(String s){
        Map<Character,Integer> frequency = new HashMap<>();
        int low = 0, res = 0;
        for(int high = 0; high < s.length(); high++){
            frequency.put(s.charAt(high),frequency.getOrDefault(s.charAt(high),0) + 1);

            if(res >= frequency.size()){
                frequency.put(s.charAt(low),frequency.get(s.charAt(low)) - 1);
                if(frequency.get(s.charAt(low))==0) frequency.remove(s.charAt(low));
                low++;
            }

            res = Math.max(res,high - low + 1);
        }
        return res;
    }

    private int storingIndex(String s){
        Map<Character,Integer> indexes = new HashMap<>();
        int low = 0, res = 0;
        for(int high = 0; high < s.length(); high++){
            int index = indexes.getOrDefault(s.charAt(high),-1);
            if(index >= low){
                low = index + 1;
            }
            indexes.put(s.charAt(high),high);
            res = Math.max(res,high - low + 1);
        }
        return res;
    }

    public int lengthOfLongestSubstring(String s) {
        return storingIndex(s);
    }
}