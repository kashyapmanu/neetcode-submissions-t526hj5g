class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] keyArr = new int[26];
            char[] charArr = str.toCharArray();
            int sum = 0;
            String key;
            for (int charr: charArr) {
                keyArr[charr - 'a']++;
            }
            key = Arrays.toString(keyArr);

                if (map.containsKey(key)) {
                    map.get(key).add(str);
                } else {
                    List<String> strList = new ArrayList<>();
                    strList.add(str);
                    map.put(key, strList);
                }
            
        }

        return map.values().stream().collect(Collectors.toList());
        
    }
}
