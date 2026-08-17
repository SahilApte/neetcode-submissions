class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm  = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            String key = strs[i];
            char[] cr = key.toCharArray();
            Arrays.sort(cr);
            String sortedKey = new String(cr);
            if(!hm.containsKey(sortedKey)){
                hm.put(sortedKey,new ArrayList<>());
            }
            hm.get(sortedKey).add(key);
        }
        return new ArrayList<>(hm.values());    
    }
}
