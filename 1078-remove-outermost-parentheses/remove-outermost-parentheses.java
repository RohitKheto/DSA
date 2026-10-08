class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder res = new StringBuilder("");
       int count = 0;
        for(Character c : s.toCharArray()) {
            if(c == '(') {
                if(count != 0) res.append("(");
                count++;
            } else {
                count--;
                if(count!=0) res.append(")");
            }
        }
        return res.toString();

    }
}