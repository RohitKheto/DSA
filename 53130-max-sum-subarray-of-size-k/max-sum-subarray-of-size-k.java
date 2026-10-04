class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int start = 0, end = 0, sum = 0;
        for(end = 0; end < k; end++){
            sum += arr[end];
        }
        int maxSum = sum;
        for(; end < arr.length; end++){
            sum += arr[end] - arr[start++];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
