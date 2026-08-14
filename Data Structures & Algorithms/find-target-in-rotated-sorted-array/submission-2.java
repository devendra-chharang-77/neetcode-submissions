class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // Check karo left half (left se mid tak) sorted hai ya nahi
            if (nums[left] <= nums[mid]) {
                // Left half sorted hai
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // target left half mein hai
                } else {
                    left = mid + 1; // target right half mein hai
                }
            } else {
                // Right half sorted hai
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // target right half mein hai
                } else {
                    right = mid - 1; // target left half mein hai
                }
            }
        }
        
        return -1;
    }
}