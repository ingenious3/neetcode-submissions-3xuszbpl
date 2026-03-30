class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int i = 0;
        while (i <= e && s < e) {
            if (nums[i] == 0) {
                nums[i] = nums[s];
                nums[s] = 0;
                s++;
                i++;
            } else if (nums[i] == 2) {
                nums[i] = nums[e];
                nums[e] = 2;
                e--;
            } else {
                i++;
            }
        }
    }
}