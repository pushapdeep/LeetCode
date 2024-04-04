class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int max=-1;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)==')')
            {
                if(s.charAt(i)=='(')
                {
                    st.push('(');
                    ans++;
                }
                else
                {
                    ans--;
                    st.pop();
                }
            }
            if(st.size()==0)
            {
                ans=0;
            }
            max=Math.max(max,ans);
        }
        return max;
    }
}