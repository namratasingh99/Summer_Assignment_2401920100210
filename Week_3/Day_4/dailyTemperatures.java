class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        int i=0 ;
        while(i<n){
            while (!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int ele = stack.pop();
                ans[ele]=i-ele;
            }
            stack.push(i);
            i++;
        }
        return ans;
    }
}
