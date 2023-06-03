package Algorithmization.OneDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

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
            if (_isSimple(i))
                sum += array[i];

        return sum;
    }

    private boolean _isSimple(int number) {
        if(number < 2) return false;

        for(int i = 2; i < number / 2; i++)
            if(number % i == 0)
                return false;

        return true;
    }

    /*
    Дана последовательность целых чисел a1,a2,,an.
    Образовать новую последовательность, выбросив из исходной те члены,
    которые равны min(a1,a2,,an).
    */
    public int[] task_8(int[] array) {
        int min = _min(array);
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min)
                offset++;
            else
                array[i - offset] = array[i];
        }

        return Arrays.copyOf(array, array.length - offset);
    }

    private int _min(int[] array) {
        int min = array[0];

        for (int j : array)
            min = Math.min(min, j);

        return min;
    }

    /*
    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
    Если таких чисел несколько, то определить наименьшее из них.
    */
    public int task_9(int[] array) {
        int currentCounter = 0;
        int biggestCounter = 0;
        int element = array[0];

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j])
                    currentCounter++;
            }

            if (currentCounter > biggestCounter) {
                biggestCounter = currentCounter;
                element = array[i];
            } else if (currentCounter == biggestCounter) {
                if (array[i] < element)
                    element = array[i];
            }

            currentCounter = 0;
        }

        return element;
    }

    /*
    Дан целочисленный массив с количеством элементов п.
    Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
    Примечание. Дополнительный массив не использовать.
    */
    public int[] task_10(int[] array) {
        for (int i = 0; i < array.length; i += 2)
            array[i] = 0;

        return array;
    }
}
