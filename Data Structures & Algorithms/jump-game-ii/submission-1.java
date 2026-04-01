class Solution {
    public int jump(int[] nums) {
        // int res = 0, l = 0, r = 0;

        // while (r < nums.length-1) {
        //     int farthest = 0;
        //     for (int i = l; i <=r; i++) {
        //         farthest = Math.max(farthest, i+nums[i]);
        //     }
        //     l = r+1;
        //     r = farthest;
        //     res++;
        // }
        // return res;

        int jumps = 0;
        int currEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currEnd) {
                jumps++;
                currEnd = farthest;
            }
        }

        return jumps;
    }
}
