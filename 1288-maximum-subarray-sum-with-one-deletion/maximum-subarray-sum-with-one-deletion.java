class Solution {
    public int maximumSum(int[] arr) {
        int max_sum = arr[0];
        int no_del = arr[0];
        int one_del = arr[0];
        for(int i = 1; i < arr.length; i++) {

            one_del = Math.max(no_del,one_del+arr[i]);
            no_del = Math.max(arr[i], no_del + arr[i]);

            max_sum = Math.max(max_sum, Math.max(one_del,no_del));
        }
        return max_sum;
    }
}