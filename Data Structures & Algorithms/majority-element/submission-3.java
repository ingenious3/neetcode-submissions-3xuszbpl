class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;
        for (int n: nums) {
            if (count == 0) {
                res = n;
                count = 1;
            } else if (n  == res) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }
}