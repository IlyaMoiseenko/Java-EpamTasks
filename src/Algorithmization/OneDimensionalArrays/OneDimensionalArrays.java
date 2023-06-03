package Algorithmization.OneDimensionalArrays;

public class OneDimensionalArrays {
    /*
    В массив A [N] занесены натуральные числа.
    Найти сумму тех элементов, которые кратны данному К.
    */
    public int task_1(int[] array, int k) {
        int sum = 0;

        for (int j : array)
            if (j % k == 0)
                sum += j;

        return sum;
    }

    /*
    Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
    */
    public int task_2(int[] array, int z) {
        int count = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] > z) {
                array[i] = z;
                count++;
            }

        return count;
    }

    /*
    Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов
    */
    public void task_3(int[] array) {
        int countPositiveNumbers = 0;
        int countNegativeNumbers = 0;
        int countZeroNumbers = 0;

        for (int j : array) {
            if (j > 0) countPositiveNumbers++;
            else if (j < 0) countNegativeNumbers++;
            else countZeroNumbers++;
        }
    }

    /*
    Даны действительные числа а1 ,а2 ,..., аn .
    Поменять местами наибольший и наименьший элементы.
    */
    public void task_4(int[] array) {
        int maxElement = array[0];
        int minElement = array[0];

        for (int j : array) {
            if (j > maxElement) maxElement = j;
            else if (j < minElement) minElement = j;
        }
    }

    /*
    Даны целые числа а1 ,а2 ,..., аn .
    Вывести на печать только те числа, для которых аi > i.
    */
    public void task_5(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] > i)
                System.out.println(array[i]);
    }

    /*
    Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, порядковые номера которых являются простыми числами.
    */
    public double task_6(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++)
            if (isSimple(i))
                sum += array[i];

        return sum;
    }

    public boolean isSimple(int number) {
        if(number < 2) return false;

        for(int i = 2; i < number / 2; i++)
            if(number % i == 0)
                return false;

        return true;
    }
}
