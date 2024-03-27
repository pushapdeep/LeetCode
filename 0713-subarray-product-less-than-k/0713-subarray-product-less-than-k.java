class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0;
        int count=0;
        long prod=1;
        for(;i<nums.length;i++)
        {
            prod=prod*nums[i];
            while(j<=i && prod>=k)
            {
                prod=prod/nums[j++];
            }
            count+=i-j+1;
        }
        return count;
    }
}