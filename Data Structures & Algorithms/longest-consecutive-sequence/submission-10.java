class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int maxL = 1;
        int cL = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                continue;
            } else if (nums[i] == nums[i-1]+1) {
                cL++;
                maxL = Math.max(maxL, cL);
            } else {
                cL = 1;
            }
        }
        return maxL;
    }
}
