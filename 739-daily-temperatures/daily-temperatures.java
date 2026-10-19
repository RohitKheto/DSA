class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int[] res = new int[temperatures.length];
        for(int i = temperatures.length - 1; i >= 0; i--) {
            while(stack.peek() != -1 && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            res[i] = (stack.peek() == -1) ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return res;
    }
}