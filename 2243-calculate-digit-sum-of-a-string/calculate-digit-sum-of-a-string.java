class Solution {
    public String digitSum(String s, int k) {
        if(s.length() <= k)
            return s;
        StringBuilder sb = new StringBuilder();
        int sum = 0; 
        for(int i = 0; i < s.length(); i++) {
            if(i != 0 && i%k == 0) {
                sb.append(sum);
                sum = 0;
            }
            sum += s.charAt(i) - '0';
        }
        sb.append(sum);
        return digitSum(sb.toString(),k);
    }
}
