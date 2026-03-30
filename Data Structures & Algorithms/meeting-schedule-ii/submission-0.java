/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return 0;
        }
        if (intervals.size() == 1) {
            return 1;
        }
        Collections.sort(intervals, Comparator.comparing((Interval itv) -> itv.start));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int count=1;
        pq.offer(intervals.get(0).end);
        for (int i = 1; i < intervals.size(); i++ ) {
            if (intervals.get(i).start < pq.peek()) {
                count++;
            } else {
                pq.poll();
            }
            pq.offer(intervals.get(i).end);
        }
        return count;

    }
}
