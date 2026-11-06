class Solution {
    class Task {
        Integer count;
        Integer nextInterval;

        Task(Integer count, Integer nextInterval) {
            this.count = count;
            this.nextInterval = nextInterval;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks) {
            freq[task - 'A']++;
        }

        PriorityQueue<Task> pq = new PriorityQueue<>((a,b)-> {
            if(a.nextInterval.equals(b.nextInterval))
                return b.count - a.count;
            return a.nextInterval - b.nextInterval;
        });

        for(int count : freq) {
            if(count == 0) continue;
            pq.add(new Task(count,1));
        }

        int interval = 0;
        while(!pq.isEmpty()) {
            interval++;
            Task task = pq.poll();
            if(task.nextInterval <= interval) {
                task.count--;
                task.nextInterval += n + 1;
                if(task.count > 0) {
                    pq.add(task);
                }
            } else {
                pq.add(task);
            }
        }
        return interval;
    }
}
