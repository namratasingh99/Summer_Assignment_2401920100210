class Solution {
    public String decodeString(String s) {
          Stack<StringBuilder>strBuild=new Stack<>();
        Stack<Integer> stack =new Stack<>();
        StringBuilder str = new StringBuilder();
        int num = 0;
        for(char c : s.toCharArray()){
            if(c>='0' && c<='9'){
                num = num*10 +c -'0';
            }
            else if(c=='['){
                strBuild.push(str);
                str=new StringBuilder();
                stack.push(num);
                num = 0;
            }else if(c==']'){
                StringBuilder temp=str;
                str=strBuild.pop();
                int count= stack.pop();
                while(count-- > 0){
                    str.append( temp );
                }
            }else{
                str.append(c);
            }
        }
        return str.toString();
    }
}
