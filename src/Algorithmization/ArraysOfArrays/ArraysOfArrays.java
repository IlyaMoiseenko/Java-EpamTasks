package Algorithmization.ArraysOfArrays;

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
}
