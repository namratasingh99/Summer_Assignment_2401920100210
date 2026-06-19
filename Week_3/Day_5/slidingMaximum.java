class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> queue = new LinkedList<>();
        int idx=0;
        for(int i=0 ; i<nums.length ; i++){
            while(!queue.isEmpty() && queue.peekFirst()<=i-k){
                queue.pollFirst();
            }
            while(!queue.isEmpty()&&nums[queue.peekLast()]<nums[i]){
                queue.pollLast();
            }
            queue.offerLast(i);
            if(i>=k-1) ans[idx++] = nums[queue.peekFirst()];
        }
        return ans;
    }
}
