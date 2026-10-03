class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int high = 0;
        while(high<n && nums[high]<0)
            high++;
        for(int i = 0; i < n; i++){
            nums[i] = nums[i] * nums[i];
        }
        int low = high - 1, index = 0;
        while(low>=0 && high<n){
            if(nums[low]<nums[high]){
                ans[index] = nums[low];
                index++;
                low--;
            }else{
                ans[index] = nums[high];
                index++;
                high++;
            }
        }
        while(low>=0){
            ans[index] = nums[low];
            index++;
            low--;
        }
        while(high<n){
            ans[index] = nums[high];
            index++;
            high++;
        }
        return ans;

    }
}