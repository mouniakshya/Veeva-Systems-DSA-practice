class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE; // Tracks the smallest positive sum
        
        for (int i = 0; i < n; i++) {
            int c = 0;
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + nums.get(j); // Add current element
                c++;                     // Increase subarray length
                
                // Check if length is between l and r AND sum is strictly positive
                if (c >= l && c <= r && sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }
        
        // If minSum was never updated, no valid subarray existed
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
