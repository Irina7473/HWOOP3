package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Matrix<T> {
    Object[][] array;
    int rows;
    int columns;

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }

    public void MatrixRundom(){
        array = new Double[rows][columns];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                int r = (int) (Math.random() * 10);
                array[i][j] = Double.valueOf(r);
            }
        }
    }
    public void MatrixFilling() throws IOException {
        Scanner in = new Scanner(System.in);
        array = new String[rows][columns];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                System.out.println("Введите элемент матрицы");
                array[i][j] = in.next();
            }
        }
    }
    public void Show(){
        System.out.println("Матрица : ");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

    public Double Max() {
        Double max = (Double)array[0][0];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++)
                if ((Double)array[i][j] > max) max = (Double)array[i][j];
        }
        return max;
    }

    public Double Min() {
        Double min = (Double)array[0][0];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++)
                if ((Double)array[i][j] < min) min = (Double)array[i][j];
        }
        return min;
    }
    public Double AVG() {
        Double sum=0.0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                sum += (Double) array[i][j];
        }
        return sum / (rows * columns);
    }

    public Matrix<T> Summa(Matrix<T> m) {
        if (this.rows == m.rows && this.columns == m.columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++)
                    this.array[i][j] = (Double)this.array[i][j] +(Double)m.array[i][j];
            }
        }
        return this;
    }

    public Matrix<T> Residual(Matrix<T> m) {
        if (this.rows == m.rows && this.columns == m.columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++)
                    this.array[i][j] = (Double)this.array[i][j] - (Double)m.array[i][j];
            }
        }
        return this;
    }
}
