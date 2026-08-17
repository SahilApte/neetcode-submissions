class Solution {
    public boolean isAnagram(String s, String t) {
            TreeMap<Character,Integer> tm = new TreeMap<>();
            TreeMap<Character,Integer> tm2 = new TreeMap<>();
            for(int i=0;i<s.length();i++){
                if(!tm.containsKey(s.charAt(i)))
                    tm.put(s.charAt(i),1);
                else
                    tm.put(s.charAt(i),tm.get(s.charAt(i))+1);
            }

            for(int i=0;i<t.length();i++){
                if(!tm2.containsKey(t.charAt(i)))
                    tm2.put(t.charAt(i),1);
                else
                    tm2.put(t.charAt(i),tm2.get(t.charAt(i))+1);
            }

            return tm.equals(tm2);
    }
}
