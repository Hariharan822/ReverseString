public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int primaryDiagonal = primarySum(matrix);
        int secondaryDiagonal = secondarySum(matrix);

        System.out.println("Sum of primary diagonal is " + primaryDiagonal);
        System.out.println("Sum of secondary diagonal is " + secondaryDiagonal);
    }

    public static int primarySum(int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static int secondarySum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][n - 1 - i];
        }
        return sum;
    }
}
