class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                int sum = nums[i]+nums[j]+nums[k];
                if (sum == 0) {
                    String key = nums[i]+"."+nums[j]+"."+nums[k];
                    if (!set.contains(key)) {
                        List<Integer> al = new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        res.add(al);
                        set.add(key);
                    }
                    j++;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}
