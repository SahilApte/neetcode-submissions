class Solution {
    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty())
            return "";
        StringBuilder encode = new StringBuilder();
        for (String s : strs) encode.append(s.length()).append('#').append(s);
        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
        if (str == null || str.isEmpty())
            return lst;
        int i = 0;

        while (i < str.length()) {
            int hashInd = str.indexOf('#', i);
            String numsStr = str.substring(i,hashInd);

            int nums =Integer.parseInt(numsStr);
            int start = hashInd + 1;
            int end = start + nums;
            String updatedString = str.substring(start, end);
            lst.add(updatedString);
            i=end;
        }
            return lst;
    }

}
