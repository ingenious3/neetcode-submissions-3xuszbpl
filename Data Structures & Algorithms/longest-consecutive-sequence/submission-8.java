class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int maxL = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, map.getOrDefault(n-1,0)+map.getOrDefault(n+1,0)+1);
                map.put(n-map.getOrDefault(n-1,0), map.get(n));
                map.put(n+map.getOrDefault(n+1,0), map.get(n));
                maxL = Math.max(maxL, map.get(n));
            }
        }

        return maxL;
        /*
        Arrays.sort(nums);
        int maxL = 1;
        int cL = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                continue;
            }
            if (nums[i] == nums[i-1]+1) {
                cL++;
                maxL = Math.max(cL, maxL);
            } else {
                cL = 1;
            }
        }
        return maxL;
        */
    }
}
