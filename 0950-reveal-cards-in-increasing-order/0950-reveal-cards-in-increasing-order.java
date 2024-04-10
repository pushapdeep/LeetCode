class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<deck.length;i++)
        {
            q.add(i);
        }
        int arr[]=new int[deck.length];
        int i=0;
        while(q.size()>0)
        {
            arr[q.remove()]=deck[i++];
            if(q.size()>0)
            {
                q.add(q.remove());
            }
        }
        return arr;
    }
}