public class Queens {
    static int c=0;
    public static boolean isSafe(char board[][],int row,int col){
       for(int i=row-1;i>=0;i--){
         if(board[i][col]=='Q'){
          return false;
         }
       }

       for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
          if(board[i][j]=='Q'){
            return false;
          }
       }
       for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
        if(board[i][j]=='Q'){
          return false;
        }
     }
       return true;
    }
    public static void nQueen(char board[][],int row){
      if(row==board.length){
       printQueen(board);
       c++;
       return;
      }
      for(int i=0;i<board.length;i++){
         if(isSafe(board,row,i)){
            board[row][i]='Q';
            nQueen(board, row+1);
            board[row][i]='x';
         }
      }
    }
    public static void printQueen(char board[][]){
       System.out.println("------------------------------------------------");
        for(int i=0;i<board.length;i++){
           for(int j=0;j<board.length;j++){
              System.out.print(board[i][j]+" ");
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
          for(int j=0;j<board.length;j++){
           board[i][j]='x';
          }
        }
        nQueen(board,0);
       System.out.println("total no:"+c);
    }
}
