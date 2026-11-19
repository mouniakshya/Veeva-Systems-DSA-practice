class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int sum=nums[0];
        for(int i=0;i<n-1;i++){
            arr[i]=sum;
            sum=sum+nums[i+1];
        }
        arr[n-1]=sum;
        return arr;
    }
}