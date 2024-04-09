class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q=new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++)
        {
            q.add(new int[]{i,tickets[i]});
        }
        int count=0;
        while(q.size()>0)
        {
            count++;
            if(q.peek()[0]==k && q.peek()[1]==1)
            {
                return count;
            }
            if(q.peek()[1]>1)
            {
                q.add(new int[]{q.peek()[0],q.peek()[1]-1});
            }
            q.remove();
        }
        return count;
    }
}