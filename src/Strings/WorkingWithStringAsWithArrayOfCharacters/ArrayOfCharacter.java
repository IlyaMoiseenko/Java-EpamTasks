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
}
