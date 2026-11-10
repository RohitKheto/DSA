class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper, 0, target, new ArrayList<>(), res);

        return res;
    }

    private void helper(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = start; i < candidates.length; i++) {
            if(target - candidates[i] < 0) {
                continue;
            }
            list.add(candidates[i]);
            helper, i, target - candidates[i], list, res);
            list.remove(list.size() - 1);
        }
    }
}
