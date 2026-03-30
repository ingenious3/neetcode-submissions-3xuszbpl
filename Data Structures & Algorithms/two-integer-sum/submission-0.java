public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int d = target - n;
            if (prevMap.containsKey(d)) {
                return new int[] {prevMap.get(d), i};
            }
            prevMap.put(n, i);
        }
        return new int[] {};
    }
}