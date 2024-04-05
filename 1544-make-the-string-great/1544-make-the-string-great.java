class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        st.add(s.charAt(0));
        String ans="";
        for(int i=1;i<s.length();i++)
        {
            if(st.size()>0)
            {
                if(Math.abs(st.peek()-s.charAt(i))==32)
                {
                    //Aa
                    st.pop();
                }
                else
                {
                    st.add(s.charAt(i));
                } 
            }
            else
            {
                st.add(s.charAt(i));
            } 
        }
        while(st.size()>0)
        {
            ans=st.pop()+ans;
        }
        return ans;
    }
}