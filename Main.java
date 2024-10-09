class Solution {
    public int maxSubArray(int[] nums) {

        int current_max = nums[0];
        int max_value = nums[0];

        for(int i=1; i<nums.length; i++){
            current_max = Math.max(nums[i], nums[i] + current_max);
            max_value = Math.max(max_value, current_max);
        }
        return max_value;

    }
}