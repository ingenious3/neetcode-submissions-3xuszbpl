public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int d = target-n;
            if (map.containsKey(d)) {
                return new int[]{map.get(d), i};
            }
            map.put(n, i);
        }
        return new int[]{};
    }
}

/*

for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};

*/        