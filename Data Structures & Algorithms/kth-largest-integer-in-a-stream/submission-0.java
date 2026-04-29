class KthLargest {

    List<Integer> numsList = new ArrayList<>();
    int k = 0;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            numsList.add(nums[i]);
        }    
    }
    
    public int add(int val) {
        numsList.add(val);
        numsList.sort(Collections.reverseOrder());
        return numsList.get(k - 1);
    }
}
