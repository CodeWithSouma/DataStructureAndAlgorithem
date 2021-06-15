package com.codewithsouma.practice;

import java.util.Scanner;

public class Matrix {
    private final int[][] matrix;
    private final Scanner scanner = new Scanner(System.in);
    private final int row;
    private final int col;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
    }

    public void inputMatrix() {
        inputMatrix(matrix, 0, 0);
    }

    private void inputMatrix(int[][] matrix, int currentRow, int currentCol) {
        if (currentCol < 0 || currentRow < 0) throw new IllegalStateException();
        if (!validColumn(currentCol)){
            currentCol = 0;
            currentRow++;
            System.out.println("\n");
        }
        if (!validRow(currentRow)) return;
        System.out.printf("Enter value for matrix[%d][%d]: ",currentRow, currentCol);
        matrix[currentRow][currentCol] = scanner.nextInt();
        inputMatrix(matrix,currentRow,++currentCol);
    }

    public void printMatrix(){
        printMatrix(matrix,0,0);
    }

    private void printMatrix(int[][] matrix, int currentRow, int currentCol) {
        if (currentCol < 0 || currentRow < 0) throw new IllegalStateException();
        if (!validColumn(currentCol)){
            currentCol = 0;
            currentRow++;
            System.out.println();
        }
        if (!validRow(currentRow)) return;
        System.out.print(matrix[currentRow][currentCol] + " ");
        printMatrix(matrix,currentRow,++currentCol);
    }

    private boolean validRow(int currentRow) {
        return currentRow < this.row && currentRow >= 0;
    }

    private boolean validColumn(int currentCol) {
        return currentCol < this.col && currentCol >= 0;
    }

}
