class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int maxS = nums[0];
        int maxE = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maxE < 0) {
                maxE = 0;
            }
            maxE += nums[i];
            maxS = Math.max(maxS, maxE);
        }
        return maxS;
    }
}
