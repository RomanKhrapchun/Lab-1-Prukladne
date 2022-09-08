public class Task_5 {
    public static void main(final String[] args) {
        final int[][] matrix = { {1, 2, 3}, {4, 5, 6} };
        System.out.println("Current matrix is : ");
        output(matrix);
        System.out.println("Transponed matrix is : ");
        final int[][] transMat = transpose(matrix);
        output(transMat);
        }

    public static int[][] transpose(final int[][] matrix) {
        final int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void output(final int[][] matrix) {
        for(final int[] row : matrix) {
            for (final int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
