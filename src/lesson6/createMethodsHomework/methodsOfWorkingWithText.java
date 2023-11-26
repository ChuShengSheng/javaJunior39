package lesson6.createMethodsHomework;

public class methodsOfWorkingWithText {

    /**
     * Метод принимает входящими параметрами текст,
     * и возвращает кол-во гласных букв в тексте
     */

    public static int TotalCountOfVowelsInString () {
        String string = "Java programming language";
        int countOfVowels = 0;
        for (int i = 0; i < string.length(); i++) {

            // проверяем, является i гласной

            if (string.charAt(i) == 'a' || string.charAt(i) == 'o'
                    || string.charAt(i) == 'i'
                    || string.charAt(i) == 'u'
                    || string.charAt(i) == 'e') {

                // подсчитывать приращения, если в слове есть гласная
                countOfVowels++;
            }
        }
        // отобразить общее количество гласных в строке
        System.out.println("Общее количество гласных в строке равно: " + countOfVowels);

        return countOfVowels;
    }

    /**
     * Метод принимает входящими параметрами текст,
     * печатает на консоль этот же текст,
     * только в обратном порядке
     */

    public static void PrintStringInReversOrder() {
        String string = "Java programming language";
        char[] reverseArray = string.toCharArray(); // Преобразуем строку string в массив символов (char)
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i]);
        }
    }

    /**
     * Метод принимает входящими параметрами текст,
     * и печатает на консоль
     * сколько в тексте знаков пунктуации
     */

    public static void PrintPunctuationCharacterInString() {
        String string = "Ingredients: Aqua, Glycerin, Camellia Sinensis Leaf Extract, Parfum.";
        int countPunctuationCharacter = 0;
        for (int i = 0; i < string.length(); i++) {

            // проверяем, является i знаком пунктуации

            if (string.charAt(i) == ':' || string.charAt(i) == ','
                    || string.charAt(i) == '.') {

                // подсчитывать приращения, если в строке есть знак пунктуации

                countPunctuationCharacter++;
            }
        }
        // отобразить общее количество знаков пунктуации в строке
        System.out.println("Общее количество знаков пунктуации в строке равно: " + countPunctuationCharacter);
    }
}
