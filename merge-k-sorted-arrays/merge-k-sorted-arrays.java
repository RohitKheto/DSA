class Solution {
    class Pair {
        Integer val;
        Integer idx;
        
        Pair(Integer val, Integer idx) {
            this.val = val;
            this.idx = idx;
        }
    }
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b) -> (a.val - b.val));
        int n = mat.length;
        int m = mat[0].length;
        
        for(int row = 0; row < n; row++) {
            minHeap.add(new Pair(mat[row][0],(row*m)));
        }
        
        while(!minHeap.isEmpty()) {
            Pair element = minHeap.poll();
            int row = element.idx / m;
            int col = (element.idx % m) + 1;
            ans.add(element.val);
            if(col < m) {
                minHeap.add(new Pair(mat[row][col],((row * m) + col)));
            }
        }
        
        return ans;
    }
}
