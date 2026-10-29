void main() {
    int[][] matrix = {
            {42, 2, 3},
            {4, 67, 6},
            {7, 8, 9}
    };

    printMatrix(matrix);
}

private static void printMatrix(int[][] matrix){
    for (int[] line : matrix){
        for (int i : line){
            IO.print(i + " ");
        }
    }
}