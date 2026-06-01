class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=i+1,k=0;
        while(i<=j&&j<nums.length){
            if(nums[i]==nums[j]){
               i++;
               j++;
            }
            else {
                nums[k]=nums[i];
                i++;
                j++;
                k++;
            }
        }
        nums[k]=nums[i];
        return ++k;
    }
}
