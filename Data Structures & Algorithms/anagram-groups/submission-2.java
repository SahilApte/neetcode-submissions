class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();

            for(String key:strs){
                char[]ch=key.toCharArray();
            Arrays.sort(ch);
            String sortedKey= new String(ch);
            if(!hm.containsKey(sortedKey)){
                hm.put(sortedKey,new ArrayList<>());
            }
            hm.get(sortedKey).add(key);
        }
        return new ArrayList<>(hm.values());
        
    }
}
