class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k = 0;

    public KthLargest(int k, int[] nums) {
        for (int num: nums) {
            pq.offer(num);
        }
        this.k = k;
    }
    
    public int add(int val) {
        pq.offer(val);
        while (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }
}
