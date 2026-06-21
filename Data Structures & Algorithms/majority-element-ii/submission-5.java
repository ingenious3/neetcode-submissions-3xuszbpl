class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();
        for (int key: count.keySet()) {
            if (count.get(key) > nums.length/3) {
                ans.add(key);
            }
        }
        return ans;
    }
}