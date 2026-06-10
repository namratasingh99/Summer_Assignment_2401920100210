class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1; i<=s.length()/2 ; i++){
            if(s.length()%i!=0)  continue;
            String res = s.substring(0,i);
            int j=0 ;
            while(j<s.length()){
                int idx=j%res.length();
                if(s.charAt(j)!=res.charAt(idx)){
                     break;
                }
                j++;
            }
            if(j==s.length()){
                return true;
            }
        }  
        return false;   
    }
}
