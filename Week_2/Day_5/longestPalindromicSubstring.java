class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2) return s;
        int front , back;
        String longPal = s.substring(0,1);
        for(int i=1 ; i<s.length() ; i++){
            back=i;
            front=i;
            while(front>=0 && back<s.length() &&s.charAt(back)==s.charAt(front)){
                front--;
                back++;
            }
            String Pal=s.substring(front+1,back);
            if(Pal.length()>longPal.length()){
                longPal = Pal;
            }
            front=i-1;
            back=i;
            while(front>=0 && back<s.length() &&s.charAt(back)==s.charAt(front)){
                back++;
                front--;
            }
            Pal=s.substring(front+1,back);
            if(Pal.length()>longPal.length()){
                longPal = Pal;
            }
        }
        return longPal;
    }
}
