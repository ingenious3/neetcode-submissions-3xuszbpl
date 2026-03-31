class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int n: nums) {
        map.put(n, map.getOrDefault(n, 0)+1);
       }

       PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));

       for (Map.Entry<Integer, Integer> mapEntry: map.entrySet()) {
        pq.offer(mapEntry);
        if (pq.size()>k) {
            pq.poll();
        }
       }
       
       int[] res = new int[pq.size()];
       int i = 0;
       while (pq.size() > 0) {
        res[i] = pq.poll().getKey();
        i++;
       }
       return res;
    }
}
