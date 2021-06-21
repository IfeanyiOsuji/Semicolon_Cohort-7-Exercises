package africa.semicolon.deitelExercises.tddTest;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        int [][] grid = {{5, 3, 4, 6, 7, 8,9,1,2},
                        {6, 7, 2, 1, 9, 5,3,4,8},
                         {1, 9, 8, 3, 4, 2,5,6,7},
                        {8, 5, 9, 7, 6, 1,4,2,3},
                        {4, 2, 6, 8, 5, 3,7,9,1},
                        {7, 1, 3, 9, 2, 4,8,5,6},
                        {9, 6, 1, 5, 3, 7,2,8,4},
                         {2, 8, 7, 4, 1, 9,6,3,5},
                        {3, 4, 5, 2, 8, 6,1,7,9}
        };
        System.out.println(isValid(grid) ? "ValidSolution" : "InvalidSolution");
    }

    private static boolean isValid(int [][] grid) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(i==9 || j==9 || !isValid(i, j, grid))
                    return false;
            }
        }
        return true;
    }

    private static boolean isValid(int i, int j, int[][] grid) {
        for(int column =0; column<9; column++){
            if(column !=j && grid[i][column] == grid[i][j])
                return false;
        }
        for(int row = 0; row<9; row++){
            if(row !=i && grid[row][j] ==grid[i][j])
                return false;
        }
        for(int row = (3 * i/3)+3; row< (3 * i/3)+3; row++){
            for(int column =(3 * i/3)+3; column< (3 * i/3)+3; column++)
                if(row !=i && column!=j && grid[row][column] == grid[i][j])
                    return false;
        }
        return true;
    }
}
