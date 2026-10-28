// minimum pages assign >= max(arr[i]) 
// maximum pages assign <= total(arr[i]) - (k - 1) * min(arr[i]) or simply total(arr[i])
// lets take an example [1,1,90] and k = 3
// ...in this case assigned pages couldn't be greater than 90 
// or we can say assigned pages <= 90 [ 92(sum of all pages) - 2(k -1) * 1(min(arr[i]))]
class Solution {
    private boolean isPossible(int[] arr, int k, long maxPage) {
        long sum = 0;
        for(int pages : arr) {
            sum += pages;
            if(sum > maxPage) {
                k--;
                sum = pages;
            }
        }
        k--;
        return (k >= 0);
    }

    public int findPages(int[] arr, int k) {
    //   int max = 0;
    //   int min = Integer.MAX_VALUE;
    //   long sum = 0;
    //   int n = arr.length;
    //   if(n < k) return -1;
    //   for(int i = 0; i < n; i++) {
    //       if(arr[i] > max) max = arr[i];
    //       if(arr[i] < min) min = arr[i];
    //       sum += arr[i];
    //   }

    //   long l = max;
    //   long h = sum - (k - 1) * min;

    //            OR

        if(arr.length < k) return -1;
        long l = 0; // l = max(arr)
        long h = 0; // h = sum (arr)
        for(int books : arr) {
            if(books > l) l = books;
            h += books;
        }

        long res = l;

       while(l <= h) {
           long m = l + (h - l)/2;
           if(isPossible(arr,k,m)) {
               res = m;
               h = m - 1;
           } else {
               l = m + 1;
           }
       }
       return (int)res;
    }
}
