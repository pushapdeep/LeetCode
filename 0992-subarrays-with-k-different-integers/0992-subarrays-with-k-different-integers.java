class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithKMax(nums,k)-subarraysWithKMax(nums,k-1);
    }
    
    public int subarraysWithKMax(int[] nums, int k)
    {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0,j=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k)
            {
                if(map.get(nums[j])==1)
                {
                    map.remove(nums[j]);
                }
                else
                {
                    map.put(nums[j],map.get(nums[j])-1);
                }
                j++;
            }
            count+=i-j+1;
        }
        return count;
    }
}