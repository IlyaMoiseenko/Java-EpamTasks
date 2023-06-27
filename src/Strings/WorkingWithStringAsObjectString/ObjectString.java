package Strings.WorkingWithStringAsObjectString;

public class ObjectString {
    /*
    Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
    */
    public int task_1(String text) {
        int maxCountSpace = 0;
        int currentCountSpace = 0;

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                currentCountSpace++;

                maxCountSpace = Math.max(maxCountSpace, currentCountSpace);
            } else
                currentCountSpace = 0;
        }

        return maxCountSpace;
    }
}