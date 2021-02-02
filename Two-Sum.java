class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] arr=new int[2];
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]+nums[i]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}
