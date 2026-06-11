class Solution {
    public String reverseWords(String s) {
        String revWord;
        String[] str = s.split(" ");
        for(int i=0 ; i<str.length ; i++){
           int j=str[i].length()-1;
           revWord ="";
           while(j>=0){
               revWord += str[i].charAt(j);
               j--;
            }
         str[i] = revWord;
        }
      return String.join(" ",str);
    }
}
