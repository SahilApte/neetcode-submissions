class Solution {
    public boolean isValid(String s) {
        if(s.length()==0||s.length()==1)return false;
        Map<Character, Character> hm = new HashMap<>();
        Stack<Character> res = new Stack<>();
        hm.put(')', '(');
        hm.put('}', '{');
        hm.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
    
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                res.push(s.charAt(i));
            } 
            else{
                if(res.isEmpty()||hm.get(s.charAt(i)) != res.pop()) {
                    return false;
            }}}
        
        
        return res.isEmpty();
    }
}
