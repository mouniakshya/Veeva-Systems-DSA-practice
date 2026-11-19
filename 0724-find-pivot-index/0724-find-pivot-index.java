class Solution {
    public int pivotIndex(int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;

        // First, fill 'r' with the total sum of the array
        for (int i = 0; i < n; i++) {
            r += nums[i];
        }

        // Slide the pivot from left to right
        for (int i = 0; i < n; i++) {
            r -= nums[i]; // Remove current pivot from the right sum
            
            if (l == r) {
                return i;
            }
            
            l += nums[i]; // Add current element to the left sum for the next step
        }

        return -1;
    }
}
