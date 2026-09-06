class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));
        List<int[]> res= new ArrayList<>();
        int st = intervals[0][0];
        int et = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];
            if (et < s) {
                res.add(new int[]{st, et});
                st = s;
                et = e;
            } else {
                et = Math.max(et, e);
            }
        }
        res.add(new int[]{st, et});
        int[][] ans = new int[res.size()][2];
        int i = 0;
        for (int[] itv: res) {
            ans[i][0] = itv[0];
            ans[i][1] = itv[1];
            i++;
        }
        return ans;

    }
}
