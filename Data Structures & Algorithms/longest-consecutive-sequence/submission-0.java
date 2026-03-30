class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        Arrays.sort(nums);
        int maxL = 1;
        int cL = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                continue;
            } else if (nums[i-1]+1 == nums[i]) {
                cL++;
                maxL = Math.max(cL, maxL);
            } else {
                cL = 1;
            }
        }
        return maxL;
    }
}
