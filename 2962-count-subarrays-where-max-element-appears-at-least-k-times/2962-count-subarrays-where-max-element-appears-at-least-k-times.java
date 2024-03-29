class Solution {
    public long countSubarrays(int[] nums, int k) {
        int count=0;
        int max=Arrays.stream(nums).max().getAsInt();
        long ans=0;
        for(int i=0,j=0;i<nums.length;i++)
        {
            if(nums[i]==max)
            {
                count++;
            }
            while(count>=k)
            {
                ans+=(nums.length-i);
                if(nums[j]==max)
                {
                    count--;
                }
                j++;
            }
        }
        return ans;
    }
}