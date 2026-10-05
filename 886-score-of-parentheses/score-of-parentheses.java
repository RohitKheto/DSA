import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int scoreOfParentheses(String s) {
        // Change to Integer stack so it can safely hold both our flag (-1) and scores
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(-1); // Use -1 as a placeholder/flag for '('
            } else {
                int score = 0;
                // Accumulate all inner scores until we hit the matching '(' flag (-1)
                while (stack.peek() != -1) {
                    score += stack.pop();
                }
                stack.pop(); // Remove the '(' flag (-1)
                
                // If score is 0, it was "()", which equals 1. Otherwise, it's score * 2.
                stack.push(Math.max(1, score * 2));
            }
        }
        
        // Sum up any remaining scores at the top level
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        
        return res;
    }
}
