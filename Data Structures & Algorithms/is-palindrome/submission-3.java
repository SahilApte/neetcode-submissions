class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1)return true;
        String noss = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        // String noss = noS.toLowerCase();
        System.out.println(noss);
        int left=0;
        int right= noss.length()-1;
        while(left<right){
            if(noss.charAt(left)!=noss.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

        
    }
}
