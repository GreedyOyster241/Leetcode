class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if (!(i-1 < 0)) {
                nums[i] = nums[i] + nums[i-1];
            } else {
                
            }
            
        }
        return nums;
    }
}