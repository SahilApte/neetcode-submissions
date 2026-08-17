class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character, Integer> tm = new TreeMap<>();
        TreeMap<Character, Integer> tm2 = new TreeMap<>();
        if(s.length()!=t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            tm.put(s.charAt(i), tm.getOrDefault(s.charAt(i), 0) + 1);
            tm2.put(t.charAt(i), tm2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return tm.equals(tm2);
    }
}
