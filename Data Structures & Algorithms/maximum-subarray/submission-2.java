class Solution {
    public int maxSubArray(int[] nums) {
        int maxS = nums[0];
        int maxE = 0;
        for (int n: nums) {
            if (maxE < 0) {
                maxE = 0;
            }
            maxE += n;
            maxS = Math.max(maxS, maxE);
        }
        return maxS;
    }
}
