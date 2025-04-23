package physicsWallah.backtracking;

public class validSudoku {
    public static boolean isValid(String [][]board,int row,int col,String num){
        //check row
        for(int j=0;j<9;j++){
            if(board[row][j].equals(num))return false;
        }
        //check column
        for(int i=0;i<9;i++){
            if(board[i][col].equals(num))return false;
        }
        //check 3x3 grid
        int x = row/3 * 3;
        int y = col/3 * 3;
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                if(board[i][j].equals(num))return false;
            }
        }
        return true;
    }
    public static boolean isValidSudoku(String[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j].equals("."))continue;
                String num = board[i][j];
                // Temporarily remove the current number to avoid self-checking
                board[i][j] = ".";
                if(!isValid(board,i,j,num))return false;
                board[i][j] = num;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String [][]board =  {{"5","3",".",".","7",".",".",".","."},
                             {"6",".",".","1","9","5",".",".","."},
                             {".","9","8",".",".",".",".","6","."},
                             {"8",".",".",".","6",".",".",".","3"},
                             {"4",".",".","8",".","3",".",".","1"},
                             {"7",".",".",".","2",".",".",".","6"},
                             {".","6",".",".",".",".","2","8","."},
                             {".",".",".","4","1","9",".",".","5"},
                             {".",".",".",".","8",".",".","7","9"}};
        System.out.println(isValidSudoku(board));
    }
}
