// This is a Binary Search on Answer problem of the Maximize the Minimum type.
// First, sort the stalls. The search space for the minimum distance lies between 1 and (last stall - first stall). 
// For every candidate distance (mid), greedily place the first cow in the first stall 
// and continue placing the remaining cows only when the distance from the last placed cow is at least mid. 
// If all k cows can be placed, the current distance is valid, so search for a larger distance. 
// Otherwise, search for a smaller distance. 
// The final answer is the largest minimum distance for which placing all cows is possible.

// Time Complexity: O(n log n + n × log(maxDistance))

// Space Complexity: O(1)

class Solution {
    private boolean isPossible(int[] stalls, int k, int dis) {
        int currStall = stalls[0];
        int cow = 1;
        for(int stall : stalls) {
            if((stall - currStall) >= dis) {
                cow++;
                currStall = stall;
            }
            if(cow == k) return true;
        }
        return false;
    }
    
	public int aggressiveCows(int[] arr, int k) {
		Arrays.sort(arr);
		
		int h = arr[arr.length - 1] - arr[0];
		int l = 1;
		int res = 1;
		
		while(l <= h) {
		    int m = l + (h - l)/2;
		    if(isPossible(arr,k,m)) {
		        res = m;
		        l = m + 1;
		    } else {
		        h = m - 1;
		    }
		}
		return res;
		
	}
}
