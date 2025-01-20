class Solution {
    public int search(int[] nums, int target) {
        int front = 0;
        int end = nums.length - 1;

        while (front <= end) {
            int mid = (front + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target > nums[mid]) {
                front = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}