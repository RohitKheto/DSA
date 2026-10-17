class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(Character c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                Character ch = stack.pop();
                if(c == ')' && ch != '(') return false;
                if(c == '}' && ch != '{') return false;
                if(c == ']' && ch != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}