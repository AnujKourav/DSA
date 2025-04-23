package physicsWallah.backtracking;

public class MaxKnight {
    static int maxCount = 0;
    public static void main(String[] args) {
        int n = 4;
        int [][]board = new int[n][n];
        nKnight(board,0,0,0);
        System.out.println(maxCount);
    }
    public static void nKnight(int [][]board,int row,int col,int count){
        int n = board.length;
        if (row == n) {
            maxCount = Math.max(maxCount, count);
            return;
        }
        if(col == n){
            nKnight(board,row+1,0,count);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col] = 1;
            nKnight(board,row,col+1,count+1);
            board[row][col] = 0;
        }
        nKnight(board,row,col+1,count);
    }
    public static boolean isSafe(int [][]grid,int row,int col){
        int n = grid.length;
        int i,j;
        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if(i>=0 && j<n && grid[i][j] == 1) return false;
        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if(i>=0 && j>=0 && grid[i][j] == 1) return false;
        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if(i<n && j<n && grid[i][j] == 1) return false;
        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if(i<n && j>=0 && grid[i][j] == 1) return false;
        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if(i>=0 && j<n && grid[i][j] == 1) return false;
        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if(i<n && j<n && grid[i][j] == 1) return false;
        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if(i>=0 && j>=0 && grid[i][j] == 1) return false;
        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if(i<n && j>=0 && grid[i][j] == 1) return false;
        return true;
    }
}
