package matrixmanupulation;

import static matrixmanupulation.MatrixManipulation.*;

public class Main {

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int[][] resultAddition = addMatrices(A, A); // A + A
        int[][] resultMultiplication = multiplyMatrices(A, B); // A * B
        int[][] resultTranspose = transposeMatrix(A); // A^T

        System.out.println("Matrix Addition:");
        printMatrix(resultAddition);

        System.out.println("Matrix Multiplication:");
        printMatrix(resultMultiplication);

        System.out.println("Matrix Transposition:");
        printMatrix(resultTranspose);
    }

}
