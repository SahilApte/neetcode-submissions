class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s: strs){
            int ch[]=new int[26];
            for(int i=0;i<s.length();i++){
                ch[s.charAt(i)-'a']++;
            }
            String key = Arrays.toString(ch);
            hm.computeIfAbsent(key,k->new ArrayList<>()).add(s);

        }
        return new ArrayList<>(hm.values());
    }
}
