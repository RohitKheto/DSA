class Solution {
	private int getOccur(int[] arr, int target, int pos) {
		int left = 0;
		int right = arr.length - 1;
		int ans = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				ans = mid;
				if(pos == 0) right = mid - 1;
				else left = mid + 1;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ans;
	}
	
	int countFreq(int[] arr, int target) {
		int firstIdx = getOccur(arr, target, 0);
		int lastIdx = getOccur(arr, target, 1);
		return (firstIdx == -1 || lastIdx == -1)? 0 : lastIdx - firstIdx + 1;
	}
}
