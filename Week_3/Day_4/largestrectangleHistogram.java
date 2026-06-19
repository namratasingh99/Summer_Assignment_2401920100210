class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int currHeight , left;
        for(int i = 0; i <= heights.length; i++) {
            if(i==heights.length)   currHeight=0;
            else  currHeight=heights[i];
            while(!stack.isEmpty() &&  currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                if(stack.isEmpty())  left=-1;
                else  left=stack.peek();
                int width = i - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
