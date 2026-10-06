class Solution {

    //SC = O(n), TC = O(n)
    private int algoUsingStack(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int res = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') stack.push(ch);
            else {
                Character top = stack.peek();
                if(top != null) stack.pop();
                else res++;
            }
        }
       
        return res + stack.size();
    }

    //SC = O(1), TC = O(n)
    private int algoWithoutUsingStack(String s) {
        int res = 0, open = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') open++;
            else if (open > 0) open--;
            else res++;
        }
       
        return res + open;
    }

    public int minAddToMakeValid(String s) {
       return algoWithoutUsingStack(s);
    }
}