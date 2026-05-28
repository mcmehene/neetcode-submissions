class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> numLetS = new HashMap<>();
        Map<Character,Integer> numLetT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            if (numLetS.containsKey(l)) {
                numLetS.put(l,numLetS.get(l) + 1);
            } else {
                numLetS.put(l,1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char l = t.charAt(j);
            if (numLetT.containsKey(l)) {
                numLetT.put(l,numLetT.get(l) + 1);
            } else {
                numLetT.put(l,1);
            }
        }

        return numLetS.equals(numLetT);
    }
}
