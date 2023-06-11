package Algorithmization.ArraysOfArrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysOfArrays {
    /*
    Дана матрица. Вывести на экран все нечетные столбцы,
    у которых первый элемент больше последнего.
    */
    public void task_1(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(matrix[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }

    /*
    Дана квадратная матрица.
    Вывести на экран элементы, стоящие на диагонали.
    */
    public void task_2(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
    }

    /*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/
    public void task_3(int[][] matrix, int rowIndex, int columnIndex) {
        System.out.println(matrix[rowIndex][columnIndex]);
    }

    /*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    {1 2 3 ... n}
    {n n-1 n-2 ... 1}
    {1 2 3 ... n}
    {n n-1 n-2 ... 1}
    */
    public int[][] task_4(int n) throws Exception {
        if (n % 2 != 0) throw new Exception("n must be even");

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            if (_checkIndex(i)) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = n - j;
                }
            } else {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = j + 1;
                }
            }
        }

        return matrix;
    }

    private boolean _checkIndex(int index) {
        return index % 2 != 0;
    }

    /*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    {1 1 1 1 1}
    {2 2 2 2 0}
    {3 3 3 0 0}
    {4 4 0 0 0}
    */
    public int[][] task_5(int n) throws Exception {
        if (n % 2 != 0) throw new Exception("n must be even");

        int[][] matrix = new int[n][n];
        int count = matrix.length;

        for (int i = 0; i <= matrix.length; i++) {
            count -= 1;
            for (int j = 0; j <= count; j++) {
                matrix[i][j] = i + 1;
            }
        }

        return matrix;
    }

    /*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    {1 1 1 1 1 1 1 1}
    {0 1 1 1 1 1 1 0}
    {0 0 1 1 1 1 0 0}
    {0 0 0 1 1 0 0 0}
    {0 0 0 1 1 0 0 0}
    {0 0 1 1 1 1 0 0}
    {0 1 1 1 1 1 1 0}
    {1 1 1 1 1 1 1 1}
    */
    public int[][] task_6(int n) throws Exception {
        if (n % 2 != 0) throw new Exception("n must be even");

        int[][] matrix = new int[n][n];
        int start = 0;
        int end = matrix.length;

        for (int i = 0; i < matrix.length; i++) {
            if (i < matrix.length / 2) {
                end -= 1;

                for (int j = start; j <= end; j++) {
                    matrix[i][j] = 1;
                }

                start += 1;
            } else {
                start -= 1;

                for (int j = start; j <= end; j++) {
                    matrix[i][j] = 1;
                }

                end += 1;
            }
        }

        return matrix;
    }

    /*
    Сформировать квадратную матрицу порядка N по правилу:
    Math.sin(Math.pow(i, 2) - Math.pow(j, 2) / n);
    */
    public double[][] task_7(int n) throws Exception {
        if (n % 2 != 0) throw new Exception("n must be even");

        double[][] matrix = new double[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.sin(Math.pow(i, 2) - Math.pow(j, 2) / n);
            }
        }

        return matrix;
    }

    /*
    В числовой матрице поменять местами два столбца любых столбца, т. е.
    все элементы одного столбца поставить на соответствующие им позиции другого,
    а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
    */
    public int[][] task_8(int[][] matrix, int numberOfCol, int numberOfCol2) throws Exception {
        if (numberOfCol2 > matrix.length) throw new Exception();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j > numberOfCol2) break;

                if (j == numberOfCol) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][numberOfCol2];
                    matrix[i][numberOfCol2] = temp;
                }
            }
        }

        return matrix;
    }

    /*
    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
    Определить, какой столбец содержит максимальную сумму.
    */
    public int task_9(int[][] matrix) {
        boolean key = true;
        int maxSum = 0;
        int colIndex = 0;

        while (key) {
            int currentSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                currentSum += matrix[i][colIndex];
            }

            colIndex += 1;
            if (colIndex > matrix.length - 1)
                key = false;

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    /*
    Найти положительные элементы главной диагонали квадратной матрицы.
    */
    public void task_10(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0)
                System.out.println(matrix[i][i]);
        }
    }

    /*
    Матрицу 10x20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
    */
    public void task_11(int[][] matrix) {
        int countNumberFive = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 5)
                    countNumberFive += 1;

                if (countNumberFive >= 3) {
                    System.out.println(i);
                    break;
                }
            }

            countNumberFive = 0;
        }
    }

    public void _printMatrix(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " | ");
            }

            System.out.println();
        }
    }

    /*
    Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    */
    public Integer[][] task_12(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            Arrays.sort(matrix[i]);

        for (int i = 0; i < matrix.length; i++)
            Arrays.sort(matrix[i], Collections.reverseOrder());

        return matrix;
    }

    /*
    Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    */
    public int[][] task_13(int[][] matrix) {
        // по убыванию
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (matrix[i][k] > matrix[j][k]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[j][k];
                        matrix[j][k] = temp;
                    }
                }
            }
        }

        // по возрастанию
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (matrix[i][k] < matrix[j][k]) {
                        int temp = matrix[j][k];
                        matrix[j][k] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }

        return matrix;
    }

    /*
    Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    */
    public int[][] task_15(int[][] matrix) {
        int maxElement = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                if (matrix[i][j] > maxElement)
                    maxElement = matrix[i][j];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                if (matrix[i][j] % 2 != 0)
                    matrix[i][j] = maxElement;

        return matrix;
    }
}
