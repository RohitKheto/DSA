class Solution {
    public int minInsertions(String s) {
        int open_count = 0, insertion_count = 0;
        int n = s.length();
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '(') {
                open_count++;
            } else {
                //'(' check
                if(open_count > 0) open_count--;
                else insertion_count++;

                //consecutive ')' check
                if((i+1 < n) && s.charAt(i+1) == ')') i++;
                else insertion_count++;
            }
        }
        return insertion_count + (open_count * 2);
    }
}