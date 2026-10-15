class Solution {
    private int[] overlap(int[] a, int[] b) {
        if (a[0] > b[1] || b[0] > a[1])
            return null;
        return new int[] { Math.max(a[0], b[0]), Math.min(a[1], b[1]) };
    }

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int m = firstList.length, n = secondList.length;
        for (int i = 0, j = 0; i < m && j < n;) {
            int[] a = firstList[i], b = secondList[j];
            int[] overlap = overlap(a, b);
            if (overlap != null) ans.add(overlap);

            if (a[1] < b[1]) i++;
            else if (a[1] > b[1]) j++;
            else {
                i++;
                j++;
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}