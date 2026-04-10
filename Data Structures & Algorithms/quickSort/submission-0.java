// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        quickSort(pairs, 0, pairs.size() - 1);
        return pairs;
    }

    public static void quickSort(List<Pair> pairs, int left, int right) {
        if (left < right) {
            int pivotIndex = getPivotIndex(pairs, left, right);
            quickSort(pairs, left, pivotIndex - 1);
            quickSort(pairs, pivotIndex + 1, right);
        }
    }

    public static int getPivotIndex(List<Pair> pairs, int left, int right) {
        int pivot = pairs.get(right).key;
        int i = left - 1;
        for (int j = i + 1; j < right; j++) {
            if(pairs.get(j).key < pivot) {
                i++;
                swapPairs(pairs, i, j);
            }
        }
        i++;
        swapPairs(pairs, i, right);
        return i;
    }

    public static void swapPairs(List<Pair> pairs, int i, int j) {
        Pair temp = pairs.get(i);
        pairs.set(i, pairs.get(j));
        pairs.set(j, temp);
    }
}
