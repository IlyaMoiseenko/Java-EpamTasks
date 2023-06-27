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

    /*
    В строке вставить после каждого символа 'a' символ 'b'
    */
    public String task_2(String text) {
        return text.replace("a", "ab");
    }

    /*
    Проверить, является ли заданное слово палиндромом
    */
    public boolean task_3(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        return word.equals(reverseWord);
    }

    /*
    С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
    */
    public String task_4(String word) {
        return word.charAt(7) + word.substring(3, 5) + word.charAt(7);
    }

    /*
    Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    */
    public int task_5(String text, char findSymbol) {
        int countSymbol = 0;

        for (char c : text.toCharArray()) {
            if (c == Character.toUpperCase(findSymbol) || c == Character.toUpperCase(findSymbol))
                countSymbol++;
        }

        return countSymbol;
    }
}
