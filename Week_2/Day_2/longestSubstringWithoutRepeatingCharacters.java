class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        int max=0;
        String sub ="";
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(sub.contains(Character.toString(ch))){
                int idx = sub.indexOf(ch);
                sub=sub.substring(idx+1,sub.length())+ch;
                length=sub.length();
            }
            else{
                length++;
                sub+=ch;
            }
            if(length>max){
                max=length;
            }
        }
        return max;
    }
}
