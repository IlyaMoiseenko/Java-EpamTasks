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
}
