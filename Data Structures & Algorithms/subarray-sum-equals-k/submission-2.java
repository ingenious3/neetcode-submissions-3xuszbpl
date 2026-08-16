class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        cnt.put(0,1);
        int ans = 0;
        int s = 0;
        for (int x: nums) {
            s += x;
            ans += cnt.getOrDefault(s-k, 0);
            cnt.put(s, cnt.getOrDefault(s, 0)+1);
        }
        return ans;
    }
}