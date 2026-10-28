class Solution {
    private boolean isPossible(int[] position, int m, int force) {
        int currPos = position[0];
        int ball = 1;
        for(int pos : position) {
            if((pos - currPos) >= force) {
                ball++;
                currPos = pos;
                if(ball == m) return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
		int h = position[position.length - 1] - position[0];
		int l = 1;
		int res = 1;
		
		while(l <= h) {
		    int mid = l + (h - l)/2;
		    if(isPossible(position,m,mid)) {
		        res = mid;
		        l = mid + 1;
		    } else {
		        h = mid - 1;
		    }
		}
		return res;
    }
}