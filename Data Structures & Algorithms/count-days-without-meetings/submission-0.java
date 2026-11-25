class Solution {
    public int countDays(int days, int[][] meetings) {

        if (meetings == null || meetings.length == 0) {
            return days;
        }
        Arrays.sort(meetings, Comparator.comparing((int[] itv)-> itv[0]));
        int last = 0;
        int free = 0;
        for (int[] meeting: meetings) {
            if (meeting[0] > last + 1) {
                free += meeting[0]-last-1;
            }
            last = Math.max(last, meeting[1]);
        }
        return free+days-last;

    }
}
