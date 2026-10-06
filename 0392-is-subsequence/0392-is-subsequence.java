class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.length() == 0){
                break;
            }
            if (t.charAt(i) == s.charAt(idx)){
                idx++;
            }
            if (idx == s.length()){
                break;
            }
        }
        if(idx == s.length()){
            return true;
        }
        return false;
    }
}