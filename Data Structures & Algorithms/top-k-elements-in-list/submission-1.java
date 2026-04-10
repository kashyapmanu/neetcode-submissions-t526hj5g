class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a map to store the count
        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Create a priority queue
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[0] - b[0]);

        // Store the entries from the map in the priority queue
        // Pop the min item from the queue once the size reaches more than k
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            queue.offer(new int[]{entry.getValue(), entry.getKey()});
            if (queue.size() > k) {
                queue.poll();
            }
        }

        // Return k elements from the priority queue or min heap
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[1];
        }

        return res;
    }
}
