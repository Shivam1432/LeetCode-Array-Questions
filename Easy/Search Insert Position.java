class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                pos=i;
            }
        }
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)
            {
                break;
            }
        }
        if(pos>=0 && pos<nums.length)
        {
            return pos;
        }
        else
            return i;
    }
}
