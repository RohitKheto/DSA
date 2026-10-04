class Solution {
    public int totalFruit(int[] fruits) {
        int tree1 = -1, tree2 = -1;
        int tree1Loc = -1, tree2Loc = -1;
        int low = 0, ans = 0;
        
        for (int high = 0; high < fruits.length; high++) {
            if (tree1 == -1 || fruits[high] == tree1) {
                tree1 = fruits[high];
                tree1Loc = high;
            } else if (tree2 == -1 || fruits[high] == tree2) {
                tree2 = fruits[high];
                tree2Loc = high;
            } else {
                if (tree1Loc < tree2Loc) {
                    low = tree1Loc + 1;
                    tree1 = fruits[high];
                    tree1Loc = high;
                } else {
                    low = tree2Loc + 1;
                    tree2 = fruits[high];
                    tree2Loc = high;
                }
            }
            ans = Math.max(ans, high - low + 1);
        }
        return ans;
    }
}
