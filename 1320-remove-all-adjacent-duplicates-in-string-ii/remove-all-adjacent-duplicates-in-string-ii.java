class Solution {
    class Pair {
        char ch;
        int count;
        Pair(char ch,int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Deque<Pair>stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(stack.isEmpty() || stack.peek().ch != c) {
                stack.push(new Pair(c,1));
            } else {
                Pair top = stack.pop();
                if(top.count + 1 < k) {
                    top.count++;
                    stack.push(top);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) {
            Pair top = stack.pop();
            ans.append(String.valueOf(top.ch).repeat(top.count));
        }
        return ans.reverse().toString();
    }
}