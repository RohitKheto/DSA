class Solution {
    private void generate(final List<String> ans, StringBuilder s, int open, int close) {
        if (open == 0 && close == 0) {
            ans.add(s.toString());
            return;
        }
        if (open > 0) {
            s.append("(");
            generate(ans, s, open - 1, close);
            s.deleteCharAt(s.length() - 1);
        }
        if (close > open) {
            s.append(')');
            generate(ans, s, open, close - 1);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder();
        List<String> ans = new ArrayList<>();
        generate(ans, s, n, n);
        return ans;
    }
}