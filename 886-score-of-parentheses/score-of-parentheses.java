class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(0);
            } else {
                int v = stack.pop(); 
                int w = stack.pop(); 
                stack.push(w + Math.max(1, 2 * v));
            }
        }
        return stack.peek();
    }
}
