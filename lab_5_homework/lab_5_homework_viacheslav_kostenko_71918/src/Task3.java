void main() {
    int[][] matrix = new int[10][10];
    int sum = 0;

    for (int i = 0; i <= 9; i++) {
        for (int j = 0; j <= 9; j++) {
            if (i == j) {
                matrix[i][j] = i;
                sum += matrix[i][j];
            } else {
                matrix[i][j] = 0;
            }
        }
    }

    System.out.println("10x10 Matrix: ");

    for (int i = 0; i <= 9; i++) {
        for (int j = 0; j <= 9; j++) {
            System.out.printf("%2d", matrix[i][j]);
        }
        System.out.println();
    }

    System.out.println("Sum of diagonal elements: " + sum);
}