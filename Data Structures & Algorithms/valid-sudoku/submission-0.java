class Solution {
    public boolean isValidSudoku(char[][] board) {
 boolean[][] rows = new boolean[9][10]; 
        boolean[][] cols = new boolean[9][10];
        boolean[][] boxes = new boolean[9][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                // Skip empty cells
                if (c == '.') {
                    continue;
                }

                int num = c - '0'; // Convert char '1'-'9' to int 1-9

                // Calculate the 3x3 box index using the same formula
                // Integer division in Java works the same as // in Python for positive numbers
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check if the number is already seen in the current row, col, or box
                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }

                // Mark the number as seen
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}
