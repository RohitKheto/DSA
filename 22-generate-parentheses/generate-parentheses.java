class Solution {

    void dfs(
        int opened, int closed, int n, List<String> res,
        StringBuilder sb
    ) {
        if(opened == closed && opened == n) {
            res.add(sb.toString());
            return;
        }
        if(opened < n) { 
            sb.append('(');
            dfs(opened + 1, closed, n, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(opened > closed) {
            sb.append(')');
            dfs(opened, closed + 1, n, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(0, 0, n, res, new StringBuilder());
        return res;
    }
}