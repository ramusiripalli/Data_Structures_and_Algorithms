import java.util.HashSet;

public class IsValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        //prefer string hashset
        HashSet<String> seen = new HashSet();

        int rows = board.length;
        int columns = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                char current_value = board[i][j];
                if (current_value != '.') {
                    //please check the return type of set.add
                    //Return Value: The function returns True if the element is not present in the HashSet
                    // otherwise False if the element is already present in the HashSet.
                    /* Some Example how it stores in HashMap , if it find same string value it returns false
                          0 = "5 found in subbox 0_0"
                          1 = "3 found in subbox 0_0"
                          2 = "5found in column 0"
                          3 = "3found in row 0"
                          4 = "3found in column 1"
                          5 = "5found in row 0"
                    */
                    if (!seen.add(current_value + "found in row " + i) ||
                            !seen.add(current_value + "found in column " + j) ||
                            !seen.add(current_value + " found in subbox " + i / 3 + "_" + j / 3))
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '5', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
     boolean result = isValidSudoku(board);

        System.out.println("Sudoku is valid : " + result);
    }
}
