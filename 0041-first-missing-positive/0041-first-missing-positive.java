class Solution {
    public int firstMissingPositive(int[] nums) {
        //cyclic sort
        int i=0;
        while(i<nums.length)
        {
            int index=nums[i]-1;
            if(nums[i]<=nums.length && nums[i]>0 && nums[index]!=nums[i])
            {
                swap(nums,index,i);
            }
            else
            {
                i++;
            }
        }
        int n=1;
        for(i=0;i<nums.length;i++)
        {
            //System.out.println(n);
            if(n!=nums[i])
            {
                break;
            }
            n++;
        }
        return n;
    }

    public void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}