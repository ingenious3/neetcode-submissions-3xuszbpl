class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length <= 1) {
            return false;
        }
        
        int sum = 0;
        for (int n: nums) {
            sum+=n;
        }
        for (int n: nums) {
            if (sum%k == 0) {
                return true;
            }
            sum -= n;
        }
        return false;


    }
}