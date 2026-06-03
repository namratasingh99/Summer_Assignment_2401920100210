class Solution {
    public int[] sortedSquares(int[] nums) {
         int[] arr = new int[nums.length];
         int i=0,j=nums.length-1;
         int k=arr.length-1;;
         while (i<=j){
            int m=nums[i]*nums[i];
            int n=nums[j]*nums[j];
            arr[k]=Math.max(m,n);
            k--;
            if(m>n) i++;
            else j--;
         }
    
        return arr;
    }
}
