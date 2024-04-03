class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        boolean visited[][]=new boolean[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(word.charAt(0)==board[i][j])
                {
                    boolean ans=helper(board,i,j,word,0,visited);
                    if(ans)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, int i,int j, String word,int index,boolean visited[][])
    {
        
        if(index==word.length())
        {
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j] || board[i][j]!=word.charAt(index))
        {
            return false;
        }

        
        visited[i][j]=true;
        boolean ans1=helper(board,i+1,j,word,index+1,visited);
        boolean ans2=helper(board,i-1,j,word,index+1,visited);
        boolean ans3=helper(board,i,j+1,word,index+1,visited);
        boolean ans4=helper(board,i,j-1,word,index+1,visited);
        visited[i][j]=false;
        return ans1 || ans2 || ans3 || ans4;
    }

}