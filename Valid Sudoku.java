class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=0;j<m;j++){
                if(board[i][j]!='.'  && h.contains(board[i][j]) ) return false;
                if(board[i][j]!='.') h.add(board[i][j]);
            }
        }
        for(int i=0;i<m;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=0;j<n;j++){
                if(board[j][i]!='.'  && h.contains(board[j][i]) ) return false;
                if(board[j][i]!='.') h.add(board[j][i]);
            }
        }
        for(int r=0;r<n;r+=3){
            for(int c=0;c<n;c+=3){
                HashSet<Character> h=new HashSet<>();
                for(int i=r;i<r+3;i++ ){
                    for(int j=c;j<c+3;j++){
                        if(board[i][j]!='.'  && h.contains(board[i][j]) ) return false;
                        if(board[i][j]!='.')h.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}
