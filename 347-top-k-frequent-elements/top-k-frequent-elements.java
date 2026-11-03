class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> dict = new HashMap<>();

        for (int num : nums) {
            dict.put(num, dict.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return Integer.compare(a[0], b[0]);
        });

        for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {

            int[] newPair = {
                    entry.getValue(),
                    entry.getKey()
            };

            pq.offer(newPair);
            if (pq.size() > k)
                pq.poll();
        }

        int[] res = new int[k];
        int j = 0;

        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[1];
        }

        return res;
    }
}