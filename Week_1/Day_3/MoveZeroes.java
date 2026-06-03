class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int k=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==0){
              ++count;
            }
            else{
              nums[k]=nums[i];
              k++;
            }
        }
        for(int i=k; i<nums.length ; i++){
            nums[i]=0;
        }
    }
}
