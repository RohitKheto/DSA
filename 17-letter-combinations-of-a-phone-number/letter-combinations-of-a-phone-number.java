class Solution {
    private void helper(final List<String> ans,final String digits, final String[] letters, int index, StringBuilder combination) {
        if(index == digits.length()) {
            ans.add(combination.toString());
            return;
        }
        for(char c : letters[digits.charAt(index) - '0'].toCharArray()) {
            combination.append(c);
            helper(ans,digits,letters,index+1,combination);
            combination.deleteCharAt(index);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        StringBuilder combination = new StringBuilder("");
        helper(ans,digits,letters,0,combination);
        return ans;
    }
}
