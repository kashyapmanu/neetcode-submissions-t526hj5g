// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        // Call the merge sort.
        return mergeSortPairs(pairs, 0, pairs.size() - 1);
    }

    private List<Pair> mergeSortPairs(List<Pair> pairs, int left, int right) {
        // Base case.
        if (left < right) {
            // Find the middle.
            int middle = (left + right) / 2;
            // Call the merge sort for the left half.
            mergeSortPairs(pairs, left, middle);
            // Call the merge sort for the second half.
            mergeSortPairs(pairs, middle + 1, right);
            // Merge the sorted pairs.
            mergePairs(pairs, left, middle, right);
        }
        return pairs;
    }

    private void mergePairs(List<Pair> pairs, int left, int middle, int right) {
        // Create temp arrays to merge.
        List<Pair> lPair = new ArrayList<>(pairs.subList(left, middle + 1));
        List<Pair> rPair = new ArrayList<>(pairs.subList(middle + 1, right + 1));

        // Counters to compare the temp array.
        int i = 0;
        int j = 0;
        int k = left;

        // Compare and merge.
        while(i < lPair.size() && j < rPair.size()) {
            if (lPair.get(i).key <= rPair.get(j).key) {
                pairs.set(k++, lPair.get(i));
                i++;
            } else {
                pairs.set(k++, rPair.get(j));
                j++;
            }
        }

        // If anything remains in either left or right.
        while  (i < lPair.size()) {
            pairs.set(k++, lPair.get(i++));
        } 
        while (j < rPair.size()) {
            pairs.set(k++, rPair.get(j++));
        }
    }
}
