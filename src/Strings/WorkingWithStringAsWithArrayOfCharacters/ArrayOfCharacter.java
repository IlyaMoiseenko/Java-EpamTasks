package Strings.WorkingWithStringAsWithArrayOfCharacters;

public class ArrayOfCharacter {
    /*
    Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
    */
    public String[] task_1(String[] variablesCamelCase) {
        String[] snake_case = new String[variablesCamelCase.length];

        for (int i = 0; i < variablesCamelCase.length; i++) {
            StringBuilder variable_snake_case = new StringBuilder();

            for (int j = 0; j < variablesCamelCase[i].length(); j++) {
                if (Character.isLowerCase(variablesCamelCase[i].charAt(j)))
                    variable_snake_case.append(variablesCamelCase[i].charAt(j));
                else {
                    variable_snake_case.append("_");
                    variable_snake_case.append(Character.toLowerCase(variablesCamelCase[i].charAt(j)));
                }
            }

            snake_case[i] = variable_snake_case.toString();
        }

        return snake_case;
    }

    /*
    Замените в строке все вхождения 'word' на 'letter'
    */
    public String task_2(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("word"))
                newSentence.append("letter" + " ");
            else
                newSentence.append(words[i]).append(" ");
        }

        return newSentence.toString();
    }

    /*
    В строке найти количество цифр
    */
    public int task_3(String sentence) {
        int countDigits = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i)))
                countDigits++;
        }

        return countDigits;
    }
}
