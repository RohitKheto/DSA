class Solution {
    // Using stack 
    private String stackMethod(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(st.isEmpty() || st.peek() != c)
                st.push(c);
            else 
                st.pop();
        }
        StringBuilder res = new StringBuilder();
        for(char c : st)
            res.append(c);
        return res.reverse().toString();   
    }

    // Without using stack 
    private String withoutStackMethod(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        res.append(s.charAt(0));
        for(int j = 1; j < s.length(); j++){
            if(i < 0 || res.charAt(i) != s.charAt(j)) {
                res.append(s.charAt(j));
                i++;
            } else {
                res.deleteCharAt(i--);
            }
        }
       
        return res.toString();   
    }

    public String removeDuplicates(String s) {
        // return stackMethod(s);
        return withoutStackMethod(s);
    }
}