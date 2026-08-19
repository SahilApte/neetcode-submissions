class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> entry = new ArrayList<>( hm.entrySet());
        entry.sort((a,b)->b.getValue()-a.getValue());

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=entry.get(i).getKey();
        }

        return result;


        

        
    }
}
