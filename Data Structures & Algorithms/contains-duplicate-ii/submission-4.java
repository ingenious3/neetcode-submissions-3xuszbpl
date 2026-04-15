class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                List<Integer> al = new ArrayList<>();
                al.add(i);
                map.put(nums[i], al);
            } 
        }

        for (Map.Entry<Integer, List<Integer>> mapEntry: map.entrySet()) {
            List<Integer> al = mapEntry.getValue();
            if (al.size() > 1) {
                for (int i = 1; i < al.size(); i++) {
                    if (al.get(i) - al.get(i-1) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}