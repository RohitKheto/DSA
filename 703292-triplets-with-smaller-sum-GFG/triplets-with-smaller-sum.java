class Solution {
    int countTriplets(int sum, int arr[]) {
        int count = 0;
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n - 2; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int low = i + 1;
            int high = n - 1;
            while(low < high){
                int total = arr[i] + arr[low] + arr[high];
                if(sum <= total) high--;
                else{
                    count += (high-low);
                    low++;
                    while(low < n && arr[low] == arr[low-1]) low++;
                }
            }
        }
        return count;
    }
}
