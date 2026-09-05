class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for (int n : nums) {
            if (count == 0) {
                res = n;
                count = 1;
            } if (res == n) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }
}