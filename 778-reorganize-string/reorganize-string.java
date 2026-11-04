class Solution {
    class Pair {
        Character c;
        Integer f;
        Pair(Character c, Integer f) {
            this.c = c;
            this.f = f;
        }
    }

    public String reorganizeString(String s) {
        // 1. Count frequencies of each character
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        // 2. Define the Max-Heap PriorityQueue
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> 
            Objects.equals(a.f, b.f) ? b.c - a.c : b.f - a.f
        );

        // 3. Add all valid character pairs to the heap
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        // 4. Reconstruct the string greedily
        StringBuilder sb = new StringBuilder();
        Pair block = null; // Holds the character used in the previous step

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            sb.append(current.c);
            current.f--; // Reduce its frequency

            // If a previous character was waiting to be re-added, put it back now
            if (block != null && block.f > 0) {
                pq.add(block);
            }

            // Hold the current character back so it isn't picked immediately next
            block = current;
        }

        // 5. If the final string length matches original, it's valid; otherwise return ""
        return sb.length() == s.length() ? sb.toString() : "";
    }
}
