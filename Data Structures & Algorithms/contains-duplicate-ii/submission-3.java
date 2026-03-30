class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(i);
                map.put(nums[i], al);
            }
        }
        for (Map.Entry<Integer, ArrayList<Integer>> mapEntry: map.entrySet()) {
            ArrayList<Integer> al = mapEntry.getValue();
            if (al.size() > 1) {
                for (int i = 1; i < al.size(); i++) {
                    if (al.get(i)-al.get(i-1) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}