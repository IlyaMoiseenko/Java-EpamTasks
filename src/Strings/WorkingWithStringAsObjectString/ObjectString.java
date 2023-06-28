package Strings.WorkingWithStringAsObjectString;

import java.util.Arrays;

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

    /*
    Из заданной строки получить новую, повторив каждый символ дважды
    */
    public String task_6(String text) {
        StringBuilder newText = new StringBuilder();

        for (char c : text.toCharArray()) {
            newText.append(c);
            newText.append(c);
        }

        return newText.toString();
    }

    /*
    Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
    def", то должно быть выведено "abcdef"
    */
    public String task_7(String text) {
        StringBuilder newText = new StringBuilder(text.replace(" ", ""));

        for (int i = 0; i < newText.length(); i++) {
            for (int j = newText.length() - 1; j > i; j--) {
                if (newText.charAt(i) == newText.charAt(j))
                    newText.deleteCharAt(j);
            }
        }

        return newText.toString();
    }

    /*
    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
    длинных слов может быть несколько, не обрабатывать
    */
    public String task_8(String text) {
        String[] words = text.split(" ");
        StringBuilder maxLengthWord = new StringBuilder(words[0]);

        for (String word : words) {
            if (word.length() > maxLengthWord.length())
                maxLengthWord.replace(
                        0,
                        maxLengthWord.length(),
                        word
                );
        }

        return maxLengthWord.toString();
    }
}
