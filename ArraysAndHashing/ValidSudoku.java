package ArraysAndHashing;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> s = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.')continue;
                String row = "Row"+i+"Value"+board[i][j];
                String col = "Col"+j+"Value"+board[i][j];
                String box = "Row"+i/3+ "Col"+j/3+"Value"+board[i][j];
                if(!s.add(row) || !s.add(col) || !s.add(box))return false;
            }
        }
        return true;
    }
    
}
