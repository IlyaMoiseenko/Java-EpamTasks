package Algorithmization.Sorting;

import java.util.Arrays;

public class Sorting {
    /*
    Заданы два одномерных массива с различным количеством элементов и натуральное число k.
    Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
    при этом не используя дополнительный массив.
    */
    public int[] task_1(int[] array1, int[] array2, int k) throws Exception {
        if (k >= array1.length)
            throw new Exception("Wrong!");

        array1 = Arrays.copyOf(array1, array1.length + array2.length);

        for (int i = 0; i < array2.length; i++) {
            array1[array1.length - array2.length + i] = array1[k];
            array1[k++] = array2[i];
        }

        return array1;
    }

    /*
    Даны две последовательности a1 < a2 < a3 и b1 < b2 < b3.
    Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
    Примечание. Дополнительный массив не использовать.
    */
    public int[] task_2(int[] array1, int[] array2) {
        array1 = Arrays.copyOf(array1, array1.length + array2.length);

        for (int i = 0; i < array2.length; i++) {
            array1[array1.length - array2.length + i] = array2[i];
        }

        Arrays.sort(array1);

        return array1;
    }

    /*
    Сортировка выбором. Дана последовательность чисел a1 < a2 < a3 < a4 .Требуется переставить элементы так,
    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    повторяется. Написать алгоритм сортировки выбором.
    */
    public int[] task_3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxElement = array[i];
            int maxElementIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] > maxElement) {
                    maxElement = array[j];
                    maxElementIndex = j;
                }
            }

            int temp = array[i];
            array[i] = maxElement;
            array[maxElementIndex] = temp;
        }

        return array;
    }

    /*
    Сортировка обменами. Дана последовательность чисел a1 < a2 < a3 < a4.Требуется переставить числа в
    порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1 то делается
    перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
    */
    public int[] task_4(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    isSorted = false;
                }
            }
        }

        return array;
    }
}
