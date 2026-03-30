class Solution {
    public void rotate(int[] nums, int k) {
        int order = k%nums.length;
        int a = nums.length - order;
        reverse(nums, 0, a-1);
        reverse(nums, a, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }

    private void reverse(int[] a, int s, int e) {
        if (a.length == 0 || a.length == 1) {
            return;
        }
        int temp = 0;
        while (s < e) {
            temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }

}