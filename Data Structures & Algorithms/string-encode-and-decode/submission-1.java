class Solution {

    public String encode(List<String> strs) {
        if(strs==null || strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
        sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> deco = new ArrayList<>();
        int i=0;

        while(i<str.length()){
            int hashInd = str.indexOf("#",i);
            String numsStr= str.substring(i,hashInd);
            int nums = Integer.parseInt(numsStr);
            int start = hashInd+1;
            int end = start +nums;
            String finalStr = str.substring(start,end);
            deco.add(finalStr);
            i = end;
        }
        return deco;


    }
}
