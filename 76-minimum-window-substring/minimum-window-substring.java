class Solution {
    public String minWindow(String s, String t) {
        int low = 0, start = 0, end = 0, uCount = 0, length = Integer.MAX_VALUE;
        Map<Character,Integer> tMap = new HashMap<>();
        Map<Character,Integer> sMap = new HashMap<>();

        for(char ch : t.toCharArray()) {
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }

        int unique = tMap.size();

        for(int high = 0; high < s.length(); high++) {
            char c = s.charAt(high);
            int sCount = sMap.getOrDefault(c,0)+1;
            int tCount = tMap.getOrDefault(c,0);
            sMap.put(c,sCount);

            if(sCount == tCount) uCount++;

        System.out.println(uCount);

            while(uCount == unique) {
                if((high - low + 1) < length){
                    start = low;
                    end = high + 1;
                    length = high - low + 1;
                }
                c = s.charAt(low);
                sCount = sMap.get(c) - 1;
                tCount = tMap.getOrDefault(c,0);
                sMap.put(c,sCount);
                if(sCount < tCount) uCount--;
                low++;
                System.out.println(start + " " + end);
            }
        }

        return s.substring(start,end);
    }
}