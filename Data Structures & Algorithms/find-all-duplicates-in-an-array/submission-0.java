class Solution {
    public int[] findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num: nums) {
            int idx = Math.abs(num)-1;
            if (nums[idx] < 0) {
                res.add(Math.abs(num));
            }
            nums[idx] = -nums[idx];
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
