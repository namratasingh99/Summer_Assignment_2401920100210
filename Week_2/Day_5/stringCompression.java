class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        String ans = "";
        int i=0 ,j=0;
        while(j<n){
            char curr = chars[j];
            int count=0;
            while(j<n && curr==chars[j]){
                count++;
                j++;
            }
            chars[i]=curr;
            i++;
            if(count>1){
                for(char c :String.valueOf(count).toCharArray()){
                    chars[i]=c;
                    i++;
                }
            }
            
        }
        return i;
    }
}
