class Solution {
    public String minRemoveToMakeValid(String s) {
        String ans="";
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='(' && s.charAt(i)!=')')
            {
                continue;
            }
            if(st.size()>0)
            {
                if(s.charAt(i)==')')
                {
                    if(s.charAt(st.peek())=='(')
                    {
                        st.pop();
                    }
                    else
                    {
                        st.push(i);
                    }
                }
                else
                {
                    st.push(i);
                }
            }
            else
            {
                st.push(i);
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            if(st.size()>0 && st.peek()==i)
            {
                st.pop();
                continue;
            }
            ans=s.charAt(i)+ans;
        }
        return ans;
    }
}