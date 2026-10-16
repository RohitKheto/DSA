class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);

        int n = start.length;
        int res = 0; 
        int room = 0;
        int i = 0; 
        int j = 0;
        
        
        while (i < n && j < n) {
            if (start[i] < end[j]) {
                room++;
                res = Math.max(res,room);
                i++;
            }
            else {
                room--;
                j++;
            }
        }
        return res;
    }
}
