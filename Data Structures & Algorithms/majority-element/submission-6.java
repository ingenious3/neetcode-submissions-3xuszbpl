class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;
        for (int n : nums) {
            if (count == 0) {
                count = 1;
                res = n;
            } else if (res == n) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }
}