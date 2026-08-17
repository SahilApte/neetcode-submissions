class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        if(s.length()==0) return true;

        int[] arr = new int[26];

        //for each occurence of letter in s +1, for t -1
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a'] += 1;
            arr[t.charAt(i) - 'a'] -= 1;
        }

        for(int n : arr){
            if(n != 0) return false;
        }
        return true;
    }
}
