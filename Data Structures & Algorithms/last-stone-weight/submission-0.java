class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            int heavy1 = pq.poll();
            int heavy2 = pq.poll();
            if (heavy1 != heavy2) {
                pq.offer(heavy1 - heavy2);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
