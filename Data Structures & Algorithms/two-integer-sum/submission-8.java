class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int d = target-n;
            if (map.containsKey(d)) {
                res[0] = map.get(d);
                res[1] = i;
                break;
            }
            map.put(n, i);
        }
        return res;
    }
}
