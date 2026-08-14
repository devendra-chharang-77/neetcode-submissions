class Solution {
    public int findMin(int[] nums) {
        int minNum = nums[0];
        for (int num : nums) {
            minNum = Math.min(minNum, num);
        }
        return minNum;
    }
}
