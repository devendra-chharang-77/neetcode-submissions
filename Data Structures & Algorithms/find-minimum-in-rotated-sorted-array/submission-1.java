class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            if (nums[left] < nums[right]) {
                // pura segment already sorted hai
                return nums[left];
            }
            
            int mid = left + (right - left) / 2;
            
            if (nums[left] <= nums[mid]) {
                // left se mid tak sorted hai, minimum right side mein hoga
                left = mid + 1;
            } else {
                // mid khud minimum ho sakta hai ya uske left mein
                right = mid;
            }
        }
        
        return nums[left];
    }
}