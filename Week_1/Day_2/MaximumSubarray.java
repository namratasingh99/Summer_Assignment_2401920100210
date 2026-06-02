class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length-1;
        int max=nums[0] , current=nums[0];
       
        for(int i=1 ; i<=n ; i++){
            current=Math.max(nums[i],current+nums[i]);
            max=Math.max(max,current);
        }
    
        return max;
    }
}
