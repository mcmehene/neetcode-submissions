class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Get one word at a time, compare new word letter frequency
        // array to old word letter frequency array to see if they're 
        // equal. If they are, add word into that list, if not then 
        // create a new list. The key is the frequency of letters 
        // and then stored in HashMap with the value as the list of 
        // anagrams.

        Map<String,List<String>> angrmRecord = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            int[] freq = new int[26];
            
            for (int j = 0; j < strs[i].length(); j++) {
                freq[strs[i].charAt(j) - 'a']++;
            }
            String key = Arrays.toString(freq);
            List<String> angrmGroup = angrmRecord.getOrDefault(key, new ArrayList<>());
            
            angrmGroup.add(strs[i]);

            angrmRecord.put(key, angrmGroup);
        }

        return new ArrayList<>(angrmRecord.values());
    }
}
