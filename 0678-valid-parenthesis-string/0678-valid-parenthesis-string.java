class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open=new Stack<>();
        Stack<Integer> star=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open.push(i);
            }
            else if(s.charAt(i)=='*')
            {
                star.push(i);
            }
            else
            {
                if(open.size()>0)
                {
                    open.pop();
                }
                else if(star.size()>0)
                {
                    star.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        while(star.size()>0 && open.size()>0)
        {
            if(star.pop()<open.pop())
            {
                return false;
            }
        }
        return open.size()==0;
    }
}