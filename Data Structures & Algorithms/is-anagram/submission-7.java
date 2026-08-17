class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] chaS = s.toCharArray();
        char[] chaT = t.toCharArray();

        Arrays.sort(chaS);
        Arrays.sort(chaT);

        for(int i=0;i<chaS.length;i++){
            if(chaS[i]!=chaT[i])
                return false;
        }
        return true;

    }
}
