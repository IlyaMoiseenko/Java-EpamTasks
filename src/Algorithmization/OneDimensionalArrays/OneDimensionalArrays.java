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
}
