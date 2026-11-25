class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing((int[] itv)-> itv[1]));
        int t = intervals[0][1];
        int ans = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]>=t) {
                t = intervals[i][1];
            } else {
                ans++;
            }
        }
        return ans;
    }
}
