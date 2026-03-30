class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n: nums1) {
            set.add(n);
        }
        List<Integer> list = new ArrayList<>();
        for (int n: nums2) {
            if (set.contains(n)) {
                list.add(n);
                set.remove(n);
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for (int n: list) {
            res[i] = n;
            i++;
        }
        return res;
    }
}