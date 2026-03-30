class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int x = newInterval[0];
        int y = newInterval[1];
        List<int[]> ans = new ArrayList<>();
        for (int[] itv : intervals) {
            int a = itv[0];
            int b = itv[1];
            if (b < x) {
                ans.add(itv);
            } else if (a > y) {
                ans.add(new int[]{x,y});
                x = a;
                y = b;
            } else if ((a <= x && b <= y) || (a<=x && y<=b)) {
                x = Math.min(a,x);
                y = Math.max(y,b);
            } else if (x < a && y >= a && y<=b ) {
                y = Math.max(y, b);
            }
        }
        ans.add(new int[]{x,y});
        int[][] res = new int[ans.size()][2];
        int i = 0;
        for (int[] itv: ans) {
            res[i][0] = itv[0];
            res[i][1] = itv[1];
            i++;
        }
        return res;
    }
}
