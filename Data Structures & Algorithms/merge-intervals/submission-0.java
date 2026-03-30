class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));
        List<int[]> ans = new ArrayList<>();
        int st = intervals[0][0];
        int et = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];
            if (et < s) {
                ans.add(new int[]{st, et});
                st = s;
                et = e;
            } else {
                et = Math.max(et, e);
            }
        }
        ans.add(new int[]{st, et});
        int[][] res = new int[ans.size()][2];
        int i = 0;
        for (int[] iv: ans) {
            res[i][0] = iv[0];
            res[i][1] = iv[1];
            i++;
        }
        return res;
    }
}
