class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int cMin = 1, cMax = 1;
        for (int n: nums) {
            int t = cMax * n;
            cMax = Math.max(Math.max(n*cMax, n*cMin), n);
            cMin = Math.min(Math.min(t, n*cMin), n);
            res =  Math.max(res, cMax);
        }
        return res;
    }
}
