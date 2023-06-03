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
}
