class Solution {
    public int minMoves(int[] nums) {
        int a=0;
        int max=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
         max=Math.max(nums[i],max);
        }
        for(int i=0;i<n;i++){
         a=a+Math.abs(max-nums[i]);
            
        }
        return a;
    }
}