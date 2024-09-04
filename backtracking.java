  import java.util.*;
 public class backtracking {
    // public static void printPermutation(String str, String perm, int idx){
    // if(str.length() == 0){
    // System.out.println(perm);
    // return;
    // }
    // for(int i=0; i<str.length(); i++){
    // char currChar = str.charAt(i);
    // String newStr = str.substring(0, i) + str.substring(i+1);
    // printPermutation(newStr, perm + currChar, idx+1); //call for next position
    // }
    // }
     //public static void main(String args[]){//
     
    // String str = "ABC";
    // printPermutation(str, "", 0);

    // }
    // } ///time comlexity O(n*n!)(steps ek answer kai liye * total anwers)
    // Que2.
    public boolean isSafe(int row, int col, char[][] board){
        //horizontally check
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical
        for(int i=0; i<board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //uper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
          r = row;
        for(int c=col; c<board.length && r>=0; r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower left
        r = row;
        for( int c=col; c>=0 && r<board.length; r++, c--){
             if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower right
        for(int c=col; c<board.length && r<board.length; c++, r++){
             if(board[r][c] == 'Q'){
                return false;
            }

        }
        return true;
    }
    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newboard = new ArrayLists<>();
        for(int i=0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q')
                    row += 'Q';
                    else
                    row += '.';

                }
                newboard.add(row);
            }
            allBoards.add(newboard);
        }
    
    public void helper(char[][] board, List<List<String>> allBoards, int col) {// recursive funtion for backtracking
        if(col == board.length){
          saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) { // queen ko place karwana hai
            if (isSafe(row, col, board)) { // check position is safe for queen or not//
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);  //agli queen ko place karayaAA
                board[row][col] = '.';

            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayLists<>(); // board ko list list string store
        char[][] board = new char[n][n]; // board ko two d array not list
        helper(board, allBoards, 0); // main function ko call
        return allBoards;
    }
}
 
 