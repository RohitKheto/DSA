class Solution {
    public int findDuplicate(int[] nums) {
        int f = 0, s = 0;
        while(true) {
            s = nums[s];
            f = nums[nums[f]];
            if(s == f)
                break;
        }
        f = 0;
        while(f!=s){
            s = nums[s];
            f = nums[f];
        }

        return f;
    }
}