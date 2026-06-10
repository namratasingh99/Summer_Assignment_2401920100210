class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0 , j=0 ; 
        while(i<t.length())
        {
            char ch = t.charAt(i);
            if(j<s.length()&&ch==s.charAt(j)){
                j++;
            }
                i++;
        }
        if(j==(s.length())) return true;
        else return false;
    }
}
