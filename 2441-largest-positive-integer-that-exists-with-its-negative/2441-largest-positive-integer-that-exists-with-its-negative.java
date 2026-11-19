class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
           
            if (set.contains(-nums[i])) {
                max = Math.max(max, Math.abs(nums[i]));
            }
           
            set.add(nums[i]);
        }
        return max;
    }
}
