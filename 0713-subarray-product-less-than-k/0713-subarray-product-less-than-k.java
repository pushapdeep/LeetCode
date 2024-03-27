class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0;
        int count=0;
        long prod=1;
        while(true)
        {
            boolean flag=false;
            boolean flag1=false;
            while(i<nums.length)
            {
                flag=true;
                prod=prod*nums[i];
                System.out.println(prod+" "+j+" "+i);
                if(prod<k)
                {
                    count+=i-j+1;
                }
                i++;
                if(prod>=k)
                {
                    break;
                }
            }
            while(j<i && prod>=k)
            {
                flag1=true;
                prod=prod/nums[j++];
                if(prod<k)
                {
                    count+=i-j; 
                    break;
                }
            }
            if(!flag && !flag1)
            {
                break;
            }
        }
        return count;
    }
}