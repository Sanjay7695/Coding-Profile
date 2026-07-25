class Solution {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1, i = 0;
        while (i <= r) {
            if (nums[i] == 0) swap(nums, l++, i++);
            else if (nums[i] == 2) swap(nums, i, r--);
            else i++;
        }
    }
    void swap(int[] nums, int i, int j) {
        int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
    }
}
