class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = nums[0] + nums[1] + nums[2];
        int ansDiff = Math.abs(target - ans);
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n - 2; i++){
            int low = i + 1;
            int high = n - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                int sumDiff = Math.abs(target - sum);
                if(sumDiff < ansDiff){
                    ans = sum;
                    ansDiff = sumDiff;
                }
                if(sum == target){
                    return sum;
                }
                if(sum < target) low++;
                if(sum > target) high--;
            }
        }
        return ans;
    }
}