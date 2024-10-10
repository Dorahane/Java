package ru.mirea.lab4_1.ex1;

public class Matrix {
    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }

    // Установка значения в матрице
    public void setValue(int row, int col, double value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) { // индекс полож, индекс в пред. кол строк в матрице
            data[row][col] = value; // установка самого знач
        } else {
            System.out.println("Индексы за пределами матрицы.");
        }
    }
    // Получение значения из матрицы
    public double getValue(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return data[row][col];
        } else {
            System.out.println("Индексы за пределами матрицы.");
        }
        return 0;
    }

    // Сложение матриц
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Размеры матриц не совпадают.");
        }
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(i, j, this.getValue(i, j) + other.getValue(i, j));
            }
        }
        return result;
    }
    // Умнож на число
    public Matrix umnch(double scalar) {
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(i, j, this.getValue(i, j) * scalar);
            }
        }
        return result;
    }

    // Принт матрицы
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%8.2f ", data[i][j]);
            }
            System.out.println();
        }
    }

    // Умнож матриц
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            System.out.println("Количество столбцов первой матрицы не равно количеству строк второй матрицы.");
        }

        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.setValue(i, j, result.getValue(i, j) + this.getValue(i, k) * other.getValue(k, j));
                }
            }
        }
        return result;
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        Matrix mat1 = new Matrix(2, 2);
        mat1.setValue(0, 0, 1);
        mat1.setValue(0, 1, 2);
        mat1.setValue(1, 0, 3);
        mat1.setValue(1, 1, 4);

        System.out.println("Матрица 1:");
        mat1.print();

        Matrix mat2 = new Matrix(2, 2);
        mat2.setValue(0, 0, 5);
        mat2.setValue(0, 1, 6);
        mat2.setValue(1, 0, 7);
        mat2.setValue(1, 1, 8);

        System.out.println("Матрица 2:");
        mat2.print();

        Matrix sum = mat1.add(mat2);
        System.out.println("Сумма матриц:");
        sum.print();

        Matrix scalarProduct = mat1.umnch(2);
        System.out.println("Матрица 1, умноженная на 2:");
        scalarProduct.print();

        Matrix product = mat1.multiply(mat2);
        System.out.println("Умножение матриц:");
        product.print();
    }
}