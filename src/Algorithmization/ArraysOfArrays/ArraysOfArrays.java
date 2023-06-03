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
            for (int j = i; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
                break;
            }
        }
    }
}
