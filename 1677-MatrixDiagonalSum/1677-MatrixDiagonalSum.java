// Last updated: 2/4/2026, 3:32:58 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i=0, j=mat.length-1; i<mat.length; i++, j--) {
            sum += mat[i][i];
            if (i != j) sum += mat[i][j]; 
        }
        return sum;
    }
}