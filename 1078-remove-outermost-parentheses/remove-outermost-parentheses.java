class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();
       StringBuilder res = new StringBuilder("");
        for(Character c : s.toCharArray()) {
            if(c == '(') {
                if(!stack.isEmpty()) res.append("(");
                stack.push('(');
            } else {
                stack.pop();
                if(!stack.isEmpty()) res.append(")");
            }
        }
        return res.toString();

    }
}