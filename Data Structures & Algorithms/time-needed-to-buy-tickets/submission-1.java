class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int res = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                res += Math.min(tickets[i], tickets[k]);
            } else {
                res += Math.min(tickets[i], tickets[k]-1);
            }
        }    
        return res;
    

        // int n = tickets.length;
        // Queue<Integer> q = new LinkedList<>();
        // for (int i = 0; i < n; i++) {
        //     q.add(i);
        // }
        // int time = 0;
        // while (!q.isEmpty()) {
        //     time++;
        //     int curr = q.poll();
        //     tickets[curr]--;
        //     if (tickets[curr] == 0) {
        //         if (curr == k) {
        //             return time;
        //         }
        //     } else {
        //         q.add(curr);
        //     }
        // }
        // return time;
    }
}