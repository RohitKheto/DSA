class Solution {
    public int findMaxLength(int[] nums) {
        int res = 0, sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;
            int len = 0;
            int index = map.getOrDefault(sum, -2);
            if(index == -2) map.put(sum,i);
            else res = Math.max(res,(i - index));
        }
        return res;
    }
}
