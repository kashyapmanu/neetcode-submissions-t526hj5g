class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       /*
        Algorithm
        1) Create a hash map where each key is the sorted version of a string,
        and the value is a list of strings belonging to that anagram group.
        2) Iterate thhrough each string in the input list.
            2.1) Sort the characters of the string to form a key.
            2.2) Append the orginal string to the list corresponding to this key.
        3) After processing all the strings, return all values from the hash map which
        represent the grouped anagrams.
       */ 
       Map<String, List<String>> res = new HashMap<>();
       for (String s: strs) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedS = new String(charArray);
        res.putIfAbsent(sortedS, new ArrayList<>());
        res.get(sortedS).add(s);
       }
       return new ArrayList<>(res.values());
    }
}
