class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
}
