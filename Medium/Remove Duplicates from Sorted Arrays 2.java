class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<3)
            return n;
        int j=0;
        for(int i=0;i<n-2;i++){
            if(nums[i]!=nums[i+2])
            {nums[j]=nums[i];
                j++;
            }
        }
        nums[j++]=nums[n-2];
        nums[j++]=nums[n-1];
        return j;
    }
}
